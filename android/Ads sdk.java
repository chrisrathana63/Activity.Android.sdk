import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ✅ Init Google Mobile Ads SDK
        MobileAds.initialize(this, initializationStatus -> {});
    }
}
