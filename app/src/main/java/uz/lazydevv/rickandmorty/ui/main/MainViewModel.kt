package uz.lazydevv.rickandmorty.ui.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import uz.lazydevv.rickandmorty.GetCharactersQuery
import uz.lazydevv.rickandmorty.mappers.toCharacterM
import uz.lazydevv.rickandmorty.ui.App

class MainViewModel : ViewModel() {

    var uiState by mutableStateOf(MainActivityUiState())

    fun fetchCharacters() {
        App.apolloClient.query(GetCharactersQuery()).toFlow()
            .onStart { uiState = uiState.copy(isLoading = true) }
            .onEach { characters ->
                uiState = uiState.copy(isLoading = false, data = characters.dataAssertNoErrors.characters?.results?.map {
                    it.toCharacterM()
                } ?: emptyList())
            }
            .catch { uiState = uiState.copy(isLoading = false, isError = true, data = emptyList()) }
            .launchIn(viewModelScope)
    }

}