package com.luizafmartinez.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        Button botao = findViewById(R.id.botao_salvar);

        botao.setOnClickListener(view ->
                System.out.println("Botão foi clicado"));




    }

    /*public void executar( View view ) {

    }*/






}