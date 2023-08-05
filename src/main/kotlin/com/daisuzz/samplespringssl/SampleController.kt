package com.daisuzz.samplespringssl

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping
    fun hello(): String {
        return "Hello world!"
    }
}
