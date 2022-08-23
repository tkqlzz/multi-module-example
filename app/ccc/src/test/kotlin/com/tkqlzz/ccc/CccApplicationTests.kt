package com.tkqlzz.ccc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CccApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun temp() {
        Assertions.assertEquals(3, 3)
    }

    @Test
    fun temp2() {
        Assertions.assertEquals(4, 5)
    }

}
