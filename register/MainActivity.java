package com.example.register;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView password;
    TextView email;
    TextView username;

    EditText Epassword,Eemail,Eusername;
    Button b1;

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
password=(TextView)findViewById(R.id.password) ;
email=(TextView) findViewById(R.id.email);
username=(TextView) findViewById(R.id.Eusername);

Eusername=(EditText)findViewById(R.id.Eusername);
Epassword=(EditText)findViewById(R.id.Epassword);
Eemail=(EditText)findViewById(R.id.Eemail);
b1=(Button)findViewById(R.id.button) ;
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        username.setText(Eusername.getText().toString());
        password.setText(Epassword.getText().toString());
        email.setText(Eemail.getText().toString());


    }
});
    }
}