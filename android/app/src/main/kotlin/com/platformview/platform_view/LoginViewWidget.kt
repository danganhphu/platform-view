package com.platformview.platform_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import io.flutter.plugin.platform.PlatformView

internal class LoginViewWidget (context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val view: View

    override fun getView(): View {
        return view
    }

    init {
        view = LayoutInflater.from(context).inflate(R.layout.activity_login, null)
    }

    override fun dispose() {
    }
}