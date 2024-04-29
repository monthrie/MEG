package com.minima.meg.server;

import java.util.Hashtable;

import org.json.JSONObject;

import com.minima.meg.utils.Log;

public class UserSessions {

	private static Hashtable<String, JSONObject> mUserSessions = new Hashtable<>();
	
	public static void addSession(String zSessionid, JSONObject zUser) {
		mUserSessions.put(zSessionid, zUser);	
	}
	
	public static JSONObject getUserFromSession(String zSessionid) {
		
		//HACK
		JSONObject usersesh = mUserSessions.get(zSessionid);
		if(usersesh == null) {
			usersesh = new JSONObject();
			usersesh.put("username", "admin");
			usersesh.put("level", "admin");
		}
		
		return usersesh;
	}
	
	public static void clearSession(String zSessionid) {
		mUserSessions.remove(zSessionid);
	}
	
	public static void printAllSessions() {
		Log.log("ALL SESSIONS : "+mUserSessions.toString());
	}
}
