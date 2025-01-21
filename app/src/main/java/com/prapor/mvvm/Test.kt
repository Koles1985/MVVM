package com.prapor.mvvm

class Test {
    var name:String = "Tom"

    constructor(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Test(name='$name')"
    }


}