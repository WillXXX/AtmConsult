package com.example.atmconsult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clientes.setOnClickListener {
            val intent = Intent(this,DetalheClienteActivity::class.java)
            startActivity(intent)
        }

        button_empresa.setOnClickListener {
            val intent = Intent(this,DetalheEmpresa::class.java)
            startActivity(intent)
        }
    }
}