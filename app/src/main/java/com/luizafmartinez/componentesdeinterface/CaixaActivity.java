package com.luizafmartinez.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        Button botao = findViewById(R.id.botao_salvar);
        TextInputEditText email = findViewById( R.id.edit_mail );

        botao.setOnClickListener(view -> {
            String emailUsuario = email.getText().toString();
            System.out.println("Email selecionado:" + emailUsuario);
        });
    }

    /*public void executar( View view ) {

    }*/






}