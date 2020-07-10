/********* CalculatorPlugin.m Cordova Plugin Implementation *******/

#import "CalculatorPlugin.h"

@implementation CalculatorPlugin

- (void)coolMethod:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];

    if (echo != nil && [echo length] > 0) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:echo];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)addOperation:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    NSString* echo2 = [command.arguments objectAtIndex:1];

    int result = [echo intValue] + [echo2 intValue];

    if ((echo != nil && [echo length] > 0) && (echo2 != nil && [echo2 length] > 0) ) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"Value_1 and Value_2 must have data, Please provide data."];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)subtractOperation:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    NSString* echo2 = [command.arguments objectAtIndex:1];

    int result = [echo intValue] - [echo2 intValue];

    if ((echo != nil && [echo length] > 0) && (echo2 != nil && [echo2 length] > 0) ) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"Value_1 and Value_2 must have data, Please provide data."];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)multiplyOperation:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    NSString* echo2 = [command.arguments objectAtIndex:1];

    int result = [echo intValue] * [echo2 intValue];

    if ((echo != nil && [echo length] > 0) && (echo2 != nil && [echo2 length] > 0) ) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"Value_1 and Value_2 must have data, Please provide data."];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)divideOperation:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    NSString* echo2 = [command.arguments objectAtIndex:1];

    int result = [echo intValue] / [echo2 intValue];

    if ((echo != nil && [echo length] > 0) && (echo2 != nil && [echo2 length] > 0) ) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"Value_1 and Value_2 must have data, Please provide data."];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
