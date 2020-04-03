package pt.ipg.mensagem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MostraMensagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        Intent intent = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        Intent intent4 = getIntent();
        Intent intent5 = getIntent();
        Intent intent6 = getIntent();

        String mensagem = intent.getStringExtra(App.MENSAGEMNOME);
        String mensagem2 = intent2.getStringExtra(App.MENSAGEMTELEFONE);
        String mensagem3 = intent3.getStringExtra(App.MENSAGEMEMAIL);
        String mensagem4 = intent4.getStringExtra(App.MENSAGEMIDADE);
        String mensagem5 = intent5.getStringExtra(App.MENSAGEMPESO);
        String mensagem6 = intent6.getStringExtra(App.MENSAGEMALTURA);


        TextView textViewMensagem = (TextView) findViewById(R.id.textViewMensagemnome);
        textViewMensagem.setText(mensagem);
        TextView textViewMensagem2 = (TextView) findViewById(R.id.textViewMensagemtelefone);
        textViewMensagem2.setText(mensagem2);
        TextView textViewMensagem3 = (TextView) findViewById(R.id.textViewMensagememail);
        textViewMensagem3.setText(mensagem3);
        TextView textViewMensagem4 = (TextView) findViewById(R.id.textViewMensagemidade);
        textViewMensagem4.setText(mensagem4);
        TextView textViewMensagem5 = (TextView) findViewById(R.id.textViewMensagempeso);
        textViewMensagem5.setText(mensagem5);
        TextView textViewMensagem6 = (TextView) findViewById(R.id.textViewMensagemaltura);
        textViewMensagem6.setText(mensagem6);
    }




}
