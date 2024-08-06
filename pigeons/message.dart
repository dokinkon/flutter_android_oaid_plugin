import 'package:pigeon/pigeon.dart';

/// 生成flutter dart以及Android kotlin通信程式碼
/// flutter pub run pigeon --input pigeons/file_message.dart
@ConfigurePigeon(PigeonOptions(
  dartOut: 'lib/src/messages.g.dart',
  dartOptions: DartOptions(),
  kotlinOut:
      'android/src/main/kotlin/com/pkm/flutter_android_oaid_plugin/Messages.g.kt',
  kotlinOptions: KotlinOptions(),
))
@HostApi()
abstract class OAIDApi {
  @async
  String getOAID();
}
