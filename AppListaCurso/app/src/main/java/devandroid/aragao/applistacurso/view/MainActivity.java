package devandroid.aragao.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.aragao.applistacurso.R;
import devandroid.aragao.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

        Pessoa pessoa;
        Pessoa outraPessoa;

        String dadosPessoa;
        String dadosOutraPessoa;

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

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("(79)9123456789");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        Log.i("POOAndroid", "Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: "+outraPessoa.toString());
    }
}