package com.example.comprarcs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val eco = findViewById<Button>(R.id.buttonEco)
        val forc = findViewById<Button>(R.id.buttonFor)
        val arm = findViewById<Button>(R.id.buttonArm)
        val intent = intent
        var resTela2 = intent.getIntExtra("resTela2", 0)

        eco.setOnClickListener{
            val intent = Intent(this@Tela3, Tela4::class.java)
            resTela2 += 2
            intent.putExtra("resTela4", resTela2)

            startActivity(intent)
        }

        forc.setOnClickListener{
            val intent = Intent(this@Tela3, Tela4::class.java)
            resTela2 += 3
            intent.putExtra("resTela4", resTela2)

            startActivity(intent)
        }
        arm.setOnClickListener{
            val intent = Intent(this@Tela3, Tela4::class.java)
            resTela2 += 4
            intent.putExtra("resTela4", resTela2)

            startActivity(intent)
        }
    }
}