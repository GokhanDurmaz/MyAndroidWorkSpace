package com.flowintent.workspace

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

// Extension ları, higher order fonksiyonlarla kullanabiliyoruz.

inline fun Int.pow(pow: Int = 2, scope: (Int) -> Unit) {
    scope.invoke(this.toDouble().pow(pow).toInt())
}

inline fun Int.sqrt(scope: (Int) -> Unit) {
    scope.invoke(sqrt(this.toDouble()).toInt())
}

infix fun Int.abs(scope: (Int) -> Unit) {
    scope.invoke(abs(this))
}

fun main() {
    5.pow { n -> println(n) }
    100.sqrt { n -> println(n) }

    2.pow(3) { n ->
        println(n)
    }

    -50 abs { n -> println(n) }
}


