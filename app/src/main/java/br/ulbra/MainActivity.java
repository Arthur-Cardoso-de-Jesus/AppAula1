package br.ulbra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editNumero1, editNumero2;
    TextView txtResultado;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    double v1, v2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumero1 = (EditText) findViewById(R.id.editNumero1);
        editNumero2 = (EditText) findViewById(R.id.editNumero2);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                result = v1 + v2;
                txtResultado.setText("Resultado: "+result);
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v){
            v1 = Double.parseDouble(editNumero1.getText().toString());
            v2 = Double.parseDouble(editNumero2.getText().toString());
            result = v1 - v2;
            txtResultado.setText("Resultado: "+result);
        }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                result = v1 * v2;
                txtResultado.setText("Resultado: "+result);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v1 = Double.parseDouble(editNumero1.getText().toString());
                v2 = Double.parseDouble(editNumero2.getText().toString());
                if(v1 == 0 || v2 == 0) {
                    txtResultado.setText(("Resultado invalido"));
                }else{
                result = v1 / v2;
                txtResultado.setText("Resultado: "+result);
                }
            }
        });
        }
    }
