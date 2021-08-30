package com.nureddinelmas.kotlinoopproject

class Dog: Animal() {
    fun test (){
        super.sing()
    }

    override fun sing(){
        println("Dog Skriker!! we are here in Dog Class")
    }
}