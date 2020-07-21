package com.example.fileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
  EditText inputFilename,inputContent;
  TextView tv;
  Button readFile,createFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFilename=findViewById(R.id.edit_filename);
        inputContent=findViewById(R.id.edit_content);
        tv=findViewById(R.id.tv);
        //readFile=findViewById(R.id.btn_read_file);
        //createFile=findViewById(R.id.btn_create_file);
        File dir=getFilesDir();
        tv.setText(dir.getAbsolutePath());
    }

    public void onClick(View v) {

    }
}