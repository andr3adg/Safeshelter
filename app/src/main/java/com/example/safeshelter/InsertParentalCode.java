package com.example.safeshelter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InsertParentalCode extends AppCompatActivity {
    private Button insert_button;
    private EditText password_field;
    private TextView back, clear;
    private TextView one, two, three, four, five, six, seven, eight, nine, zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("SafeShelter");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_parental_code);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        password_field = findViewById(R.id.password_field);

        insert_button = findViewById(R.id.button_login);
        insert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InsertParentalCode.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        back = findViewById(R.id.t9_key_backspace);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable editable = password_field.getText();
                int charCount = editable.length();
                if (charCount > 0) {
                    editable.delete(charCount - 1, charCount);
                }
            }
        });

        clear = findViewById(R.id.t9_key_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.setText(null);
            }
        });

        one = findViewById(R.id.t9_key_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("1");
            }
        });

        two = findViewById(R.id.t9_key_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("2");
            }
        });

        three = findViewById(R.id.t9_key_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("3");
            }
        });

        four = findViewById(R.id.t9_key_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("4");
            }
        });

        five = findViewById(R.id.t9_key_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("5");
            }
        });

        six = findViewById(R.id.t9_key_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("6");
            }
        });

        seven = findViewById(R.id.t9_key_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("7");
            }
        });

        eight = findViewById(R.id.t9_key_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("8");
            }
        });

        nine = findViewById(R.id.t9_key_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("9");
            }
        });

        zero = findViewById(R.id.t9_key_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_field.append("0");
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Do nothing or catch the keys you want to block
        return false;
    }
}