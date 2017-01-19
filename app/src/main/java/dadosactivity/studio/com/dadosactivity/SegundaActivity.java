package dadosactivity.studio.com.dadosactivity;
/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 19/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Passando o valor de uma activity para outra

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        texto = (TextView) findViewById(R.id.textoId);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String textoPassado = extra.getString("nome");

            texto.setText(textoPassado);
        }

    }
}
