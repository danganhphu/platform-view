package com.platformview.platform_view

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        flutterEngine
                .platformViewsController
                .registry
                .registerViewFactory("com.platformview.platform_view.LoginWidgetPlugin", LoginWidgetFactory())
    }
}
