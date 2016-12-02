package xyz.georgihristov.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity1 extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
    }
    public activity1() {
        setActivityName("activity1");
    }
}
