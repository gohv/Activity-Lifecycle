package xyz.georgihristov.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by gohv on 02.12.16.
 */

public class LoggingActivity extends AppCompatActivity {

    private String TAG = "LifeCycleOfActivity";
    private String activityName = "";


    protected void setActivityName(String activityName){
        this.activityName = activityName;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG,activityName + " OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,activityName + " onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,activityName + " onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,activityName + " OnDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,activityName + " OnStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,activityName + " OnPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,activityName + " OnRestart");
        super.onRestart();
    }
}
