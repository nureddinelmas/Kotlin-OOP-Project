package com.nureddinelmas.kotlinoopproject

open class Musician(name : String, instrument : String, age: Int) {
    var name :String? = name
    private set
    get

    private var instrument: String? = instrument


    var age: Int? = age
    get
    private set

    private val bandName : String = "Grup Yenicag"

    fun returnbandName(password : String) : String{
        if(password == "elmas"){
            return bandName
        }
        else{
            return "Wrong password!!"
        }
    }

}