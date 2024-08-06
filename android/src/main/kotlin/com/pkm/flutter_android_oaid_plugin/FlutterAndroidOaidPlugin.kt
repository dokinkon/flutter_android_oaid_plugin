package com.pkm.flutter_android_oaid_plugin

import OAIDApi
import androidx.annotation.NonNull

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

/** FlutterAndroidOaidPlugin */
class FlutterAndroidOaidPlugin: FlutterPlugin {

  override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
    OAIDApi.setUp(
      flutterPluginBinding.binaryMessenger,
      OAIDApiImpl(flutterPluginBinding.applicationContext))
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    OAIDApi.setUp(binding.binaryMessenger, null)
  }
}
