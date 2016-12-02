package xyz.georgihristov.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity2 extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

    }
    public activity2() {
        setActivityName("activity2");
    }
}
