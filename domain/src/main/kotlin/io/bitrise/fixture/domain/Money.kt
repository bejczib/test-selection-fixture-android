package io.bitrise.fixture.domain

data class Money(val cents: Long, val currency: String) {
    operator fun plus(other: Money): Money {
        require(currency == other.currency) { "currency mismatch" }
        return Money(cents + other.cents, currency)
    }

    fun formatted(): String {
        val whole = cents / 100
        val fraction = Math.abs(cents % 100)
        return "$whole.${fraction.toString().padStart(2, '0')} $currency"
    }
}
