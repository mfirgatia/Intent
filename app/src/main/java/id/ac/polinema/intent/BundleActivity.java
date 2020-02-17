package id.ac.polinema.intent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
    }
    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";
}
