package com.androidfundamentals

import java.io.Serializable
//EL DATA NO INFLUYE MUCHO EN EL PASO DE LAS VARIABLES, POR RECOMENDACION SI SE HA DE USAR DTO ES MEJOR USAR DATA CLASS
data class Person(val name: String, val age: Int, val country: String): Serializable {
}