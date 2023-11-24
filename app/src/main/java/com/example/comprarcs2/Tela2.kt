package com.example.comprarcs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)


        val ct = findViewById<ImageButton>(R.id.imageButtonct)
        val tr = findViewById<ImageButton>(R.id.imageButtontr)
        var res = 0

        ct.setOnClickListener {
            val intent = Intent(this@Tela2, Tela3::class.java)
            res = 10
            intent.putExtra("resTela2", res)

            startActivity(intent)
        }

        tr.setOnClickListener {
            val intent = Intent(this@Tela2, Tela3::class.java)
            res = 1
            intent.putExtra("resTela2", res)

            startActivity(intent)

        }
    }
}