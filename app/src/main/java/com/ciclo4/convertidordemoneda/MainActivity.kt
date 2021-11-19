package com.ciclo4.convertidordemoneda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoNumero = findViewById<EditText>(R.id.campoNumero)
        val numeroConvertido = findViewById<TextView>(R.id.numeroConvertido)
        val radioEuro = findViewById<RadioButton>(R.id.radioEuro)
        val radioUsd = findViewById<RadioButton>(R.id.radioUsd)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            /*Capturar el texto que entra por el input en una variable y convertirlo a double*/
            var valorPesos = campoNumero.text.toString().toDouble()
            /*Variable donde se almacenara el resultado*/
            var res : String = " "

            if(radioEuro.isChecked){
                res = "EUR ${valorPesos / 4_472}"
            }else if(radioUsd.isChecked){
                res = "USD ${valorPesos / 3_935}"
            }else{
                res = "0.0"
            }

            numeroConvertido.text = res
        }


    }
}