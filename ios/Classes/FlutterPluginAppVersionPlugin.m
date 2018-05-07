#import "FlutterPluginAppVersionPlugin.h"
#import <flutter_plugin_app_version/flutter_plugin_app_version-Swift.h>

@implementation FlutterPluginAppVersionPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterPluginAppVersionPlugin registerWithRegistrar:registrar];
}
@end
