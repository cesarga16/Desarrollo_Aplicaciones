package com.example.activity_11_no_evidence.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activity_11_no_evidence.R;
import com.example.activity_11_no_evidence.entidades.Actividades;

import java.util.ArrayList;

public class ListaActividadesAdapter extends RecyclerView.Adapter<ListaActividadesAdapter.ActividadesViewHolder> {

    ArrayList<Actividades> listaActividades;

    public ListaActividadesAdapter(ArrayList<Actividades> listaActividades){
        this.listaActividades = listaActividades;
    }

    @NonNull
    @Override
    public ActividadesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_actividad, null, false);
    return new ActividadesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActividadesViewHolder holder, int position) {

        holder.viewAct.setText(listaActividades.get(position).getAct());
        holder.viewWork.setText(listaActividades.get(position).getWtime());
        holder.viewRest.setText(listaActividades.get(position).getRtime());
        holder.viewLongRest.setText(listaActividades.get(position).getLrtime());


    }

    @Override
    public int getItemCount() {
        return listaActividades.size();
    }

    public class ActividadesViewHolder extends RecyclerView.ViewHolder {

        TextView viewAct, viewWork, viewRest, viewLongRest;

        public ActividadesViewHolder(@NonNull View itemView) {
            super(itemView);

            viewAct = itemView.findViewById(R.id.viewAct);
            viewWork = itemView.findViewById(R.id.viewWork);
            viewRest = itemView.findViewById(R.id.viewRest);
            viewLongRest = itemView.findViewById(R.id.viewLongRest);

        }
    }
}
