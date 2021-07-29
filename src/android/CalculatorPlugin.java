package com.dbresults.calculatorplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.widget.Toast;
import android.app.AlertDialog;  

/**
 * This class echoes a string called from JavaScript.
 */
public class CalculatorPlugin extends CordovaPlugin {
    
    AlertDialog.Builder builder;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            //int arg1 = args.getInt(0);
            //int arg2 = args.getInt(1);

            //int result = arg1 + arg2;
            callbackContext.success(args);
            Toast.makeText(this.cordova.getActivity().getApplicationContext(),"hello", Toast.LENGTH_LONG);
            
            return true;
        }else if(action.equals("addOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 + arg2;
            callbackContext.success(result);
            
            ////alert dialog
            
            builder = new AlertDialog.Builder(this);  
  
            //Setting message manually and performing action on button click  
            builder.setMessage("Do you want to close this application ?")  
                    .setCancelable(false)  
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {  
                        public void onClick(DialogInterface dialog, int id) {  
                            finish();  
                            Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",  
                            Toast.LENGTH_SHORT).show();  
                        }  
                    })  
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {  
                        public void onClick(DialogInterface dialog, int id) {  
                            //  Action for 'NO' Button  
                            dialog.cancel();  
                            Toast.makeText(getApplicationContext(),"you choose no action for alertbox",  
                            Toast.LENGTH_SHORT).show();  
                        }  
                    });  
            
            //Creating dialog box  
            AlertDialog alert = builder.create();  
            //Setting the title manually  
            alert.setTitle("AlertDialogExample");  
            alert.show();  
            
            return true;
        }else if(action.equals("subtractOperation")){
            int arg1 = args.getInt(0);
            int arg2 = args.getInt(1);

            int result = arg1 - arg2;
            callbackContext.success(result);
            Toast.makeText(this.cordova.getActivity().getApplicationContext(),"hello", Toast.LENGTH_LONG).show();
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
