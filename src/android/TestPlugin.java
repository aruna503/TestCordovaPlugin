package com.testplugin;

import org.apache.cordova.*;
import org.json.JSONArray;

public class TestPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if ("echo".equals(action)) {
            String message = args.optString(0, "OK");
            callbackContext.success(message);
            return true;
        }
        return false;
    }
}
