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
package com.example.androiddevchallenge

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Identifier
import com.example.androiddevchallenge.model.Pet

class MainViewModel : ViewModel() {
    val pets: List<Pet> = listOf<Pet>(
        Pet(
            1,
            "Suzu",
            Identifier.CAT,
            "American Short Hair",
            Gender.FEMALE,
            "Brown",
            1,
            "Nullam porttitor lacus at turpis. " +
                    "Donec posuere metus vitae ipsum. Aliquam non mauris.",
            R.drawable.cat_1
        ),
        Pet(
            2,
            "Maya",
            Identifier.CAT,
            "Siamese",
            Gender.FEMALE,
            "Black",
            6,
            "In hac habitasse platea dictumst." +
                    "Morbi vestibulum, velit id pretium iaculis," +
                    "diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.",
            R.drawable.cat_2
        ),
        Pet(
            5,
            "Taro",
            Identifier.DOG,
            "Golden retriever",
            Gender.MALE,
            "Brown",
            2,
            "In quis justo." +
                    "Maecenas rhoncus aliquam lacus." +
                    "Morbi quis tortor id nulla ultrices aliquet.",
            R.drawable.puppy_1
        ),
        Pet(
            3,
            "Rin",
            Identifier.CAT,
            "mixed",
            Gender.MALE,
            "Gray",
            4,
            "Curabitur gravida nisi at nibh. In hac habitasse platea dictumst." +
                    "Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.",
            R.drawable.cat_3
        ),
        Pet(
            4,
            "Natsume",
            Identifier.CAT,
            "mixed",
            Gender.MALE,
            "Brown",
            2,
            "Aliquam quis turpis eget elit sodales scelerisque." +
                    "Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.",
            R.drawable.cat_4
        )
    )
}