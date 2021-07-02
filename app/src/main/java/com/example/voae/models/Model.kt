package com.example.voae.models
import java.net.URL
import kotlinx.coroutines.*
import kotlinx.coroutines.runBlocking

val valenciaOpenApiResponse = runBlocking{
    val lol = URL("http://dadesobertes.gva.es/api/3/action/package_list").readText()
}
