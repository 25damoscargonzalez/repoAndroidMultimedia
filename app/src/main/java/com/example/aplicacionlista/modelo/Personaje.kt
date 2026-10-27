package com.example.aplicacionlista.modelo

class Personaje ( // 3 Constrctores + Atributos + Getters y Setters (TODO JUNTO)
    val nombre: String, //Si no se pone nada es PUBLICO por defecto
    val ocupacion: String,
    val bando: String, //val --> "Te da solo getters" (valor, no se puede cambiar)
    var descripcion: String = "", //var --> "Te da getters y setters (variable, sobreescribes)
    var opinion: Int = 0
) {

}

