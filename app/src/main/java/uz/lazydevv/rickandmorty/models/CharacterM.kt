package uz.lazydevv.rickandmorty.models

data class CharacterM(
    val name: String,
    val species: String,
    val gender: String,
    val image: String,
    val isAlive: Boolean,
    val status: String
)
