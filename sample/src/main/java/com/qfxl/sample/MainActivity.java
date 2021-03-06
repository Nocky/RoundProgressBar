package com.qfxl.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.qfxl.view.RoundProgressBar;

/**
 * @author 清风徐来
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mLinearLayout = (LinearLayout) findViewById(R.id.ll_main);
        final RoundProgressBar mRoundProgressBar = new RoundProgressBar(this);
        mRoundProgressBar.setCenterTextSize(40);
        mRoundProgressBar.setCenterText("清风徐来");
        mRoundProgressBar.setCenterTextColor(Color.BLUE);
        mRoundProgressBar.setCountDownTimeMillis(5000);
        mRoundProgressBar.setPadding(10, 10, 10, 10);
        mRoundProgressBar.setCenterBackground(Color.WHITE);
        mRoundProgressBar.setStartAngle(-90);
        mRoundProgressBar.setStrokeWidth(4);
        mRoundProgressBar.setStrokeColor(Color.RED);
        mRoundProgressBar.setAutoStart(true);
        mRoundProgressBar.setDirection(RoundProgressBar.Direction.REVERSE);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mLinearLayout.addView(mRoundProgressBar, lp);

        mRoundProgressBar.setProgressChangeListener(new RoundProgressBar.ProgressChangeListener() {
            @Override
            public void onFinish() {

            }

            @Override
            public void onProgressChanged(int progress) {

            }
        });
    }
}
