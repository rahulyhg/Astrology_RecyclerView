package nyc.c4q.astrology_recyclerview.view;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import nyc.c4q.astrology_recyclerview.R;
import nyc.c4q.astrology_recyclerview.model.Astrology;

/**
 * Created by c4q on 11/5/17.
 */

public class AstrologyViewHolder extends ViewHolder{
    private ImageView signImageView;
    private TextView signNames;
    private TextView dates;

    public AstrologyViewHolder(View itemView) {
        super(itemView);
        this.signImageView = (ImageView) itemView.findViewById(R.id.astrology_signImageView_imageview);
        this.signNames = (TextView) itemView.findViewById(R.id.astrology_signName_textview);
        this.dates = (TextView) itemView.findViewById(R.id.astrology_dates_textview);
    }

    public void onBind (Astrology astrology) {
        signImageView.setImageResource(astrology.getSignImageView());
        signNames.setText(astrology.getSignName());
        dates.setText(astrology.getDates());
    }
}
