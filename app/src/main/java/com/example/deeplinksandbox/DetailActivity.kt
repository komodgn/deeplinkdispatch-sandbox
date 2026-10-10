package com.example.deeplinksandbox

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.airbnb.deeplinkdispatch.DeepLink

/**
 * Path-parameter routing: `{id}` is extracted from the URI and delivered in the
 * Intent extras under the same key.
 */
@DeepLink("sandbox://deeplink.example.com/detail/{id}")
class DetailActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id = intent.extras?.getString("id") ?: "(none)"
        setContentView(TextView(this).apply {
            text = "DetailActivity\nid = $id"
            textSize = 24f
            setPadding(48, 96, 48, 48)
        })
    }
}
