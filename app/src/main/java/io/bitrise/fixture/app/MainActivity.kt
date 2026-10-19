package io.bitrise.fixture.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import io.bitrise.fixture.feature.CartViewModel

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vm = CartViewModel.demo()
        vm.load()
        setContentView(TextView(this).apply {
            text = "Total: ${vm.total?.formatted() ?: "-"} (${AppConfig.currency})"
        })
    }
}
