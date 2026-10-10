package com.example.deeplinksandbox

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Launcher screen. It does nothing but remind you how to fire the test deep links
 * via adb — the interesting routing lives in [MainDeepLinkActivity].
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = """
                DeepLink Sandbox

                Try from a terminal:

                adb shell am start -a android.intent.action.VIEW \
                  -d "sandbox://deeplink.example.com/detail/42"

                adb shell am start -a android.intent.action.VIEW \
                  -d "sandbox://deeplink.example.com/profile/jin?tab=reviews"
            """.trimIndent()
            textSize = 16f
            setPadding(48, 96, 48, 48)
        })
    }
}
