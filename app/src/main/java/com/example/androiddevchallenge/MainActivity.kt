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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.model.Sex
import com.example.androiddevchallenge.model.Type
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
class MainActions(navController: NavHostController) {
    val onboardingComplete: () -> Unit = {
        navController.navigate("main")
    }
    val selectCourse: (Int) -> Unit = { courseId: Int ->
        navController.navigate("detail/$courseId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}
@Composable
fun MainScreen(viewModel: MainViewModel, navController: NavHostController) {
    Surface(Modifier.background(Color.White)) {
        LazyColumn() {
            items(viewModel.pets) { pet ->
                PetList(pet = pet, onClick = { navController.navigate("detail/${pet.id}") })
                Divider(color = Color.Gray)
            }
        }
    }
}

@Composable
fun PetList(pet: Pet, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Row(Modifier.fillMaxHeight()) {
            Image(
                painter = painterResource(id = pet.image), contentDescription = null,
                Modifier
                    .height(100.dp)
                    .width(100.dp), alignment = Alignment.Center
            )
            Column(Modifier.fillMaxWidth()) {
                Text(
                    text = pet.name, modifier = Modifier
                        .padding(8.dp)
                )
                Row(modifier = Modifier.fillMaxWidth()) {
                    val sex = if (pet.sex == Sex.MALE) "Male" else "Female"
                    Text(text = sex, modifier = Modifier.padding(8.dp), color = Color.Gray)
                    Text(text = pet.color, modifier = Modifier.padding(8.dp), color = Color.Gray)
                    Text(
                        text = pet.memo,
                        modifier = Modifier.padding(8.dp),
                        color = Color.Gray,
                        maxLines = 1
                    )
                }
            }
        }
    }
}

@Composable
fun Detail(viewModel: MainViewModel, petId: Int) {
    Column(Modifier.fillMaxWidth()) {
        val pet = viewModel.pets.first { it.id == petId }
        Image(painter = painterResource(id = pet.image), contentDescription = null)
        Text(text = pet.name)
        Text(text = pet.memo)
    }
}