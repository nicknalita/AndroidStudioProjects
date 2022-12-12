package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.ui.CEP;
import com.example.myapplication1.ui.ConsumirJSON;

import java.util.concurrent.ExecutionException;
import com.example.myapplication1.ui.CEP;
import com.example.myapplication1.ui.ConsumirJSON;


public class CepActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscacep);
        Button btnConsultarProg;
        btnConsultarProg = this.<Button>findViewById(R.id.btnConsultar);
        final EditText cep = findViewById(R.id.editCEP);
        final TextView resultado = findViewById(R.id.textResultado);

        btnConsultarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    CEP retorno = new CEP();
                    ConsumirJSON cj = new ConsumirJSON(cep.getText().toString());
                    retorno = cj.execute().get();
                    resultado.setText(retorno.toString());

                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
