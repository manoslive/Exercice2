package com.example.manu.exercice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void arnoldClick(View view) {
        ImageButton ima1 = (ImageButton) findViewById(R.id.IBTN_Arnold);
        TextView couleurPanel = (TextView) findViewById(R.id.the_quote);
        String quote = "";
        Random r = new Random();
        int rand = r.nextInt(5) + 1;
        int lastRand = -1;
            while (rand == lastRand) {
                rand = r.nextInt(5) + 1;
            }
            lastRand = rand;

            switch (rand) {
                case 1:
                    quote = getString(R.string.arnold_1);
                    break;
                case 2:
                    quote = getString(R.string.arnold_2);
                    break;
                case 3:
                    quote = getString(R.string.arnold_3);
                    break;
                case 4:
                    quote = getString(R.string.arnold_4);
                    break;
                case 5:
                    quote = getString(R.string.arnold_5);
                    break;
            }
            couleurPanel.setText(quote);
    }

    public void cageClick(View view) {
        ImageButton ima2 = (ImageButton) findViewById(R.id.IBTN_Cage);
        TextView couleurPanel = (TextView) findViewById(R.id.the_quote);
        String quote = "";
        Random r = new Random();
        int rand = r.nextInt(5) + 1;
        int lastRand = -1;
        while (rand == lastRand) {
            rand = r.nextInt(5) + 1;
        }
        lastRand = rand;

        switch (rand) {
            case 1:
                quote = getString(R.string.cage_1);
                break;
            case 2:
                quote = getString(R.string.cage_2);
                break;
            case 3:
                quote = getString(R.string.cage_3);
                break;
            case 4:
                quote = getString(R.string.cage_4);
                break;
            case 5:
                quote = getString(R.string.cage_5);
                break;
        }
        couleurPanel.setText(quote);
    }

    public void queenClick(View view) {
        ImageButton ima3 = (ImageButton) findViewById(R.id.IBTN_Queen);
        TextView couleurPanel = (TextView) findViewById(R.id.the_quote);
        String quote = "";
        Random r = new Random();
        int rand = r.nextInt(5) + 1;
        int lastRand = -1;
        if (ima3.isPressed()) {
            while (rand == lastRand) {
                rand = r.nextInt(5) + 1;
            }
            lastRand = rand;

            switch (rand) {
                case 1:
                    quote = getString(R.string.queen_1);
                    break;
                case 2:
                    quote = getString(R.string.queen_2);
                    break;
                case 3:
                    quote = getString(R.string.queen_3);
                    break;
                case 4:
                    quote = getString(R.string.queen_4);
                    break;
                case 5:
                    quote = getString(R.string.queen_5);
                    break;
            }
            couleurPanel.setText(quote);
        }
    }

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
/*        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
