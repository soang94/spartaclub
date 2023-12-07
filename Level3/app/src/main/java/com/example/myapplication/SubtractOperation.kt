package com.example.myapplication

class SubtractOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
    fun subtract(): Int {
        return num1 - num2
    }
}