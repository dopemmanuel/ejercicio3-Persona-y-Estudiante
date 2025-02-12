package com.dam1.ejercicio3.src.clases

open class Estudiante(nombre: String, edad: Int, open val carrera: String): Persona(nombre, edad) {

    override fun toString(): String {
        return "Nombre = $nombre, Edad = $edad y su Carrera = $carrera."
    }

    override fun actividad(): String{
        return "$nombre esta estudiando la carrera $carrera."
    }
}