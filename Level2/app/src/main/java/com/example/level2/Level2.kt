package com.example.level2

fun main() {
    val calc = Calculator()

    var continueCalculator = true

    while (continueCalculator) {
        var num1 = readLine()!!.toInt()
        var operator = readLine()!!.toString()
        var num2 = readLine()!!.toInt()

        val result = when (operator) {
            "+" -> calc.add(num1, num2)
            "-" -> calc.subtract(num1, num2)
            "*" -> calc.multiply(num1, num2)
            "/" -> calc.divide(num1, num2)
            "%" -> calc.remainder(num1, num2)
            else -> {
                println("오류가 발생했습니다")
            }
        }

        println("결과: $result")

        println("계산기를 더 사용하겠습니까? (Y/N)")
        when (readLine()!!.uppercase()) {
            "Y" -> println("숫자, 연산자, 숫자 순으로 입력해 주세요")
            "N" -> {
                continueCalculator = false
                println("계산기를 종료 합니다")
            }
            else -> println("Y 또는 N을 입력해 주세요.")
        }

    }
}