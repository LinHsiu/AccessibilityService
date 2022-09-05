package com.show.accessibilityservice

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class ShowAccessibility : AccessibilityService(){
    private val tag = ShowAccessibility::class.java.simpleName
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d(tag, "event: ${event!!.source.findAccessibilityNodeInfosByViewId("com.show.accessibilityservice:id/text_main").size}")
    }

    override fun onInterrupt() {
        Log.d(tag, "onInterrupt")
    }
}