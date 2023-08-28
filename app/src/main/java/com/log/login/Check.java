package com.log.login;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
public class Check extends AppCompatActivity{
    private CheckBox seleccionarChk;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box);
        seleccionarChk = (CheckBox)findViewById(R.id.chkSeleccionar);
    }

    public void btnChek (View v){
        if(seleccionarChk.isChecked()==true){
            String mensaje = "Seleccionado";
            Toast toast = Toast.makeText(this,mensaje, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();
        }
        else{
            String mensaje = "No Seleccionado";
            Toast.makeText(this, mensaje,Toast.LENGTH_SHORT).show();
        }
    }
}
