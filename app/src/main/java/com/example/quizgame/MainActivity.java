package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout python = findViewById(R.id.pythonLayout);
        final LinearLayout js = findViewById(R.id.jsLayout);

        final Button startBtn = findViewById(R.id.startQuizButton);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.selection_background);
                php.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);
                js.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.selection_background);
                java.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);
                js.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "python";

                python.setBackgroundResource(R.drawable.selection_background);
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                js.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "js";

                js.setBackgroundResource(R.drawable.selection_background);
                java.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select the Topic!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}