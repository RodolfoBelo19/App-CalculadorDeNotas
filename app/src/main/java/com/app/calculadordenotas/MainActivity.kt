package com.app.calculadordenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.calculadordenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener {

            val num1 = binding.nt1
            val num2 = binding.nt2
            val num3 = binding.nt3
            val num4 = binding.nt4
            val faltas = binding.nFaltas

            var resultado = binding.txtResultado

            val numero1 = Integer.parseInt(num1.text.toString())
            val numero2 = Integer.parseInt(num2.text.toString())
            val numero3 = Integer.parseInt(num3.text.toString())
            val numero4 = Integer.parseInt(num4.text.toString())
            val tFaltas = Integer.parseInt(faltas.text.toString())

            val media = (numero1 + numero2 + numero3 + numero4) / 4

            if (media>=5 && tFaltas<=20) {
                resultado.setText("Aluno foi aprovado! \n Média final $media")
                resultado.setTextColor(Color.GREEN)
            }else if(tFaltas>20){
                resultado.setText("Aluno foi reprovado por faltas \n Media final $media")
                resultado.setTextColor(Color.RED)
            }else if(media<5){
                resultado.setText("Aluno reprovado por média baixa \n Media final $media")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}