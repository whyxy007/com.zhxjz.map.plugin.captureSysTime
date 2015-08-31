package com.zhxjz.map.plugin;

import java.text.SimpleDateFormat;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * 获取Android系统当前时间
 * 
 * @author yangxy
 * 
 */
public class CaptureSysTime extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
			String date = dateFormat.format(new java.util.Date());
			date = date.replace("-", "T");
			date = date.replaceAll(":", "");
			callbackContext.success(date);
			return true;
		} catch (Exception e) {
			callbackContext.error(e.getMessage());
			return false;
		}
	}

}
