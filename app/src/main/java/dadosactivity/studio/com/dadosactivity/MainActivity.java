package dadosactivity.studio.com.dadosactivity;
/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 19/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Passando o valor de uma activity para outra

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("nome", "Mauricio Borges");

                startActivity(intent);
            }
        });

    }
}
