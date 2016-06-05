package com.john.collections;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        int btnId=view.getId();
        Resources res = getResources();
        String[] str_toast = res.getStringArray(R.array.btn_toast);
        int btn_num;
        switch (btnId){
            case R.id.button1:
                btn_num=0;
                break;
            case R.id.button2:
                btn_num=1;
                break;
            case R.id.button3:
                btn_num=2;
                break;
            case R.id.button4:
                btn_num=3;
                break;
            case R.id.button5:
                btn_num=4;
                break;
            case R.id.button6:
                btn_num=5;
                break;
            default:
                btn_num=6;
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(), str_toast[btn_num], Toast.LENGTH_SHORT);
        toast.show();
    }


}
