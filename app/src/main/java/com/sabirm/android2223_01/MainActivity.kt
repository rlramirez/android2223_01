package com.sabirm.android2223_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import com.sabirm.android2223_01.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.concurrent.timerTask

//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(3000)

        setTheme(R.style.Theme_Android2223_01)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var boton = findViewById<Button>(R.id.btn_ventana)
        btn_ventana.setOnClickListener(){
            var nombres:String=et_nombres2.text.toString()
            var saltarVentana:Intent = Intent(this, VentanaMensaje::class.java)
            saltarVentana.putExtra("Nombres", nombres)
            //saltarVentana.putExtra("Edad", edad)
            startActivity(saltarVentana)
        //Toast.makeText(applicationContext, "Hola Mundo 2222", Toast.LENGTH_SHORT).show()
        }
        btnGPS.setOnClickListener(){
            var saltarGPS:Intent= Intent(this, SerevicioGPS::class.java)
            startActivity(saltarGPS)
        }
        btn_firebase.setOnClickListener(){
            var saltaFirebase:Intent=Intent(this, Auth_Ativity::class.java)
            startActivity(saltaFirebase)
        }




        /*val btn_2=findViewById<Button>(R.id.btn2)
        btn_2.setOnClickListener{
            val saltar:Intent=Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }
        btn3.setOnClickListener{
            val saltar2:Intent= Intent(this,VentanaFecha::class.java)
            startActivity(saltar2)
        }

        btn1.setOnClickListener(){
            Toast.makeText(applicationContext, "Esto es un mensaje", Toast.LENGTH_SHORT).show()
        }*/

        //variableContantes()
        //tiposDatos()
        //arrays()
        //maps()
        //clases()
        //txtview1.setOnClickListener()
    }

    fun foo() {

        println("Running")
    }

    fun variableContantes(){
        //creacion de variables
        /*
        seccion de comentarios multilinea

         */
        var saludo="Hola Mundo :)";
        saludo="Bienvenido Ramiro"
        println(saludo)

        val contante1= "Paralelo 1"
        val contante2=contante1
        println(contante2)

    }
    fun tiposDatos(){
        val string1="Desarrollo Movil"
        val string2="Bienvenidos"
        val string3= string2+" a la materia de "+string1
        println(string3)

        val edad=18
        val edad2=3
        /*
        * <, >, >=, <=, !=, ==
        * && !!
        * */
        if (edad<18){
            println("Ud es menor de edad")
        }else{
            println("Ud es mayor de edad")
        }

        val pais="Peru"
        when(pais){
            "Peru","Ecuador","Colombia"->{
                println("Hablan español")
            }
            "EEUU"->{
                println("Habla Ingles")
            }
            "Blasil"->{
                println("Hablan portugues")
            }else->println("No hay lenguaje")
        }
    }
    fun arrays(){
        val name= "Ramiro"
        val surname ="Ramirez"
        val university = "UTPL"
        val age = "39"
        val myArray= arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(university)
        myArray.add(age)
        println(myArray)
        myArray.addAll(listOf("Hola", "Curso de android"))
        println(myArray)

        //elimina datos  del array
        myArray.removeAt(4)
        println(myArray)

        //recorrer el array
        myArray.forEach {
            println(it)
        }
    }
    fun maps(){
        var myMap: Map<String,Int> = mapOf()
        //añadir elementos
        myMap= mutableMapOf("Ramiro" to 1, "Pedro" to 2, "Sara" to 5, "6" to 6)
        println(myMap)
        myMap["Carlos"]=7
        myMap.put("Abigail",8)
        println(myMap)
        println(myMap["Samantha"])

        myMap.remove("Ramiro")
        println(myMap)

        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }
        for (x in 9 until 30){
            println(x)
        }
        for (x in 0..10 step 2){
            println(x)
        }
        for (x in 10 downTo 0  step 3){
            println(x)
        }



    }
    fun clases(){
        val juan = Programmer(name = "Ramiro", age=39, arrayOf(Programmer.Language.PYTHON,Programmer.Language.SWIFT, Programmer.Language.JAVASCRIPT))
        println(juan.name)
        juan.code()

    }
}


class Programmer(val name: String, val age: Int, val languages: Array<Language> ) {
   enum class Language{
       KOTLIN,
       SWIFT,
       JAVA,
       JAVASCRIPT,
       PHP,
       PYTHON
       }
    fun code(){
        for (language in languages){
            println("Estoy programando en: "+language)
        }
    }
}

