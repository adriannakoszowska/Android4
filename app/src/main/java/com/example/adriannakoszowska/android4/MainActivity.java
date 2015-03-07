package com.example.adriannakoszowska.android4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    EditText wprowadz;
    TextView wynik;
    CheckBox kwotabrutto, kwotanetto, skladka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wprowadz = (EditText) findViewById(R.id.wprowadz);
        kwotabrutto = (CheckBox) findViewById(R.id.kwotabrutto);
        kwotanetto = (CheckBox) findViewById(R.id.kwotanetto);
        //skladka = (CheckBox) findViewById(R.id.skladka);
        wynik=(TextView)findViewById(R.id.textView3);

        wynik.setText("");
    }

    public void ClickFuncion(View view) {
        float result = 0;
        float wprowadz2 = Float.parseFloat(wprowadz.getText().toString());
        /*CheckBox kwotabrutto = (CheckBox)view;
        CheckBox kwotanetto = (CheckBox)view;
        CheckBox skladka = (CheckBox)view;*/
        if (kwotabrutto.isChecked()) {
            result = (float) (1.34 * wprowadz2);
        }
        if (kwotanetto.isChecked()) {
            result = (float) (0.748 * wprowadz2);
        }
        wynik.setText(Float.toString(result));
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
