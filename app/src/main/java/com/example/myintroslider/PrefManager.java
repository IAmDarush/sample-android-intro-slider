package com.example.myintroslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Darush on 9/2/2016.
 */
public class PrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared  preferences file name
    private static final String PREF_NAME = "my-intro-slider";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
}
