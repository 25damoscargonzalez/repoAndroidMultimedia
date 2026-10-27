package com.example.aplicacionlista.datos

import com.example.aplicacionlista.modelo.Personaje

class ListaPersonajes : RepositorioPersonajes { //Implementamos la interfaz creada

    private val lista: MutableList<Personaje> = mutableListOf() //Mas o menos es lo mismo que el ArrayList

    override fun nuevoPersonaje(p: Personaje) { //Aqui al sobreescribir un metodo (override) TE OBLIGA A HACERLO
        lista.add(p)
        TODO("Not yet implemented") //Te avisa si te quedan cosas incompletas
    }

    override fun actualizar(id: Int, p: Personaje) {
        lista[id] = p
    }

    override fun borrar(id: Int) {
        lista.removeAt(id)
    }

    override fun buscar(id: Int): Personaje {
        return lista[id]
    }

    override fun longitud(): Int = lista.size //SE PUEDE HACER ASI TAMBIEN EL RETURN

}
