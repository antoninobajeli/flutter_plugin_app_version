package com.bajeli.flutterpluginappversion

import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterPluginAppVersionPlugin(): MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar): Unit {
      val channel = MethodChannel(registrar.messenger(), "flutter_plugin_app_version")
      channel.setMethodCallHandler(FlutterPluginAppVersionPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result): Unit {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android ${android.os.Build.VERSION.RELEASE}")
    } else if (call.method.equals("getAppVersionName")) {
      result.success("vname ${BuildConfig.VERSION_NAME}")
    } else if (call.method.equals("getAppCodeName")) {
      result.success("vcode ${BuildConfig.VERSION_CODE}")
    } else if (call.method.equals("getAppID")) {
      result.success("id ${BuildConfig.APPLICATION_ID}")
    } else{
      result.notImplemented()
    }
  }
}
