package io.bitrise.fixture.app

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class AppConfigTest {
    @Test fun currencyIsEuro() {
        assertEquals("EUR", AppConfig.currency)
    }

    @Test fun cartLimitIsPositive() {
        assertTrue(AppConfig.maxCartItems > 0)
    }
}
