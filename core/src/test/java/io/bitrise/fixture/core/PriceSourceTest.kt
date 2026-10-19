package io.bitrise.fixture.core

import io.bitrise.fixture.domain.Money
import org.junit.Assert.assertEquals
import org.junit.Test

class PriceSourceTest {
    @Test fun staticSourceHasTwoItems() {
        assertEquals(2, StaticPriceSource().prices().size)
    }

    @Test fun applePrice() {
        assertEquals(Money(120, "EUR"), StaticPriceSource().prices()["apple"])
    }
}
