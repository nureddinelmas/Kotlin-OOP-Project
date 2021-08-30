package com.nureddinelmas.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Nureddin", 40)
        myUser.age = 25
        myUser.name = "James"
        println(myUser.age)
        println(myUser.name)

        //encapsulation

        var james = Musician("Nureddin", "Piano", 40)
        println(james.age)
        // println(james.instrument) // it doesnt read anything
        james.returnbandName("elmas") // this can be read
        james.returnbandName("nureddin") // but this one can not be read.


        //inheritance

        var lars = SuperMusician("Nureddin", "Guitar", 40)
        println(lars.name)
        println(lars.returnbandName("elmas"))
        lars.sing()

        //polymorphism

        // static polymorphism
        var math = Mathematics()
        math.sum()
        math.sum(10,34)
        math.sum(4,67,23)

        //dynamic polymorphism
        var animal = Animal()
        animal.sing()

        var dog = Dog()
        dog.test()
        dog.sing()


        // abstract and interface

        var piano = Piano()
        piano.brand = "Yamaha"
        piano.digital = false
        println(piano.roomName)
        piano.info()

        //Lambda expressions

        fun printString(myString : String){
            println(myString)
        }

        println("my TEst String")

        val testString = { ThisString: String -> println(ThisString)}

        testString("My lambda String Test")

        val multiply = {x: Int, y:Int -> x * y}
        println(multiply(4,5))

        val multiply2 : (Int, Int) -> Int = {a,b -> a * b}
        println(multiply2(6,5))

        // asynchrous

        //callback  function, Listener function, completion function

        fun downloadMusician(url: String, completion : (Musician) -> Unit){
            // url -> download
            // data
            val musicians = Musician("Kirk", "Guitar", 60)
            completion(musicians)


            downloadMusician("www.youtube.com" { musician -> println(musicians.name) })

        }





    }
}