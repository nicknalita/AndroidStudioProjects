package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication1.ui.ContadorDias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContadorDiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_dias);
        final EditText campoDataInicial = findViewById(R.id.activity_contador_dias_data_inicial);
        final EditText campoDataFinal = findViewById(R.id.activity_contador_dias_data_final);

        final TextView qtDias = findViewById(R.id.resposta_dias);

        Button botaoCalcDias = findViewById(R.id.button_calcular_dias);
        botaoCalcDias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("valor variavel","Erro");
                String dataInicial = campoDataInicial.getText().toString();
                String dataFinal = campoDataFinal.getText().toString();
                long qtdeDias = 0;
                ContadorDias contadorDiasTeste = new ContadorDias(dataInicial, dataFinal);
                try {
                    qtdeDias = contadorDiasTeste.retornaDifDias();
                } catch (ParseException e) {
                    e.printStackTrace();
                Log.i("valor variável", e.getMessage());
                }

                qtDias.setText(qtdeDias + "  DIAS.");

            }
        });

    }

}