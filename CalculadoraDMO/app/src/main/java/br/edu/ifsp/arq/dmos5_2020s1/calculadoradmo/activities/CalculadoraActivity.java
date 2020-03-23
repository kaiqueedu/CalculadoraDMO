package br.edu.ifsp.arq.dmos5_2020s1.calculadoradmo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifsp.arq.dmos5_2020s1.calculadoradmo.R;
import br.edu.ifsp.arq.dmos5_2020s1.calculadoradmo.constants.Constantes;
import br.edu.ifsp.arq.dmos5_2020s1.calculadoradmo.model.Calculadora;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tela;

    private Button botaoUm;
    private Button botaoDois;
    private Button botaoTres;
    private Button botaoQuatro;
    private Button botaoCinco;
    private Button botaoSeis;
    private Button botaoSete;
    private Button botaoOito;
    private Button botaoNove;
    private Button botaoZero;

    private Button buttonC;
    private Button buttonDivisao;
    private Button buttonMultiplicacao;
    private Button buttonAdicao;
    private Button buttonSubtracao;
    private Button buttonPonto;
    private Button buttonIgual;
    private Button buttonPotencia;
    private Button button_ce;

    private Calculadora c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        tela = findViewById( R.id.textview_lcd );

        iniciaButtons();

        c = Calculadora.getInstance();
        tela.setText( "" );
    }

    @Override
    public void onClick(View v) {

        switch( v.getId() ){

            case R.id.button_c:
                limpa();
                break;

            case R.id.button_ponto:
                tela.append( ".");
                break;

            case R.id.button_divisao:
                c.calcular( Constantes.DIVISAO, Float.parseFloat( tela.getText().toString() ) );
                tela.setText( "" );
                break;

            case R.id.button_subtracao:
                c.calcular( Constantes.SUBTRACAO, Float.parseFloat( tela.getText().toString() ) );
                tela.setText( "" );
                break;

            case R.id.button_adicao:
                c.calcular( Constantes.ADICAO, Float.parseFloat( tela.getText().toString() ) );
                tela.setText( "" );
                break;

            case R.id.button_multiplicacao:
                c.calcular( Constantes.MULTIPLICACAO, Float.parseFloat( tela.getText().toString() ) );
                tela.setText( "" );
                break;

            case R.id.button_ce:
                tela.setText( "" );
                break;

            case R.id.button_potencia:
                c.calcular(Constantes.POTENCIACAO, Float.parseFloat( tela.getText().toString() ) );
                tela.setText( "" );
                break;

            case R.id.button_igual:
                 Float result = c.calcular( Constantes.RESULTADO, Float.parseFloat( tela.getText().toString() ) );
                 tela.setText( result.toString() );
                 break;

            default:
                Button botao = (Button) v;
                tela.append( botao.getText().toString() );
                break;
        }

    }

    private void limpa(){
        c.c();
        tela.setText( "" );
    }

   private void iniciaButtons(){

        botaoUm     = findViewById( R.id.button_um );
        botaoDois   = findViewById( R.id.button_dois );
        botaoTres   = findViewById( R.id.button_tres );
        botaoQuatro = findViewById( R.id.button_quatro );
        botaoCinco  = findViewById( R.id.button_cinco ) ;
        botaoSeis   = findViewById( R.id.button_seis );
        botaoSete   = findViewById( R.id.button_sete );
        botaoOito   = findViewById( R.id.button_oito );
        botaoNove   = findViewById( R.id.button_nove );
        botaoZero   = findViewById( R.id.button_zero );

        buttonC             = findViewById( R.id.button_c );
        buttonDivisao       = findViewById( R.id.button_divisao );
        buttonMultiplicacao = findViewById( R.id.button_multiplicacao );
        buttonAdicao        = findViewById( R.id.button_adicao );
        buttonSubtracao     = findViewById( R.id.button_subtracao );
        buttonPonto         = findViewById( R.id.button_ponto );
        buttonIgual         = findViewById( R.id.button_igual );
        button_ce           = findViewById( R.id.button_ce );
        buttonPotencia      = findViewById( R.id.button_potencia );

        botaoUm.setOnClickListener(this);
        botaoDois.setOnClickListener(this);
        botaoTres.setOnClickListener(this);
        botaoQuatro.setOnClickListener(this);
        botaoCinco.setOnClickListener(this);
        botaoSeis.setOnClickListener(this);
        botaoSete.setOnClickListener(this);
        botaoOito.setOnClickListener(this);
        botaoNove.setOnClickListener(this);
        botaoZero.setOnClickListener(this);

        buttonC.setOnClickListener(this);
        buttonDivisao.setOnClickListener(this);
        buttonMultiplicacao.setOnClickListener(this);
        buttonAdicao.setOnClickListener(this);
        buttonSubtracao.setOnClickListener(this);
        buttonPonto.setOnClickListener(this);
        buttonIgual.setOnClickListener(this);
        buttonPotencia.setOnClickListener(this);
        button_ce.setOnClickListener(this);

   }

}
