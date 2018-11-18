package com.example.sonof.kotlinandroidhw

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityTest {

    @Test
    fun testCalculate() {
        val instance = MainActivity()
        assertEquals(6, instance.calculate(3))
        assertEquals(120,instance.calculate(5))
    }
}
