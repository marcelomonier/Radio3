package marcelomonier.lsdi.ufma.br.radio3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Campos

    //CARACTERÍSTICAS CLÍNICAS - Ok
    // Idade - Ok
    //Sexo - Ok
    //Expansão (Sim ou não) - Ok
    // Dor (Sim ou não) - ok
    //Parestesia  (Sim ou não) - ok

    //CARACTERÍSTICAS IMAGINOLÓGICAS - ok
    //Hiperatenuante / Hipoatenuante / Misto
    // Unilocular ou multilocular
    // Margem: Regular ou Irregular / Bem ou mal definida
    // Cortical marginal (sim ou não)
    //Expansão óssea (Sim ou não)
    //Deslocamento de dente (sim ou não)
    //Reabsorção radicular (sim ou não)
    // Associação a dente não irrompido (sim ou não)


    //Integer[] localizacao_lesoes = {R.string.superior, R.string.inferior, R.string.superior_e_inferior};
    //Integer[] sexo = {R.string.masculino, R.string.feminino};
    //String[] expansion_list = {"Sim", "Não"};

    String[] localizacao_lesoes = {"Superior", "Inferior", "Superior e Inferior"};
    String[] sexo = {"Masculino", "Feminino"};
    String[] caraimagini = {"Hiperatenuante", "Hipoatenuante", "Misto"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //CARACTERÍSTICAS CLÍNICAS
        TextView caraclin = (TextView) findViewById(R.id.caracli);

        //Scroll View
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);

//        //Cabeçalho
//        AutoCompleteTextView nome = (AutoCompleteTextView) findViewById(R.id.nome);
//        nome.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_NEXT) {
//
//                }
//                return false;
//            }
//
//
//        });
//
//        AutoCompleteTextView sobrenome = (AutoCompleteTextView) findViewById(R.id.sobrenome);
//        sobrenome.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_NEXT) {
//
//                }
//                return false;
//            }
//
//
//        });
//
//
//        AutoCompleteTextView email = (AutoCompleteTextView) findViewById(R.id.email);
//        email.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_NEXT) {
//
//                }
//                return false;
//            }
//
//
//        });

        //Localização da lesão
        TextView lesao = (TextView) findViewById(R.id.textView_loclesao);
        Spinner loclistlesao = (Spinner) findViewById(R.id.loclesaolist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, localizacao_lesoes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loclistlesao.setAdapter(adapter);

        //Sexo
        TextView sexo_text = (TextView) findViewById(R.id.sexo_text);
        Spinner sexolist = (Spinner) findViewById(R.id.sexo_list);

        ArrayAdapter<String> adapter_sexo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sexo);
        adapter_sexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexolist.setAdapter(adapter_sexo);

        //Expansão
        TextView expansion = (TextView) findViewById(R.id.expansion);
        Switch expansioSpinner = (Switch) findViewById(R.id.expansion_list);


        //Idade
        TextView age = (TextView) findViewById(R.id.age);
        EditText age_text = (EditText) findViewById(R.id.age_text);

        age_text.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {

                }
                return false;
            }


        });

        //Paretesia
        TextView parethesia = (TextView) findViewById(R.id.paretesia);
        Switch paterethesia_button = (Switch) findViewById(R.id.paretesia_button);

        //Dor
        TextView text_dor = (TextView) findViewById(R.id.dor);
        Switch dor_button = (Switch) findViewById(R.id.dor_button);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Snackbar.make(view, R.string.nada, Snackbar.LENGTH_SHORT).setAction("Action", null).show();
//                //Snackbar.make(view, "Nada ainda... Vai gerar os possíveis diagnósticos", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
//
//
//            }
//        });


        //CARACTERÍSTICAS IMAGINOLÓGICAS
        TextView caraimagin = (TextView) findViewById(R.id.caraimagi);

        //Lesão
        TextView textView_lesao = (TextView) findViewById(R.id.textView_lesao);
        Spinner lesao_imagi_list = (Spinner) findViewById(R.id.lesao_list);

        ArrayAdapter<String> adapterlesao = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, caraimagini);
        adapterlesao.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lesao_imagi_list.setAdapter(adapterlesao);


    }





    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(MainActivity.this, "Lesões: " + localizacao_lesoes[pos], Toast.LENGTH_LONG).show();
    }


    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(MainActivity.this, "Selections cleared.", Toast.LENGTH_SHORT).show();
    }


    public void onItemSelectedsexo(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(MainActivity.this, "Sexo: " + sexo[pos], Toast.LENGTH_LONG).show();
    }


    public void onNothingSelectedsexo(AdapterView<?> parent) {
        Toast.makeText(MainActivity.this, "Selections cleared.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
