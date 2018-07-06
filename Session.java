package com.vcalazas.utils.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Session {

    public static String setSessiom(Context context, int mode, String group, String kei, String value){
        SharedPreferences preferences = context.getSharedPreferences(group, mode);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(kei, value);
        editor.apply();
        return value;
    }

    public static String getSession(Context context, int mode, String group, String kei, String defaltValue){
        SharedPreferences preferences = context.getSharedPreferences(group, mode);
        return preferences.getString(kei, defaltValue);
    }

}
