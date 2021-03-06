package com.dbresults.calculatorplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CalculatorPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            //int arg1 = args.getInt(0);
            //int arg2 = args.getInt(1);

            //int result = arg1 + arg2;
            callbackContext.success(args);
            return true;
        }else if(action.equals("addOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 + arg2;
            callbackContext.success(result);
            return true;
        }else if(action.equals("subtractOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 - arg2;
            callbackContext.success(result);
            return true;
        }else if(action.equals("multiplyOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);
            int result = arg1 * arg2;
            callbackContext.success(result);
            return true;
        }else if(action.equals("divideOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 / arg2;
            callbackContext.success(result);
            return true;
        }
        return false;
    }
}
