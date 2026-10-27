package com.example.listavideojuegos

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listavideojuegos.datos.ListaVideojuegos
import com.example.listavideojuegos.modelo.VideojuegoActivity

class MainActivity : AppCompatActivity() {

    companion object { //Creamos un bloque y dentro definimos lo que queremos que sea static
        val listaVideojuegos = ListaVideojuegos()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        listaVideojuegos.poblar()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.bIrVideojuego).setOnClickListener {
            dialogoElegir()
        }

    }

    fun dialogoElegir() {
        val entrada = EditText(this)

        entrada.inputType = InputType.TYPE_CLASS_NUMBER
        entrada.hint = "Número de videojuego"

        AlertDialog.Builder(this) //AlertDialog tiene una subclase que te construye un dialogo de alerta
            .setTitle("Elige un videojuego")
            .setTitle("Introduce un número para elegir el videojuego")
            .setView(entrada) //Todos los elementos se llaman "View"
            .setPositiveButton("Buscar", null)
            .setNegativeButton("Cancelar") { dialog, whichButton -> //diaglog (p0) y whichButton(p1) son parametros vacios
                val num = entrada.text.toString().toInt()

                val intent = Intent(this, VideojuegoActivity::class.java)

            }
            .show()
    }

}