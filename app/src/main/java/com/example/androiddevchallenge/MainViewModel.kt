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
            "Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.\n" +
                    "Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\n" +
                    "Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.\n" +
                    "Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.\n" +
                    "Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.",
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
            "In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.\n" +
                    "Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.\n" +
                    "Sed ante. Vivamus tortor. Duis mattis egestas metus.\n" +
                    "Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.\n" +
                    "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\"",
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
            "In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.\n" +
                    "Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.\n" +
                    "Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.\n" +
                    "Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.\"",
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
            "Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.\n" +
                    "Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.\n" +
                    "Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.\n" +
                    "Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.\n" +
                    "Fusce consequat. Nulla nisl. Nunc nisl.\"",
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
            "Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.\n" +
                    "Sed ante. Vivamus tortor. Duis mattis egestas metus.\n" +
                    "Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.\n" +
                    "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\"",
            R.drawable.cat_4
        )
    )
}