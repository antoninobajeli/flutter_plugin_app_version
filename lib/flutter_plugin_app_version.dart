import 'dart:async';

import 'package:flutter/services.dart';

class FlutterPluginAppVersion {
  static const MethodChannel _channel =
      const MethodChannel('flutter_plugin_app_version');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
