package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun likesTextValue1() {
        val expectedValue = "Понравилось 1 человеку"
        val actualValue = likesText(1)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue2() {
        val expectedValue = "Понравилось 2 людям"
        val actualValue = likesText(2)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue3() {
        val expectedValue = "Понравилось 3 людям"
        val actualValue = likesText(3)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue4() {
        val expectedValue = "Понравилось 4 людям"
        val actualValue = likesText(4)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue10() {
        val expectedValue = "Понравилось 10 людям"
        val actualValue = likesText(10)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue11() {
        val expectedValue = "Понравилось 11 людям"
        val actualValue = likesText(11)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue21() {
        val expectedValue = "Понравилось 21 человеку"
        val actualValue = likesText(21)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue22() {
        val expectedValue = "Понравилось 22 людям"
        val actualValue = likesText(22)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue51() {
        val expectedValue = "Понравилось 51 человеку"
        val actualValue = likesText(51)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue111() {
        val expectedValue = "Понравилось 111 людям"
        val actualValue = likesText(111)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue211() {
        val expectedValue = "Понравилось 211 людям"
        val actualValue = likesText(211)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun likesTextValue311() {
        val expectedValue = "Понравилось 311 людям"
        val actualValue = likesText(311)
        assertEquals(expectedValue, actualValue)
    }
}