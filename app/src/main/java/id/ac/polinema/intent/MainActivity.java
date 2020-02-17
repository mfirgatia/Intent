package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameInput = findViewById(R.id.input_username);
    }
    public void handleExplicitIntent (View view){
        Intent iten = new Intent(this,ExplicitIntentActivity.class);
        startActivity(iten);
    }
    public void handleImplicitIntent(View view){
        Intent iten = new Intent(this,ImplicitIntentActivity.class);
        startActivity(iten);
    }

    public void handleExit (View view){
        Intent iten = new Intent(this,MainActivity.class);
        finish();
    }
}
