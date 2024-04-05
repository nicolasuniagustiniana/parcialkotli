package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var btn_mensaje: Button? = null
    private var btn_vermensaje: Button? = null
    var text_Mensaje: TextView? = null
    private var edit_mensaje1: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_Mensaje = findViewById(R.id.Mensaje)
        edit_mensaje1 = findViewById(R.id.mensaje1)
        btn_mensaje = findViewById(R.id.button_mensaje)
        btn_mensaje.setOnClickListener(View.OnClickListener {
            text_Mensaje.setText(
                suma(
                    edit_mensaje1.getText().toString().toInt(),
                    edit_mensaje1.getText().toString().toInt()
                ).toString() + ""
            )
        })
        btn_vermensaje = findViewById(R.id.button_vermensaje)
        btn_vermensaje.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        })
    }

    companion object {
        fun suma(a: Int, b: Int): Double {
            return (a + b).toDouble()
        }
    }
}