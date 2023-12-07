package com.example.myapplication

fun main() {
    var continueCalculator = true

    while (continueCalculator) {
        println("첫번째 값을 입력해 주세요")
        var num1 = readln().toInt()
        println("부호를 입력해 주세요")
        var operator = readln()
        println("두번째 값을 입력해 주세요")
        var num2 = readln().toInt()
        val cal = Calculator3(num1, num2)

        val result = when (operator) {
            "+" -> cal.calculatorAdd(num1, num2)
            "-" -> cal.calculatorSubtract(num1, num2)
            "*" -> cal.calculatorMultiply(num1, num2)
            "/" -> cal.calculatorDivide(num1, num2)
            else -> {
                println("부호가 잘못됬습니다.")
            }
        }

        println("결과: $result")

        println("계산기를 더 사용하겠습니까? (Y/N)")
        when (readln()!!.uppercase()) {
            "Y" -> continueCalculator = true
            "N" -> {
                continueCalculator = false
                println("계산기를 종료 합니다")
            }
            else -> println("Y 또는 N을 입력해 주세요.")
        }

    }
}

open class Calculator3(num1: Int, num2: Int){
    var num1 = 0
    var num2 = 0
    init {
        this.num1 = num1
        this.num2 = num2
    }


    fun calculatorAdd(num1: Int, num2: Int): Int {
       return AddOperation(num1, num2).add()
    }

    fun calculatorSubtract(num1: Int, num2: Int): Int {
        return SubtractOperation(num1, num2).subtract()
    }

    fun calculatorMultiply(num1: Int, num2: Int): Int {
        return MultiplyOperation(num1, num2).multiply()
    }

    fun calculatorDivide(num1: Int, num2: Int): Int {
        return DivideOperation(num1, num2).divide()
    }
}