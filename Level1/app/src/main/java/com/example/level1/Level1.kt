package com.example.level1

fun main() {
    println("숫자, 연산자, 숫자 순으로 입력해 주세요")
    val calc = Calculator()

    var continueCalculator = true

    while (continueCalculator) {
        var num1 = readlnOrNull()!!.toInt()
        var operator = readlnOrNull()!!.toString()
        var num2 = readlnOrNull()!!.toInt()

        val result = when (operator) {
            "+" -> calc.add(num1, num2)
            "-" -> calc.subtract(num1, num2)
            "*" -> calc.multiply(num1, num2)
            "/" -> calc.divide(num1, num2)
            else -> {
                println("오류가 발생했습니다")
            }
        }

        println("결과: $result")

        println("계산기를 더 사용하겠습니까? (Y/N)")
        when (readlnOrNull()!!.uppercase()) {
            "Y" -> println("숫자, 연산자, 숫자 순으로 입력해 주세요")
            "N" -> {
                continueCalculator = false
                println("종료되었습니다")
            }
            else -> println("Y 또는 N을 입력해 주세요.")
        }

    }
}