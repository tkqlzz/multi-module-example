package com.tkqlzz.ccc

import org.springframework.stereotype.Service

@Service
class CccService {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun addRepeat(a: Int, b: Int, n: Int): Int {
        if (n == 0) {
            return 0
        }
        return add(a, b) + addRepeat(a, b, n - 1)
    }
}