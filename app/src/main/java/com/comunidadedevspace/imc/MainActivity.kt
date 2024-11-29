package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.altura)
        val bntcalcular = findViewById<Button>(R.id.bnt_calcular)

        bntcalcular.setOnClickListener {
            val altura: Float = edtaltura.text.toString().toFloat()
            val peso: Float = edtpeso.text.toString().toFloat()
            val resultado = peso/(altura+altura)

            println(resultado)

        }

    }
}