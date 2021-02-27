package com.example.androiddevchallenge

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.Pet
import com.example.androiddevchallenge.model.Sex
import com.example.androiddevchallenge.model.Type

class MainViewModel: ViewModel() {
    val pets: List<Pet> = listOf<Pet>(
        Pet(
            1,
            "Laniarius ferrugineus",
            Type.CAT,
            Sex.FEMALE,
            "Brown",
            "Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.\n" +
                    "Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\n" +
                    "Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.\n" +
                    "Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.\n" +
                    "Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus.",
            R.drawable.cat_1
        ),
        Pet(
            2,
            "Ceratotherium simum",
            Type.CAT,
            Sex.FEMALE,
            "Black",
            "In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.\n" +
                    "Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.\n" +
                    "Sed ante. Vivamus tortor. Duis mattis egestas metus.\n" +
                    "Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.\n" +
                    "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\"",
            R.drawable.cat_2
        ),
        Pet(
            3,
            "Acrobates pygmaeus",
            Type.CAT,
            Sex.MALE,
            "Gray",
            "Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.\n" +
                    "Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.\n" +
                    "Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.\n" +
                    "Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.\n" +
                    "Fusce consequat. Nulla nisl. Nunc nisl.\"",
            R.drawable.cat_3
        ),
        Pet(
            4,
            "Dicrostonyx groenlandicus",
            Type.CAT,
            Sex.MALE,
            "Brown",
            "Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis.\n" +
                    "Sed ante. Vivamus tortor. Duis mattis egestas metus.\n" +
                    "Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.\n" +
                    "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.\"",
            R.drawable.cat_4
        )
    )
}