package com.example.crazziee.tablayoutexample2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Crazziee on 1/5/2018.
 */

public class ProjectDetailActivity extends Activity {
    ProgressDialog mDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_detail_activity);


        TextView tv = (TextView) findViewById(R.id.project_title);
        tv.setText(getIntent().getExtras().getString("title"));

        TextView textview = (TextView) findViewById(R.id.description);
        textview.setText(getIntent().getExtras().getString("overview"));

        TextView textView = (TextView) findViewById(R.id.date);
        textView.setText(getIntent().getExtras().getString("date"));

        TextView t1 = (TextView) findViewById(R.id.rating);
        t1.setText(getIntent().getExtras().getString("rating"));

        String getPosterPath = getIntent().getExtras().getString("image");
        ImageView imageView = (ImageView) findViewById(R.id.project_image);
        Picasso.with(this)
                .load(getPosterPath)
                .into(imageView);

        ImageButton btn = (ImageButton) findViewById(R.id.btn_play_pause);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=cxLG2wtE7TM")));

            }
        });


    }
}



//        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
//       final ImageButton btnPlayPause = (ImageButton)findViewById(R.id.btn_play_pause);
//        btnPlayPause.setAlpha(0.2f);

//        btnPlayPause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mDialog = new ProgressDialog(ProjectDetailActivity.this);
//                mDialog.setMessage("plaease wait");
//                mDialog.setCanceledOnTouchOutside(false);
//                mDialog.show();
//
//                try {
//                    if(videoView.isPlaying()) {
//
//                        Uri uri = Uri.parse(videoURL);
//                        videoView.setVideoURI(uri);
//                        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//
//                            @Override
//                            public void onCompletion(MediaPlayer mp) {
//                                btnPlayPause.setImageResource(R.drawable.ic_play);
//
//                            }
//                        });
//                    }
//                    else
//                    {
//                        videoView.pause();
//                        btnPlayPause.setImageResource(R.drawable.ic_play);
//                    }
//                }catch (Exception ex){
//
//                }
//                videoView.requestFocus();
//                videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
//
//                    @Override
//                    public void onPrepared(MediaPlayer mp) {
//                        mDialog.dismiss();
//                        mp.setLooping(true);
//                        videoView.start();
//                        btnPlayPause.setImageResource(R.drawable.ic_pause);
//                    }
//                });
//
//            }
//        });







