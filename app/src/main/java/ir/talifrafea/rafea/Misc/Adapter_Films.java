package ir.talifrafea.rafea.Misc;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ir.talifrafea.rafea.R;

/**
 * Created by smn on 7/21/17.
 */

public class Adapter_Films extends RecyclerView.Adapter<Adapter_Films.ViewHolder> {

    private List<String> list;
    private int rowLayout;
    private View.OnClickListener onClickListener;

    public Adapter_Films(int rowLayout, List<String> list, View.OnClickListener onClickListener) {
        this.rowLayout = rowLayout;
        this.list = list;
        this.onClickListener = onClickListener;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String name = list.get(i);
        viewHolder.vTitle.setText(name);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(rowLayout, viewGroup, false);

        itemView.setOnClickListener(onClickListener);

        return new ViewHolder(itemView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView vTitle;
        protected ImageView thumbnail;

        public ViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title);
            thumbnail = (ImageView) v.findViewById(R.id.clip);
        }
    }
}