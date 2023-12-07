package com.example.myapplication

class DivideOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
    fun divide(): Int {
        return num1 / num2
    }
}