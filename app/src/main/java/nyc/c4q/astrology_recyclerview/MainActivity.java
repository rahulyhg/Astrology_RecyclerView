package nyc.c4q.astrology_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.astrology_recyclerview.controller.AstrologyAdapter;
import nyc.c4q.astrology_recyclerview.model.Astrology;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView astrologyRecyclerView = (RecyclerView) findViewById(R.id.astrology_recyclerview);

        List<Astrology> astrology = new ArrayList<>();
        astrology.add(new Astrology(R.drawable.aries, "Aries", "March 21-April 19"));
        astrology.add(new Astrology(R.drawable.taurus, "Taurus", "April 20-May 20"));
        astrology.add(new Astrology(R.drawable.gemini, "Gemini", "May 21-June 20"));
        astrology.add(new Astrology(R.drawable.cancer, "Cancer", "June 21-July 22"));
        astrology.add(new Astrology(R.drawable.leo, "Leo", "July 23-August 22"));
        astrology.add(new Astrology(R.drawable.virgo, "Virgo", "August 23-September 22"));
        astrology.add(new Astrology(R.drawable.libra, "Libra", "September 23-October 22"));
        astrology.add(new Astrology(R.drawable.scorpio, "Scorpio", "October 23-November 21"));
        astrology.add(new Astrology(R.drawable.sagitarius, "Sagittarius", "November 22-December 21"));
        astrology.add(new Astrology(R.drawable.capricorn, "Capricorn", "December 22-January 19"));
        astrology.add(new Astrology(R.drawable.aquarius, "Aquarius", "January 20 to February 18"));
        astrology.add(new Astrology(R.drawable.pisces, "Pisces", "February 19 to March 20"));

        AstrologyAdapter astrologyAdapter = new AstrologyAdapter(astrology);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        astrologyRecyclerView.setAdapter(astrologyAdapter);
        astrologyRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
