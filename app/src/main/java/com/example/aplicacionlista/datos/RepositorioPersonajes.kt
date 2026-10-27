package com.example.aplicacionlista.datos

import com.example.aplicacionlista.modelo.Personaje

interface RepositorioPersonajes {

    fun poblar() {
        nuevoPersonaje(
            p = Personaje("Oscar", "Estudiante 2ºDAM", "LOSCARS")
        )
    }

    //Fun --> Funciones (Son metodos)
    fun nuevoPersonaje(p: Personaje)
    fun actualizar(id: Int, p: Personaje)
    fun borrar(id: Int)
    fun buscar(id: Int): Personaje //Devuelve un objeto Personaje
    fun longitud(): Int

}