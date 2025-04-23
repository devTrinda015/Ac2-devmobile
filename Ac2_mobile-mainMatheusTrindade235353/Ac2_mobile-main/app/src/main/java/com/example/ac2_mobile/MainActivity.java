package com.example.ac2_mobile;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import com.example.ac2_mobile.adapter.MedicamentoAdapter;
import com.example.ac2_mobile.model.Medicamento;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MedicamentoAdapter adapter;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private Button btnNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerMedicamentos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnNovo = findViewById(R.id.btnNovoMedicamento);
        btnNovo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddEditMedicamentoActivity.class);
            startActivity(intent);
        });

        medicamentos.add(new Medicamento("Paracetamol", "Dor de cabeça", "08:00", false));
        medicamentos.add(new Medicamento("Omeprazol", "Estômago", "12:00", true));

        adapter = new MedicamentoAdapter(medicamentos);
        recyclerView.setAdapter(adapter);
    }
}
