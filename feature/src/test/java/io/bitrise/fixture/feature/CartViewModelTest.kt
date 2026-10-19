package io.bitrise.fixture.feature

import io.bitrise.fixture.core.PriceSource
import io.bitrise.fixture.domain.Money
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class CartViewModelTest {
    @Test fun totalSumsAllLines() {
        val vm = CartViewModel.demo()
        vm.load()
        assertEquals(Money(215, "EUR"), vm.total)
    }

    @Test fun emptyCartHasNoTotal() {
        val vm = CartViewModel(object : PriceSource { override fun prices() = emptyMap<String, Money>() })
        vm.load()
        assertNull(vm.total)
    }
}

// try/feature-tests: test file only
