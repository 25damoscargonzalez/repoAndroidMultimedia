package com.example.listavideojuegos.datos

import com.example.listavideojuegos.modelo.Videojuego

interface RepositorioVideojuegos {
    fun poblar() {
        nuevoVideojuego(
            p = Videojuego("Oscar", "Estudiante 2ºDAM", "LOSCARS")
        )
    }

    //Fun --> Funciones (Son metodos)
    fun nuevoVideojuego(p: Videojuego)
    fun actualizar(id: Int, p: Videojuego)
    fun borrar(id: Int)
    fun buscar(id: Int): Videojuego
    fun longitud(): Int
}
