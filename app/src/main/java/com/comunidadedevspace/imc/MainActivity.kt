package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.altura)
        val bntcalcular = findViewById<Button>(R.id.bnt_calcular)

        bntcalcular.setOnClickListener {
            val alturaStr: String = edtaltura.text.toString()
            val pesoStr: String = edtpeso.text.toString()

            if(pesoStr == "" || alturaStr == "") {
                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            }else{
                val altura = alturaStr.toFloat()
                val peso = pesoStr.toFloat()
                val resultado = peso/(altura+altura)


            }

        }

    }
}