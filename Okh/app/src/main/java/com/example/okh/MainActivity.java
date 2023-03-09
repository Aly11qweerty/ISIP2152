package com.example.okh;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;

public class MainActivity extends AppCompatActivity {

    ArrayList<Human> hum=new ArrayList<Human>();
    ListView lv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialDate();
        lv = findViewById(R.layout.listv);
        StateAdapter stateAdapter=new StateAdapter( context this,R.layout.forListv,hum);
        lv.setAdapter(stateAdapter);
    }
    void setInitialDate(){
        hum.add(new Human()(fam:"Иванов", nam:"Иван", otc:"Иванович",R.drawable.phot1));
        hum.add(new Human()(fam:"Иванов", nam:"Иван", otc:"Иванович",R.drawable.phot1));
        hum.add(new Human()(fam:"Иванов", nam:"Иван", otc:"Иванович",R.drawable.phot1));
    }
}