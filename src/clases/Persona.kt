package com.dam1.ejercicio3.src.clases

open class Persona(val nombre: String, var edad: Int) {

    init{
        require(nombre.isNotEmpty()){ "El nombre no puede estar vacio." }
        require(edad > 0){ "La edad no puede ser menor o igual que 0... o ser negativa."}
    }
    fun cumple(): Int {
        return ++edad
    }
    fun mostrarEdad(): Int {
        println("Edad: $edad")
        return edad
    }

    open fun actividad(): String {
        return "$nombre esta realizando una actividad"
    }
    override fun toString(): String {
        return "Nombre = $nombre, Edad = $edad. "
    }
}