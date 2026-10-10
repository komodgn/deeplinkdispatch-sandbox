package com.example.deeplinksandbox

import com.airbnb.deeplinkdispatch.DeepLinkModule

/**
 * Marks this module for DeepLinkDispatch. The annotation processor generates
 * [AppDeepLinkModuleRegistry] from every @DeepLink in this module at compile time.
 */
@DeepLinkModule
class AppDeepLinkModule
