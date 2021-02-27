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

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                NavGraph(viewModel)
            }
        }
    }
}

@Composable
fun NavGraph(viewModel: MainViewModel, startDestination: String = "main") {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("main") { MainScreen(viewModel, navController) }
        composable(
            "detail/{petId}",
            arguments = listOf(navArgument("petId") { type = NavType.IntType })
        ) { Detail(viewModel, it.arguments?.getInt("petId", 1) ?: throw Exception("Invalid Id")) }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel, navController: NavHostController) {
    LazyColumn(Modifier.background(Color.White)) {
        items(viewModel.pets) { pet ->
            PetList(pet = pet, onClick = { navController.navigate("detail/${pet.id}") })
        }
    }
}

@Composable
fun PetList(pet: Pet, onClick: () -> Unit) {
    Card(
        elevation = 4.dp, modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(Modifier.clickable { onClick.invoke() }) {
            Image(
                painter = painterResource(id = pet.image),
                contentDescription = null,
                Modifier
                    .height(120.dp)
                    .width(100.dp),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = pet.name,
                    color = Color.Black
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, bottom = 8.dp)
                ) {
                    Text(
                        text = "age:${pet.age}",
                        color = Color.Gray
                    )
                    Text(
                        text = pet.genderString,
                        modifier = Modifier.padding(start = 8.dp),
                        color = Color.Gray
                    )
                    Text(
                        text = pet.color,
                        modifier = Modifier.padding(start = 8.dp),
                        color = Color.Gray
                    )
                }
                Text(
                    text = pet.memo,
                    modifier = Modifier.padding(bottom = 8.dp),
                    color = Color.Gray,
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
fun Detail(viewModel: MainViewModel, petId: Int) {
    Column(
        Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        val pet = viewModel.pets.first { it.id == petId }
        Image(
            painter = painterResource(id = pet.image),
            contentDescription = null,
            Modifier
                .fillMaxWidth()
                .shadow(2.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = pet.name,
            style = TextStyle(fontSize = 20.sp),
            modifier = Modifier.padding(16.dp)
        )
        Column(Modifier.padding(16.dp)) {
            Text("age: ${pet.age}")
            Text("gender: ${pet.genderString}", Modifier.padding(top = 8.dp))
            Text("breed: ${pet.type}", Modifier.padding(top = 8.dp))
            Text("color: ${pet.color}", Modifier.padding(top = 8.dp))
        }
        Text(text = pet.memo, Modifier.padding(16.dp))
    }
}