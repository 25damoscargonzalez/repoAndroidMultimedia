package com.example.aplicacionlista

import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplicacionlista.datos.ListaPersonajes

class MainActivity : AppCompatActivity() {

    companion object { //Creamos un bloque y dentro definimos lo que queremos que sea static
        val listaPersonajes = ListaPersonajes()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        listaPersonajes.poblar()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.bIrPersonaje).setOnClickListener {
            dialogoElegir()
        }

    }

    fun dialogoElegir() {
        val entrada = EditText(this)

        entrada.inputType = InputType.TYPE_CLASS_NUMBER
        entrada.hint = "Número de personaje"

        AlertDialog.Builder(this) //AlertDialog tiene una subclase que te construye un dialogo de alerta
            .setTitle("Elige un personaje")
            .setTitle("Introduce un número para elegir el personaje")
            .setView(entrada) //Todos los elementos se llaman "View"
            .setPositiveButton("Buscar", null)
            .setNegativeButton("Cancelar") { dialog, whichButton -> //diaglog (p0) y whichButton(p1) son parametros vacios
                val num = entrada.text.toString().toInt()
                val personajeSeleccionado = listaPersonajes.buscar(num)

                Log.d("LISTA", personajeSeleccionado.nombre)
            }
            .show() //Mostrar el dialogo del AlertDialog
    }

}