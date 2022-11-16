package ru.fastly.diceroller

class Dice(val sides:Int) {

    fun roll():Int {
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}