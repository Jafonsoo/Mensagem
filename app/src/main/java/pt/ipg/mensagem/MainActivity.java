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

        String mensagemNome = editTextNome.getText().toString();
        if(mensagemNome.trim().isEmpty()){
            editTextNome.setError("O campo não pode estar vazio");
            return;
        }

        String mensagemTelefone = editTextTelefone.getText().toString();

        if (mensagemTelefone.trim().isEmpty()){
            editTextTelefone.setError("O campo não pode estar vazio");
            return;
        }

        try {
            Integer.parseInt(mensagemTelefone);
        } catch (NumberFormatException e) {
            editTextTelefone.setError("Telefone Inválido");
            return;
        }

        String mensagemEmail = editTextEmail.getText().toString();
        if(mensagemEmail.trim().isEmpty()){
            editTextEmail.setError("O campo não pode estar vazio");
            return;
        }


        String mensagemIdade = editTextIdade.getText().toString();

        if (mensagemIdade.trim().isEmpty()){
            editTextIdade.setError("O campo não pode estar vazio");
            return;
        }

        try {
            Integer.parseInt(mensagemIdade);
        } catch (NumberFormatException e) {
            editTextIdade.setError("Idade Inválido");
            return;
        }

        String mensagemPeso = editTextPeso.getText().toString();

        if (mensagemPeso.trim().isEmpty()){
            editTextPeso.setError("O campo não pode estar vazio");
            return;
        }

        try {
            Integer.parseInt(mensagemPeso);
        } catch (NumberFormatException e) {
            editTextPeso.setError("Peso Inválido");
            return;
        }



        String mensagemAltura = editTextAltura.getText().toString();


        if (mensagemAltura.trim().isEmpty()){
            editTextAltura.setError("O campo não pode estar vazio");
            return;
        }

        try {
            Integer.parseInt(mensagemAltura);
        } catch (NumberFormatException e) {
            editTextAltura.setError("Peso Inválido");
            return;
        }

        intent.putExtra(App.MENSAGEMNOME,mensagemNome);
        intent.putExtra(App.MENSAGEMTELEFONE,mensagemTelefone);
        intent.putExtra(App.MENSAGEMEMAIL,mensagemEmail);
        intent.putExtra(App.MENSAGEMIDADE,mensagemIdade);
        intent.putExtra(App.MENSAGEMPESO,mensagemPeso);
        intent.putExtra(App.MENSAGEMALTURA,mensagemAltura);

        startActivity(intent);
    }
}
