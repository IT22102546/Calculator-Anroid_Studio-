package com.example.calculator.models

class Calculator(private val number_1:Double , private val number_2:Double) {

    fun add():Double
    {
        return (number_1+number_2)
    }
    fun subtract() = number_1 - number_2
    fun multiply() = number_1 * number_2
    fun divide() = number_1 / number_2



}