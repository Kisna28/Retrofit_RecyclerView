package com.example.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kotlin.jvm.internal.Lambda;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.userholder> {
    MainActivity mainActivity;
    List<Usermodel> alluserlist;
    public UserAdapter(MainActivity mainActivity, List<Usermodel> alluserlist) {
        this.mainActivity=mainActivity;
        this.alluserlist=alluserlist;

    }

    @NonNull
    @Override
    public userholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userholder(LayoutInflater.from(mainActivity).inflate(R.layout.item_user,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull userholder holder, int position) {
holder.textView.setText(alluserlist.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return alluserlist.size();
    }

    class userholder extends  RecyclerView.ViewHolder{

TextView textView;
ImageView imageView;
        public userholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv);
            imageView=itemView.findViewById(R.id.image1);
        }
    }
}
