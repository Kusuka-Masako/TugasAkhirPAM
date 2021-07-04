package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apktopupgeming.Produck;
import com.example.apktopupgeming.R;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private ArrayList<Produck> dataItem;

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        TextView textSubheadB;
        TextView textSubheadC;
        ImageView imageIcon;

        ViewHolder(View v) {

            super(v);

            textHead = v.findViewById(R.id.text_headline);
            textSubhead = v.findViewById(R.id.text_subhead);
            textSubheadB = v.findViewById(R.id.text_subheadb);
            textSubheadC = v.findViewById(R.id.text_subheadc);
            imageIcon = v.findViewById(R.id.imageList);
        }
    }

    public RecycleViewAdapter(ArrayList<Produck> data) {

        this.dataItem = data;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produck, parent, false);
        //myonClickListener
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        TextView textSubheadB = holder.textSubheadB;
        TextView textSubheadC = holder.textSubheadC;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getPrice());
        textSubheadB.setText(dataItem.get(position).getDesk());
        textSubheadC.setText(dataItem.get(position).getTextdesk());
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }
}