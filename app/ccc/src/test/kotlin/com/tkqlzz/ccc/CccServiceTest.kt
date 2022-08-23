package com.tkqlzz.ccc

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class CccServiceTest {
    @InjectMocks
    lateinit var cccService: CccService

    @Test
    fun add() {
        cccService.add(1, 2)
    }

    @Test
    fun minus() {
        cccService.minus(1, 2)
    }

    @Test
    fun addRepeat() {
        cccService.addRepeat(1, 2, 3)
    }
}