package com.example.color;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dark(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Черный", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void red(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Красный", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void light(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Голубой", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void purple(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Фиолетовый", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void admin(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Разработчик").setMessage("Поддубный Дмитрий").setPositiveButton("Ладно", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}