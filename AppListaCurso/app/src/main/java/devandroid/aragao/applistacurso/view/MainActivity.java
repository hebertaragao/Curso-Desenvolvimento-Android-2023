package devandroid.aragao.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.aragao.applistacurso.R;
import devandroid.aragao.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

        Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}