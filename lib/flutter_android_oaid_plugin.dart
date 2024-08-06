import 'package:flutter_android_oaid_plugin/src/messages.g.dart';

class FlutterAndroidOaidPlugin {
  static Future<String> getOAID() {
    final pigeon = OAIDApi();
    return pigeon.getOAID();
  }
}
