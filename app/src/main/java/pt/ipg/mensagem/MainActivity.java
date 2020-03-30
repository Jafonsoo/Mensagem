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

        EditText editTextMensagem = (EditText) findViewById(R.id.editText);

        String mensagem = editTextMensagem.getText().toString();

        intent.putExtra(App.MENSAGEM,mensagem);

        startActivity(intent);
    }
}
