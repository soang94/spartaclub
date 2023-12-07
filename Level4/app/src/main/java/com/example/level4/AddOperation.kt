package com.example.level4

class AddOperation: AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}
// 단일 책임의 원칙 각각 클랙스들이 하나의 기능들?을 가지고 있음.
// 상위클래스를 상속 받아 오버라이드를 통해 메서드 재정의를 했음 -> 상속, 다형성 (다양하나 까보면 하나??인 느낌)