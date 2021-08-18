package com.example.helloworld

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btcalcular = calcular
        val resultado = resultado
        btcalcular.setOnClickListener{
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            val media = (nota1+nota2) /2
            if(media>=6 && faltas<=10){
                resultado.setText("Aluno foi aprovado" + "\n"+ "Nota final: "+ media+"\n"+"Faltas: "+ faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno foi reprovado" + "\n"+ "Nota final: "+ media+"\n"+"Faltas: "+ faltas)
                resultado.setTextColor(Color.RED)
            }




        }
    }
}