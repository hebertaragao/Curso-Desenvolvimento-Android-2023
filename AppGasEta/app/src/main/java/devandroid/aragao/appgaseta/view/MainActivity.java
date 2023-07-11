package devandroid.aragao.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;


import devandroid.aragao.appgaseta.R;
import devandroid.aragao.appgaseta.controller.CursoController;
import devandroid.aragao.appgaseta.controller.PessoaController;
import devandroid.aragao.appgaseta.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    PessoaController controller;
    CursoController cursoController;
    Pessoa pessoa;
    List<String> nomeDosCursos;
    String dadosPessoa;
    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeDoCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //Atribuir conteúdo, dados, valores, para o objeto

        controller = new PessoaController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController();
        nomeDosCursos = cursoController.dadosParaSpinner();

        pessoa = new Pessoa();
        controller.buscar(pessoa);


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        spinner = findViewById(R.id.spinner);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //Adapter
        //Layout
        //Injetar o Adapter ao Spinner - A lista será gerada
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editNomeDoCurso.setText("");
                editTelefoneContato.setText("");

                controller.limpar();
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo!" + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);
            }
        });

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        Log.i("POOandroid", "Objeto pessoa: " + pessoa.toString());
    }
}