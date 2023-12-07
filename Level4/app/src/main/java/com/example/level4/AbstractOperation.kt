package com.example.level4

abstract class AbstractOperation {
    abstract fun operate(num1: Double, num2: Double): Double
    // 각각 다른 기능을 넣음
}

// operate 기능을 추상화 시킴
// 추상화 - 메소드 본문이 존재x