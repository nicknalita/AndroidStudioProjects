package com.example.myapplication1.ui;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContadorDias {
    private final String dataInicial;
    private final String dataFinal;

    public ContadorDias(String dataInicial, String dataFinal) {

        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public long retornaDifDias() throws ParseException {

         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         Date dataInicial = sdf.parse(this.dataInicial);
         Date dataFinal = sdf.parse(this.dataFinal);

        Log.i("valor variavel", this.dataInicial);
        Log.i("valor variavel", this.dataFinal);

         long diffEmMill = Math.abs(dataFinal.getTime() - dataInicial.getTime());
        Log.i("valor variavel", Long.toString(diffEmMill));
         long diff = TimeUnit.DAYS.convert(diffEmMill, TimeUnit.MILLISECONDS);
        Log.i("valor variavel", Long.toString(diff));

         return diff;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }
}
