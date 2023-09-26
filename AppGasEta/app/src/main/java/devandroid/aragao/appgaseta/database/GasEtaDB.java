package devandroid.aragao.appgaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";

    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // QUERY para Criar uma tabela

        String sqlTabelaCombustivel = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoCombustivel TEXT, " +
                "precoDoCombustivel REAL, " +
                "recomendacao TEXT)";

        db.execSQL(sqlTabelaCombustivel);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    // Criar métodos para implementar um CRUD
    // C = Create criar o banco de dados e as tabelas
    // Create database nome_do_banco_de_dados.db (SQL)
    // 1 - Nome do Banco de Dados
    // 2 - Verdão do Banco de Dados


    // Cretae table (SQL)

    // R = Retrieve recuperar os dados salvos das tabelas
    // Select * from table (SQL)

    // U = Update alterar os dados que já existem em um registro na tabela
    // Update from table (SQL)

    // D = Delete deletar os dados/registros de uma tabela
    // Delete from (SQL)
}
