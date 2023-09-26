package devandroid.aragao.appgaseta.controller;

import android.content.SharedPreferences;

import devandroid.aragao.appgaseta.database.GasEtaDB;
import devandroid.aragao.appgaseta.model.Combustivel;
import devandroid.aragao.appgaseta.view.GasEtaActivity;

public class CombustivelController extends GasEtaDB {

    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreferences;

    public static final String NOME_PREFERENCES = "pref_gaseta";
    public CombustivelController(GasEtaActivity activity){
        super(activity);
        preferences =
                activity.getSharedPreferences(NOME_PREFERENCES,0);

        dadosPreferences = preferences.edit();
    }

    public void salvar(Combustivel combustivel){

        dadosPreferences.putString("Combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("Preodocombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getRecomendacao());
        dadosPreferences.apply();

    }
    public void limpar(){
        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
