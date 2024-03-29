package devandroid.aragao.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.aragao.applistacurso.R;
import devandroid.aragao.applistacurso.database.ListaVipDB;

public class SplashActivity extends AppCompatActivity {

    public static final int TIME_AOUT_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ListaVipDB db = new ListaVipDB(SplashActivity.this);

        cumutarTelaSplash();
    }

    private void cumutarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent telaPrincipal = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(telaPrincipal);
                finish();

            }
        },TIME_AOUT_SPLASH);
    }
}