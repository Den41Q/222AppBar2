package com.example.a222appbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {

    private TextView textView_result;
    private Button button_ok;
    private Button button_clear;
    private EditText editText_name;
    private EditText editText_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hello_world);
        textView_result = findViewById(R.id.textView_result);
        button_ok = findViewById(R.id.button_ok);
        button_clear = findViewById(R.id.button_clear);
        editText_name = findViewById(R.id.editText_name);
        editText_email = findViewById(R.id.editText_email);

        button_ok.setOnClickListener(clickListener_ok);
        button_clear.setOnClickListener(clickListener_clear);

        textView_result.setText("");
    }

    private void updateTextView() {
        String name = editText_name.getText().toString();
        String email = editText_email.getText().toString();
        textView_result.setText("Подписка на рассылку успешно оформлена для пользователя "
                + name + " на электронный адрес " + email);
    }

    private View.OnClickListener clickListener_ok = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            updateTextView();
        }
    };


    private  View.OnClickListener clickListener_clear = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText_name.setText("");
            editText_email.setText("");
            textView_result.setText("");
        }
    };
}
