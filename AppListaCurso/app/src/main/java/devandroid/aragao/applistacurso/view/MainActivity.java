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

        //Atribuir conteúdo, dados, valores, para o objeto
        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Hebert");
        pessoa.setSobreNome("Aragão");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("(11)999944552273");

    }
}