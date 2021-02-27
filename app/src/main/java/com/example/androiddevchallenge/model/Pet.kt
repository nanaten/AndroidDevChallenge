/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
) : Serializable {
    val genderString get() = if (this.gender == Gender.MALE) "Male" else "Female"
}

enum class Identifier : Serializable {
    CAT,
    DOG
}

enum class Gender : Serializable {
    MALE,
    FEMALE
}
