package io.bitrise.fixture.feature

import io.bitrise.fixture.core.PriceSource
import io.bitrise.fixture.core.StaticPriceSource
import io.bitrise.fixture.domain.Money

class CartViewModel(private val source: PriceSource) {
    var lines: List<Pair<String, Money>> = emptyList()
        private set

    fun load() {
        lines = source.prices().toSortedMap().toList()
    }

    val total: Money?
        get() = lines.map { it.second }.reduceOrNull { acc, m -> acc + m }

    /** String form so that the app module never needs the domain types on its classpath. */
    val totalFormatted: String
        get() = total?.formatted() ?: "-"

    companion object {
        /** Keeps the app module free of a direct core dependency. */
        fun demo(): CartViewModel = CartViewModel(StaticPriceSource())
    }
}
