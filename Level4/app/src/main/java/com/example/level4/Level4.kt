package com.example.level4

fun main() {
    var continueCalculator = true
    var calculator: Calculator?

    while (continueCalculator) {
        println("첫번째 숫자를 입력해 주세요")
        var num1 = readln().toDouble()
        println("연산자 +, - , *, / 중 하나를 입력해 주세요")
        var operator = readln()
        println("두번째 숫자를 입력해 주세요")
        var num2 = readln().toDouble()

        calculator = when (operator) {
            "+" -> Calculator(AddOperation())
            "-" -> Calculator(SubtractOperation())
            "*" -> Calculator(MultiplyOperation())
            "/" -> Calculator(DivideOperation())
            else -> {
                println("연산자 +, - , *, / 중 하나를 입력해 주세요")
                null
            }
        }
        val result = calculator!!.operate(num1, num2)
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
