package com.nureddinelmas.kotlinoopproject

class User {

    // Property
    var name : String? = null
    var age : Int? = null

    // constructor vs init
    constructor(nameInput: String, ageInput: Int){
        this.name = nameInput
        this.age = ageInput
    }
    init {
        println("it can be init ")
    }
}