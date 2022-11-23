package com.sabirm.android2223_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ventana_mensaje.*

class VentanaMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_mensaje)


        var nombre="Luis Jaramillo"

        var extras = intent.extras
        var nombres= extras?.getString("Nombres")?:"Sin nombre"
        var edad=19

        if (edad<18){
            tv_mensaje.setText(nombres+" "+" Ud es menor dfe edad")
        }else{
            tv_mensaje.setText(nombres+" "+" Ud es mayor dfe edad")
        }


        btn_salir.setOnClickListener(){


            var regresarVentana: Intent = Intent(this, MainActivity::class.java)
            startActivity(regresarVentana)
        }
    }


}