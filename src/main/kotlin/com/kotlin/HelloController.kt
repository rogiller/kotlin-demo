package com.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Roger Diller on 3/11/17.
 */

@RestController
class HelloController {

    @GetMapping("")

    fun sayHello() = "Hello From Kotlin & Spring Boot!"

}