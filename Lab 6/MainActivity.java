package com.example.alert_dialog201b212;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_covid19)
                .setTitle("Be Alert!")
                .setMessage("Covid-19 patient may near you\nMaintain Social Distancing\nWear Mask Properly\nClean/Wash your hands with sanitizers at regular intervals")
                .setNeutralButton("GOT IT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Read Guidelines Carefully",Toast.LENGTH_SHORT).show();
                    }

                }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView3);
        textView.setText("                  HELP PREVENT THE SPREAD OF COVID-19\n\n* Face masks are required to be worn for the duration of your visit\n\n* Practice social distancing: keep a minimum of 6 feet from  other visitors and staff\n\n* Sanitize your hands as you enter and, for your own protection,  after touching items. Wash your hands after using the restroom\n\n* Upon entry, please voluntarily fill out the information sheet in the  event any contact tracing becomes needed\n\n*Get vaccinated by both the doses and the Booster dose\n\n* Do not panic if you have the symptoms of covid 19. Consult  a doctor and get isolated an your home, ensuring safety  of your family members");
    }
}