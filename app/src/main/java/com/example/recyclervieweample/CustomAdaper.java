package com.example.recyclervieweample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private Context context;
    private  String[] names;
    public CustomAdapter(Context context,String[] names) {
            this.context = context;
            this.names = names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View conv = LayoutInflater.from(context).inflate(R.layout.single_item,null);
        MyViewHolder myViewHolder  = new MyViewHolder(conv);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      TextView tv =  holder.itemView.findViewById(R.id.name);

      tv.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    protected static  class  MyViewHolder extends  RecyclerView.ViewHolder{



    public  MyViewHolder(View convertView){
        super(convertView);
    }
    }
}
