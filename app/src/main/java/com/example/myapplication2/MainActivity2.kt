package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.MainActivity

class MainActivity2 : AppCompatActivity() {
    private var btn_atras: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn_atras = findViewById(R.id.button_atras)
        btn_atras.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        })
    }
}