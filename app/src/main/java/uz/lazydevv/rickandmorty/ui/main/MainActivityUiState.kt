package uz.lazydevv.rickandmorty.ui.main

import uz.lazydevv.rickandmorty.models.CharacterM

data class MainActivityUiState(
    val isLoading: Boolean = true,
    val isError: Boolean = false,
    val data: List<CharacterM> = emptyList()
)
