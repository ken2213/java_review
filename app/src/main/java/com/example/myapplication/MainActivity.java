package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void handleText(View v) {
       EditText t = findViewById(R.id.source);
       String input = t.getText().toString();
       ((TextView)findViewById(R.id.output)).setText(input);

       Log.d("info name", input);
       Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }


    //    public void disable(View v) {
    //        View myView = findViewById(R.id.button);
    //        myView.setEnabled(false);
    //
    //        Button button = (Button) myView;
    //        button.setText("New Disabled");
    //
    //        /*
    //        v.setEnabled(false);
    //        Log.d("success", "Button Disabled");
    //
    //        Button button = (Button) v;
    //        button.setText("Disabled");
    //        */
    //    }
}