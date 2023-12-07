package com.example.myapplication

class MultiplyOperation(num1: Int, num2: Int): Calculator3(num1, num2) {
    fun multiply(): Int {
        return num1 * num2
    }
}