package com.example.comprarcs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Tela4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)
        val intent = intent
        val result = intent.getIntExtra("resTela4", 0)
        val image = findViewById<ImageView>(R.id.imagemFinal)
        val textofinal = findViewById<TextView>(R.id.textoFim)

        if (result == 12) {
            image.setImageResource(R.drawable.five7_cs)
            textofinal.text = "Five seven"
        }
        if (result == 13) {
            image.setImageResource(R.drawable.mp9_cs)
            textofinal.text = "Mp9"
        }
        if (result == 14) {
            image.setImageResource(R.drawable.awp_ima)
            textofinal.text = "AWP"
        }
        if (result == 3) {
            image.setImageResource(R.drawable.tec9_cs)
            textofinal.text = "Tec-9"
        }
        if (result == 4) {
            image.setImageResource(R.drawable.galil_cs)
            textofinal.text = "Galil AR"
        }
        if (result == 5) {
            image.setImageResource(R.drawable.ak_cs)
            textofinal.text = "AK-47"
        }
    }
}