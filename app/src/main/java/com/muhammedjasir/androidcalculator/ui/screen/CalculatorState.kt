package com.muhammedjasir.androidcalculator.ui.screen

import com.muhammedjasir.androidcalculator.ui.components.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
