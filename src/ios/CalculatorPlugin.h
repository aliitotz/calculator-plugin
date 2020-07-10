#import <Cordova/CDV.h>

@interface CalculatorPlugin : CDVPlugin 

- (void)coolMethod:(CDVInvokedUrlCommand*)command;

- (void)addOperation:(CDVInvokedUrlCommand*)command;
- (void)subtractOperation:(CDVInvokedUrlCommand*)command;
- (void)multiplyOperation:(CDVInvokedUrlCommand*)command;
- (void)divideOperation:(CDVInvokedUrlCommand*)command;

@end