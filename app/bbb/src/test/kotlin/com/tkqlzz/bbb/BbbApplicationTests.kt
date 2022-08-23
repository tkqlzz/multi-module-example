package com.tkqlzz.bbb

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BbbApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun temp() {
		Assertions.assertEquals(2, 2)
	}

}
