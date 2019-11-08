package com.example.hw13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int image[] = {
                R.drawable.chair,
                R.drawable.crispy,
                R.drawable.egg,
                R.drawable.fat,
                R.drawable.fire,
                R.drawable.five,
                R.drawable.flash,
                R.drawable.sorry,
                R.drawable.nodream,
                R.drawable.decajoins
        };

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().matches("")){
                    Toast toast = Toast.makeText(MainActivity.this,"欄位不能是空白",Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    int imageID = Integer.parseInt(editText.getText().toString());
                    if (imageID >10 || imageID < 1){
                        Toast toast = Toast.makeText(MainActivity.this,"請輸入1~10",Toast.LENGTH_LONG);
                        toast.show();
                    }
                        imageView.setImageResource(image[imageID-1]);
                }
            }
        });

    }
}
