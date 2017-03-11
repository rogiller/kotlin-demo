package com.kotlin

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Roger Diller on 3/11/17.
 */
class HelloControllerTest {

    val tested:HelloController = HelloController()

    @Test
    fun sayHello() {
        Assert.assertEquals("Hello From Kotlin & Spring Boot!", tested.sayHello())
    }

}