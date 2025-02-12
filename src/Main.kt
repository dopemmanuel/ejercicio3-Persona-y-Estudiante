package com.dam1.ejercicio3.src

import com.dam1.ejercicio3.src.clases.Persona
import com.dam1.ejercicio3.src.clases.Estudiante


fun main() {
        println("----".repeat(50))
        val persona = Persona("Lucía", 21)
        println(persona.toString())
        persona.mostrarEdad()
        persona.cumple()
        println(persona.toString())
        println(persona.actividad())
        println("----".repeat(50))
        val estudiante = Estudiante("Carlos", 20, "Informática")
        println(estudiante.toString())
        estudiante.mostrarEdad()
        estudiante.cumple()
        println(estudiante.toString())
        println(estudiante.actividad())
}