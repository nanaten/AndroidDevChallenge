package com.example.androiddevchallenge.model

import java.io.Serializable

data class Pet(
    val id: Int,
    val name: String,
    val identifier: Identifier,
    val type: String,
    val gender: Gender,
    val color: String,
    val age: Int,
    val memo: String,
    val image: Int
): Serializable {
    val genderString get() = if(this.gender == Gender.MALE) "Male" else "Female"
}

enum class Identifier: Serializable {
    CAT,
    DOG
}

enum class Gender: Serializable {
    MALE,
    FEMALE
}