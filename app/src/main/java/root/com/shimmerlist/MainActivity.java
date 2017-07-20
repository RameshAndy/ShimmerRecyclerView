package root.com.shimmerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import root.com.shimmerlist.shimmer.ShimmerAdapter;
import root.com.shimmerlist.shimmer.ShimmerRecyclerView;
import root.com.shimmerlist.shimmerFram.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    private ShimmerRecyclerView shimmerRecyclerView;
    private ShimmerFrameLayout shimmerFrameLayout;
       private ShimmerAdapter shimmerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shimmerRecyclerView=(ShimmerRecyclerView)findViewById(R.id.shimmer_recycler_view);


        shimmerAdapter=new ShimmerAdapter();
        shimmerRecyclerView.setAdapter(shimmerAdapter);
        shimmerRecyclerView.showShimmerAdapter();

        shimmerRecyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                stopAnimation();
            }

        },2000);

    }

    private void stopAnimation() {
        shimmerRecyclerView.hideShimmerAdapter();
    }
}
