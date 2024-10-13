package com.ygcodding.composeuiapplication

data class MarvelChar(
    val charName: String,
    val name: String,
    val imageRes : Int
)

fun getMarvelChar() : List<MarvelChar>{
    return listOf(
        MarvelChar(charName = "Thor", name = "Chris Hemthworth", imageRes = R.drawable.logo),
        MarvelChar(charName = "Black panther", name = "Chadwick boseman", imageRes = R.drawable.logo),
        MarvelChar(charName = "Iron man", name = "Chris Brown", imageRes = R.drawable.logo),
    )
}