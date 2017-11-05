package nyc.c4q.astrology_recyclerview.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.astrology_recyclerview.R;
import nyc.c4q.astrology_recyclerview.model.Astrology;
import nyc.c4q.astrology_recyclerview.view.AstrologyViewHolder;

/**
 * Created by c4q on 11/5/17.
 */

public class AstrologyAdapter extends RecyclerView.Adapter<AstrologyViewHolder> {

    private List<Astrology> astrologyList;

    public AstrologyAdapter(List<Astrology> astrologyList) {
        this.astrologyList = astrologyList;
    }

    @Override
    public AstrologyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.astrology_itemview, parent, false);
            return new AstrologyViewHolder(childView);
        }

    @Override
    public void onBindViewHolder(AstrologyViewHolder holder, int position) {
        Astrology astrology = astrologyList.get(position);

        holder.onBind(astrology);

    }

    @Override
    public int getItemCount() {
        return astrologyList.size();
    }
}
