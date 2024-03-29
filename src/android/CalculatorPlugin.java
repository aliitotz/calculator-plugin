package com.dbresults.calculatorplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import android.content.Context;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * This class echoes a string called from JavaScript.
 */
public class CalculatorPlugin extends CordovaPlugin {
    
    AlertDialog.Builder builder;
    Context context;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        context = this.cordova.getActivity().getApplicationContext();
        if (action.equals("coolMethod")) {
            //int arg1 = args.getInt(0);
            //int arg2 = args.getInt(1);

            //int result = arg1 + arg2;
            callbackContext.success(args);
            Toast.makeText(context,"hello", Toast.LENGTH_LONG);
            
            return true;
        }else if(action.equals("addOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 + arg2;
            
            ////alert dialog
            
            builder = new AlertDialog.Builder(context);  
  
            //Setting message manually and performing action on button click  
            builder.setMessage("Do you want to close this application ?")  
                    .setCancelable(false)  
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {  
                        public void onClick(DialogInterface dialog, int id) {  
                            Toast.makeText(context,"you choose yes action for alertbox",  
                            Toast.LENGTH_SHORT).show();  
                        }  
                    })  
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {  
                        public void onClick(DialogInterface dialog, int id) {  
                            //  Action for 'NO' Button  
                            dialog.cancel();  
                            Toast.makeText(context,"you choose no action for alertbox",  
                            Toast.LENGTH_SHORT).show();  
                        }  
                    });  
            
            //Creating dialog box  
            AlertDialog alert = builder.create();  
            //Setting the title manually  
            alert.setTitle("AlertDialogExample");  
            alert.show();  
            
            callbackContext.success(result);
            return true;
        }else if(action.equals("subtractOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 - arg2;
            callbackContext.success(result);
            Toast.makeText(context,"hello", Toast.LENGTH_LONG).show();
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
