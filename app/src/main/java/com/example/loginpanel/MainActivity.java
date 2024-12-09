package com.example.loginpanel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button przycisk;
    Button przycisk2;
    TextView tekst;
    TextView tekst2;
    TextView tekst3;
    EditText login;
    EditText name;
    EditText haslo;

    boolean odblokowane = false;
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
        haslo=findViewById(R.id.editTextTextPassword);
        haslo.getText();

        login=findViewById(R.id.editTextText);
        login.getText();

        name=findViewById(R.id.editTextText2);
        name.getText();

        tekst=findViewById(R.id.textView4);
        tekst2=findViewById(R.id.textView7);
        tekst3=findViewById(R.id.textView10);

        przycisk=findViewById(R.id.button);
        przycisk2=findViewById(R.id.button2);

        przycisk.setOnClickListener(e -> {

            tekst.setText(haslo.getText());
            tekst2.setText(login.getText());
            tekst3.setText(name.getText());
        });
        przycisk2.setOnClickListener(e->{
            odblokowane = !odblokowane;
            login.setEnabled(odblokowane);
            haslo.setEnabled(odblokowane);
            name.setEnabled(odblokowane);


        });




    }
}