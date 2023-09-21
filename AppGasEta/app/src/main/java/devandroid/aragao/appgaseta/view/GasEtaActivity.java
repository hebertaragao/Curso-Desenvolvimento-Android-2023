package devandroid.aragao.appgaseta.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.aragao.appgaseta.R;
import devandroid.aragao.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    // UtilGasEta utilGasEta = new UtilGasEta();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // utilGasEta.metodoEstatico();
        // UtilGasEta.metodoNaoEstatico();

        Toast.makeText(GasEtaActivity.this,UtilGasEta.mensagem(), Toast.LENGTH_LONG);
    }
}
