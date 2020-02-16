package com.greenhackers.lesthree

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.visibility = VISIBLE
        val controller = MediaController(this)
        try {
            videoView.setVideoURI(Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4"))

            videoView.setMediaController(controller)
        }catch (e:Exception){

        }
        videoView.setOnPreparedListener {
            progressBar.visibility = GONE
            videoView.start()
        }

    }
}
