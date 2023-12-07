package com.example.level2

class Calculator (){
    init {
        println("숫자, 연산자, 숫자 순으로 입력해 주세요")
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun remainder(num1: Int, num2: Int): Int {
        return num1 % num2
    }
}