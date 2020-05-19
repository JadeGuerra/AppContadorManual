package com.example.appcontadormanual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /* calculates*/
    public void addOne(View view){
        contador = ++contador;
        aumentaUm(contador);
    }

    public void lessOne(View view){
        if (contador > 0 ){
            contador = --contador;
            diminuiUm(contador);}
        else{
            diminuiUm(contador);
        }
    }

    public void reset(View view){
        contador = 0;
        reset(contador);
    }
    /*Displays on screen*/

    public void aumentaUm(int adiciona) {
        TextView contadorView = (TextView) findViewById(R.id.contador_na_tela);
        contadorView.setText(String.valueOf(adiciona));
    }

    private void diminuiUm(int score) {
        TextView contador = (TextView) findViewById(R.id.contador_na_tela);
        contador.setText(String.valueOf(score));
    }

    private void reset(int score) {
        TextView contador = (TextView) findViewById(R.id.contador_na_tela);
        contador.setText(String.valueOf(score));
    }

}
