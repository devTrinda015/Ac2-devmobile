package com.example.ac2_mobile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ac2_mobile.model.Medicamento;

public class AddEditMedicamentoActivity extends AppCompatActivity {

    EditText edtNome, edtDescricao, edtHorario;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_medicamento);

        edtNome = findViewById(R.id.edtNome);
        edtDescricao = findViewById(R.id.edtDescricao);
        edtHorario = findViewById(R.id.edtHorario);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String desc = edtDescricao.getText().toString();
            String horario = edtHorario.getText().toString();

            Medicamento novo = new Medicamento(nome, desc, horario, false);
            finish();
        });
    }
}
