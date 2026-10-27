package com.example.listavideojuegos.datos

import com.example.listavideojuegos.modelo.Videojuego

class ListaVideojuegos : RepositorioVideojuegos{
    private val lista: MutableList<Videojuego> = mutableListOf() //Mas o menos es lo mismo que el ArrayList

    override fun nuevoVideojuego(p: Videojuego) { //Aqui al sobreescribir un metodo (override) TE OBLIGA A HACERLO
        lista.add(p)
    }

    override fun actualizar(id: Int, p: Videojuego) {
        lista[id] = p
    }

    override fun borrar(id: Int) {
        lista.removeAt(id)
    }

    override fun buscar(id: Int): Videojuego {
        return lista[id]
    }

    override fun longitud(): Int = lista.size //SE PUEDE HACER ASI TAMBIEN EL RETURN
}

