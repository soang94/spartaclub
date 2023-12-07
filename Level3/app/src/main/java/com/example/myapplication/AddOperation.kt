package com.example.myapplication

class AddOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
    fun add(): Int {
        return num1 + num2
    }
}