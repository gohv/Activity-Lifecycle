package xyz.georgihristov.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends LoggingActivity {
    private Button activity1Button;
    private Button activity2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        activity1Button = (Button)findViewById(R.id.activity1Button);
        activity2Button = (Button)findViewById(R.id.activity2Button);

        activity1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity1.class);
                startActivity(intent);
            }
        });

        activity2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity2.class);
                startActivity(intent);
            }
        });


    }

    public MainActivity() {
        setActivityName("MainActivity");
    }
}
