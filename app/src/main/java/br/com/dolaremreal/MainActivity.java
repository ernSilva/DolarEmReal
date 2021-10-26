package br.com.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void converter (View view){

        EditText editDolar;
        EditText editCotacao;
        TextView textResultado;

        editDolar = findViewById(R.id.dolar);
        editCotacao = findViewById(R.id.cotacao);
        textResultado = findViewById(R.id.textResultado);

        Double valorDolar = Double.parseDouble(editDolar.getText().toString());
        Double valorCotacao = Double.parseDouble(editCotacao.getText().toString());

        Double valorConvertido = valorDolar * valorCotacao;
        textResultado.setText("Valor em R$: " + valorConvertido);
        }
    }
