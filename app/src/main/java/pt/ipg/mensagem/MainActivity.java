package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void enviaMensagem(View view) {
        Intent intent = new Intent(this, MostraMensagem.class);



        EditText editTextNome = (EditText) findViewById(R.id.nome);
        EditText editTextTelefone = (EditText) findViewById(R.id.telefone);
        EditText editTextEmail = (EditText) findViewById(R.id.email);
        EditText editTextIdade = (EditText) findViewById(R.id.idade);
        EditText editTextPeso = (EditText) findViewById(R.id.peso);
        EditText editTextAltura = (EditText) findViewById(R.id.altura);

        String mensagem = editTextNome.getText().toString();
        String mensagem2 = editTextTelefone.getText().toString();
        String mensagem3 = editTextEmail.getText().toString();
        String mensagem4 = editTextIdade.getText().toString();
        String mensagem5 = editTextPeso.getText().toString();
        String mensagem6 = editTextAltura.getText().toString();

        intent.putExtra(App.MENSAGEM,mensagem);
        intent.putExtra(App.MENSAGEM,mensagem2);
        intent.putExtra(App.MENSAGEM,mensagem3);
        intent.putExtra(App.MENSAGEM,mensagem4);
        intent.putExtra(App.MENSAGEM,mensagem5);
        intent.putExtra(App.MENSAGEM,mensagem6);

        startActivity(intent);
    }
}
