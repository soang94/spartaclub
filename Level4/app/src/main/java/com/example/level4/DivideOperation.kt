package com.example.level4

import kotlin.jvm.Throws

class DivideOperation: AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Double, num2: Double): Double {
        require(num2.toInt() != 0) {
            ArithmeticException("Divide by zero")
        }
        return num1 / num2
    }
}