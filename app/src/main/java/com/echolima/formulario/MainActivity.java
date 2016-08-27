package com.echolima.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String nombrecontacto;
    String fechanacimiento;
    String telefonocontacto;
    String emailcontacto;
    String detallecontacto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton1 = (Button) findViewById(R.id.btnBoton1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Codigo a ejecutar cuando sea pulsado

                // Obtenemos los datos de los campos del formulario y los almacenamos en variables

                EditText nombre = (EditText) findViewById(R.id.etNombre);
                nombrecontacto = nombre.getText().toString();
                DatePicker fecha = (DatePicker) findViewById(R.id.dpFechaNacimiento);
                fechanacimiento = fecha.getDayOfMonth() + "/" + fecha.getMonth() + "/" + fecha.getYear();
                EditText telefono = (EditText) findViewById(R.id.etTelefono);
                telefonocontacto = telefono.getText().toString();
                EditText email = (EditText) findViewById(R.id.etemail);
                emailcontacto = email.getText().toString();
                EditText detalle = (EditText) findViewById(R.id.etDescripcion);
                detallecontacto = detalle.getText().toString();

                // realizamos el intent mandando los parametros introducidos por el usuario como Extras

                Intent linkconfirmardatos = new Intent(MainActivity.this, ConfirmacionDatos.class );
                linkconfirmardatos.putExtra("nombre", nombrecontacto );
                linkconfirmardatos.putExtra("fechanacimiento", fechanacimiento);
                linkconfirmardatos.putExtra("telefono", telefonocontacto);
                linkconfirmardatos.putExtra("email", emailcontacto);
                linkconfirmardatos.putExtra("descripcion", detallecontacto);

                // y finalmente lanzamos el intent

                startActivity(linkconfirmardatos);

            }
        });
    }
}
