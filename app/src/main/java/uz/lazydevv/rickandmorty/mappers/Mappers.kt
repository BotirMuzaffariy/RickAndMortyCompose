package uz.lazydevv.rickandmorty.mappers

import uz.lazydevv.rickandmorty.GetCharactersQuery
import uz.lazydevv.rickandmorty.models.CharacterM

fun GetCharactersQuery.Result?.toCharacterM() = CharacterM(
    name = this?.name ?: "",
    species = this?.species ?: "",
    gender = this?.gender ?: "",
    image = this?.image ?: ""
)