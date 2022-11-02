package com.sabirm.android2223_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ventana2.*

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        val btn_2=findViewById<Button>(R.id.btn1V2)


        btn_2.setOnClickListener{
            val saltar:Intent=Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}