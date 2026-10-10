package com.example.deeplinksandbox

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.airbnb.deeplinkdispatch.DeepLink

/**
 * Path + query routing: `{user}` comes from the path, `tab` from the query string.
 * Query params are optional and arrive as String extras.
 */
@DeepLink("sandbox://deeplink.example.com/profile/{user}")
class ProfileActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = intent.extras?.getString("user") ?: "(none)"
        val tab = intent.extras?.getString("tab") ?: "(default)"
        setContentView(TextView(this).apply {
            text = "ProfileActivity\nuser = $user\ntab = $tab"
            textSize = 24f
            setPadding(48, 96, 48, 48)
        })
    }
}
