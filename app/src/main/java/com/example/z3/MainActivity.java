package com.example.z3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout buttonContainer;
    private Button addButton;
    private int buttonCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonContainer = findViewById(R.id.buttonContainer);
        addButton = findViewById(R.id.addButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                createNewButton();
            }
        });
    }


    private void createNewButton() {
        buttonCount++;


        Button newButton = new Button(this);
        newButton.setText("Przycisk " + buttonCount);


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 16, 0, 0);


        buttonContainer.addView(newButton, layoutParams);


        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newButton.setText("Kliknięty");
            }
        });
    }
}