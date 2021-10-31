package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class mahasiswaadapter extends
        RecyclerView.Adapter<mahasiswaadapter.MahasiswaViewHolder>{
    private ArrayList<mahasiswa> dataList;
    public mahasiswaadapter(ArrayList<mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public mahasiswaadapter.MahasiswaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
    public void onBindViewHolder(MahasiswaViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());

        holder.txtAngkatan.setText(dataList.get(position).getAngkatan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtAngkatan;
        private CircleImageView profile_image;
        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            profile_image= (CircleImageView) itemView.findViewById(R.id.gambar);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtNim = (TextView) itemView.findViewById(R.id.tv_nim);
            txtAngkatan = (TextView) itemView.findViewById(R.id.tv_angkatan);
        }
    }
}
