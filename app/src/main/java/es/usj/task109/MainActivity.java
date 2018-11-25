package es.usj.task109;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    int num;
    Toast notificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        num=(int)(Math.random()*100001);
        String cadena="Recuerda este número: "+ num;
        notificacion= Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.setGravity(Gravity.TOP,0,0);
        notificacion.show();

    }

    public void controlar(View v) {
        String valorIngresado=et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if (valor==num) {
            notificacion=Toast.makeText(this,"Muy bien recordaste el número mostrado.",Toast.LENGTH_LONG);
        }
        else {
            notificacion=Toast.makeText(this,"Lo siento pero no es el número que mostré.",Toast.LENGTH_LONG);
        }

        notificacion.setGravity(Gravity.CENTER,0,0);
        notificacion.show();
    }
}
