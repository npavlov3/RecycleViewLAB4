package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://lh3.googleusercontent.com/12H0rtZ8Ljkuhk7FjPopwgC8KQhMoxYSwXCTMMEUYCYfJecNu8f33pLC3awaLzMxzHAiZg0=s170");
        mNames.add("Among Us: A Fun 10 Player Game");

        mImageUrls.add("https://cdn1.dotesports.com/wp-content/uploads/2019/09/12195522/league-of-legends.jpg");
        mNames.add("League of Legends: A Multiplayer Online Battle Arena Video Game");

        mImageUrls.add("https://www.nintendo.com/content/dam/noa/en_US/games/switch/n/nba-2k20-switch/nba-2k20-switch-hero.jpg");
        mNames.add("NBA 2K20: A Basketball Sports Game");

        mImageUrls.add("https://cdn2.unrealengine.com/Diesel%2Fproductv2%2Fgrand-theft-auto-v%2Fhome%2FGTAV_EGS_Artwork_1920x1080_Hero-Carousel_V06-1920x1080-1503e4b1320d5652dd4f57466c8bcb79424b3fc0.jpg?h=1080&resize=1&w=1920");
        mNames.add("GTA 5: An Action-Adventure Game");

        mImageUrls.add("https://cdn2.unrealengine.com/Diesel%2Fproductv2%2Fwatch-dogs%2Fhome%2FWDOG_STD_Store_Landscape_2580x1450-2580x1450-faf11f76438b5ec516195323bc6c5402d1812d7c.jpg?h=1080&resize=1&w=1920");
        mNames.add("Watch Dogs: Another Action-Adventure Game");

        mImageUrls.add("https://www.callofduty.com/content/dam/atvi/callofduty/cod-touchui/kronos/common/social-share/social-share-image.jpg");
        mNames.add("COD MW: A Shooting/War Game");

        mImageUrls.add("https://www.riotgames.com/darkroom/1440/fab68f870f6da8998086165e608ea621:ca159930b811b32033d8714a948586c8/tft.jpg");
        mNames.add("TFT: An Auto Battler Game");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/thumb/e/e1/Spider-Man_PS4_cover.jpg/220px-Spider-Man_PS4_cover.jpg");
        mNames.add("Spiderman: A Superhero Game");

        mImageUrls.add("https://cdn.pocket-lint.com/r/s/1200x/assets/images/151737-games-feature-batman-games-in-order-how-to-play-the-arkham-series-and-more-image1-m8vygjidfb.jpg");
        mNames.add("Batman: A Superhero Game");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















