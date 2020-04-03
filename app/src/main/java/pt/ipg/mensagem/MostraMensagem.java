package pt.ipg.mensagem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MostraMensagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        Intent intent = getIntent();

        String mensagem = intent.getStringExtra(App.MENSAGEM);
        String mensagem2 = intent.getStringExtra(App.MENSAGEM);
        String mensagem3 = intent.getStringExtra(App.MENSAGEM);
        String mensagem4 = intent.getStringExtra(App.MENSAGEM);
        String mensagem5 = intent.getStringExtra(App.MENSAGEM);
        String mensagem6 = intent.getStringExtra(App.MENSAGEM);


        TextView textViewMensagem = (TextView) findViewById(R.id.textViewMensagem2);
        textViewMensagem.setText(mensagem);
        TextView textViewMensagem2 = (TextView) findViewById(R.id.textViewMensagem3);
        textViewMensagem2.setText(mensagem2);
        TextView textViewMensagem3 = (TextView) findViewById(R.id.textViewMensagem4);
        textViewMensagem3.setText(mensagem3);
        TextView textViewMensagem4 = (TextView) findViewById(R.id.textViewMensagem5);
        textViewMensagem4.setText(mensagem4);
        TextView textViewMensagem5 = (TextView) findViewById(R.id.textViewMensagem6);
        textViewMensagem5.setText(mensagem5);
        TextView textViewMensagem6 = (TextView) findViewById(R.id.textViewMensagem7);
        textViewMensagem6.setText(mensagem6);
    }




}
