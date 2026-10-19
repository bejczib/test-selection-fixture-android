package io.bitrise.fixture.core

import io.bitrise.fixture.domain.Money

interface PriceSource {
    fun prices(): Map<String, Money>
}

class StaticPriceSource : PriceSource {
    override fun prices(): Map<String, Money> = mapOf(
        "apple" to Money(120, "EUR"),
        "pear" to Money(95, "EUR"),
    )
}

// try/core: touched to exercise selective testing
