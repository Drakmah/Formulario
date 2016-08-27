package com.echolima.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDetalles;

    private String nombre;
    private String fecha;
    private String telefono;
    private String email;
    private String detalles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion_datos);

        // Creamos objeto Bundle para traer los Extras de la activity anterior

        Bundle parametros = getIntent().getExtras();

        // Asignamos los Extras a las variables declaradas arriba:

        nombre = parametros.getString("nombre");
        fecha = parametros.getString("fechanacimiento");
        telefono = parametros.getString("telefono");
        email = parametros.getString("email");
        detalles = parametros.getString("descripcion");

        // Creamos Textview y seteamos la vista del xml correspondiente

        tvNombre = (TextView) findViewById(R.id.tvNombre2);
        tvFecha = (TextView) findViewById(R.id.tvFechaNacimiento2);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono2);
        tvEmail = (TextView) findViewById(R.id.tvEmail2);
        tvDetalles = (TextView) findViewById(R.id.tvDescripcion2);

        // Establecemos el texto de los TextView con las variables que almacenan los extras

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDetalles.setText(detalles);


        Button boton2 = (Button) findViewById(R.id.btnBoton2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Codigo a ejecutar

                finish();
            }
        });
    }
}
