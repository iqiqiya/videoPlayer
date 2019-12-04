package com.iakie.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.print.PrinterId;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
    private void initView(){
        videoView = findViewById(R.id.videoView);

        /**
         * 本地视频播放
         */
        
        videoView.setVideoPath("");

        /**
         * 网络视频播放
         */
        videoView.setVideoURI(Uri.parse(""));

        /**
         * 使用MediaController
         */
        MediaController controller = new MediaController(this);
        /**
         * 设置VideoView与MediaController建立关联
         */
        videoView.setMediaController(controller);
        /**
         * 设置MediaController与VideoView建立关联
         */
        controller.setMediaPlayer(videoView);
    }
}
