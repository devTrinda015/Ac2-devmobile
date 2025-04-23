package com.example.ac2_mobile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2_mobile.R;
import com.example.ac2_mobile.model.Medicamento;

import java.util.List;

public class MedicamentoAdapter extends RecyclerView.Adapter<MedicamentoAdapter.ViewHolder> {

    private final List<Medicamento> medicamentos;

    public MedicamentoAdapter(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nome, horario;
        CheckBox checkBox;

        public ViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textNome);
            horario = itemView.findViewById(R.id.textHorario);
            checkBox = itemView.findViewById(R.id.checkConsumido);
        }
    }

    @Override
    public MedicamentoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medicamento, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Medicamento med = medicamentos.get(position);
        holder.nome.setText(med.getNome());
        holder.horario.setText(med.getHorario());
        holder.checkBox.setChecked(med.isConsumido());
    }

    @Override
    public int getItemCount() {
        return medicamentos.size();
    }
}
