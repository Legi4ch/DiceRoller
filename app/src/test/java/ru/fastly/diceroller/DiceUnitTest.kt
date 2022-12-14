package ru.fastly.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DiceUnitTest {
    @Test
    fun randomNumber() {
        val facets = 6
        val dice = Dice(facets)
        val result = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", result in 1..6)
    }
}