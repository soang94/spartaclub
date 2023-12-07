package com.example.level4

class Calculator(private val abstractionOperation: AbstractOperation){
    fun operate(num1: Double, num2: Double): Double {
        return abstractionOperation.operate(num1, num2)
    }
}
// 기존의 add, subtract, multiply, divide 기능을 각각 클래화 시킴
//