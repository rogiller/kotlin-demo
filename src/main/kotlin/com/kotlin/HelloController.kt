package com.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Roger Diller on 3/11/17.
 */

@RestController
class HelloController {

    //The "fun" keyword declares a function. You can directly assign a result to the function as is done here.
    @GetMapping("")
    fun sayHello() = "Hello From Kotlin & Spring Boot!"

    //There is no "new" operator in Kotlin. You invoke the function like a function call.
    @GetMapping("/person")
    fun person() = Person("Roger", "Diller")

}