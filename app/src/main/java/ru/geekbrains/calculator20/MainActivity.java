package ru.geekbrains.calculator20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DataCenter dataCenter = new DataCenter();



    class ClickListenerHandler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.key0) dataCenter.setOperationField("0");
            if (v.getId() == R.id.key1) dataCenter.setOperationField("1");
            if (v.getId() == R.id.key2) dataCenter.setOperationField("2");
            if (v.getId() == R.id.key3) dataCenter.setOperationField("3");
            if (v.getId() == R.id.key4) dataCenter.setOperationField("4");
            if (v.getId() == R.id.key5) dataCenter.setOperationField("5");
            if (v.getId() == R.id.key6) dataCenter.setOperationField("6");
            if (v.getId() == R.id.key7) dataCenter.setOperationField("7");
            if (v.getId() == R.id.key8) dataCenter.setOperationField("8");
            if (v.getId() == R.id.key9) dataCenter.setOperationField("9");
            if (v.getId() == R.id.keyTwo0) dataCenter.setOperationField("00");
            if (v.getId() == R.id.keyPoint) dataCenter.setOperationField(".");
            if (v.getId() == R.id.keyClear) {
                dataCenter.clearAll();
            }
            if (v.getId() == R.id.keyMultiplication) dataCenter.multiplication();
            if (v.getId() == R.id.keyDivision) dataCenter.divizion();
            if (v.getId() == R.id.keyMinus) dataCenter.minus();
            if (v.getId() == R.id.keyPlus) dataCenter.plus();
            if (v.getId() == R.id.keyResult) dataCenter.result();
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}