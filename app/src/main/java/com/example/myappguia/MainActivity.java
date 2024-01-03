package com.example.myappguia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
private Spinner cmbOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] datos = new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, datos);

        cmbOpciones = (Spinner)findViewById(R.id.spinnerDatos);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        ///ListView
        final String[] datosX = new String[]{"Elem1_A","Elem2_B","Elem3_C","Elem4_D","Elem5_E","Elem1_A","Elem2_B","Elem3_C","Elem4_D","Elem5_E","Elem1_A","Elem2_B","Elem3_C","Elem4_D","Elem5_E","Elem1_A","Elem2_B","Elem3_C","Elem4_D","Elem5_E"};
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datosX);
        ListView lstOpciones = (ListView)findViewById(R.id.listDatos);
        lstOpciones.setAdapter(adaptador2);


        ///////////////////


       // cmbOpciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
  /*
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
      TextView datoSelect = (TextView) findViewById(R.id.selectDatos);
                datoSelect.setText("Datos Selecto: "+parent.getItemAtPosition(position));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
*/

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView datoSelect = (TextView) findViewById(R.id.selectDatos);
        datoSelect.setText("Datos Selecto: "+parent.getItemAtPosition(position));

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }


    //////////////////
}