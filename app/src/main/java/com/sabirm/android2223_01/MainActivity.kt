package com.sabirm.android2223_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        //variableContantes()
        //tiposDatos()
        //arrays()
        //maps()
        clases()
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
        * <, >, >=, >=, !=, ==
        *
        * */
        if (edad2<18){
            println("Ud es menor de edad")
        }else{
            println("Ud es mayor de edad")
        }

        val pais="Argentina"
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

