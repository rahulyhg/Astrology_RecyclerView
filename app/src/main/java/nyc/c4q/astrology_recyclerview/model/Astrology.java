package nyc.c4q.astrology_recyclerview.model;

import android.widget.ImageView;

/**
 * Created by c4q on 11/5/17.
 */

public class Astrology {
    private int signImageView;
    private String signName;
    private String dates;

    public Astrology(int signImageView, String signName, String dates) {
        this.signImageView = signImageView;
        this.signName = signName;
        this.dates = dates;

    }

    public int getSignImageView() {
        return signImageView;
    }

    public String getSignName() {
        return signName;
    }

    public String getDates() {
        return dates;
    }
}
