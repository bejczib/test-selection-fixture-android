package io.bitrise.fixture.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyTest {
    @Test fun addition() {
        assertEquals(Money(425, "EUR"), Money(150, "EUR") + Money(275, "EUR"))
    }

    @Test fun formattingPadsCents() {
        assertEquals("10.05 EUR", Money(1005, "EUR").formatted())
    }
}
