var exec = require('cordova/exec');

exports.coolMethod2 = function (arg0, success, error) {
    cordova.exec(success, error, 'CalculatorPlugin', 'coolMethod', [123,1000]);
};

exports.addOperation = function (value1, value2, success, error) {
    cordova.exec(success, error, 'CalculatorPlugin', 'addOperation', [value1,value2]);
};

exports.subtractOperation = function (value1, value2, success, error) {
    cordova.exec(success, error, 'CalculatorPlugin', 'subtractOperation', [value1,value2]);
};

exports.multiplyOperation = function (value1, value2, success, error) {
    cordova.exec(success, error, 'CalculatorPlugin', 'multiplyOperation', [value1,value2]);
};

exports.divideOperation = function (value1, value2, success, error) {
    cordova.exec(success, error, 'CalculatorPlugin', 'divideOperation', [value1,value2]);
};

