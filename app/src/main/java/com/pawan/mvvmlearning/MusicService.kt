package com.pawan.mvvmlearning

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.media.audiofx.BassBoost
import android.os.IBinder
import android.provider.Settings


class MusicService : Service() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onBind(p0: Intent?): IBinder? = null

    override fun onDestroy() {
        mediaPlayer.stop()
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.isLooping = true
        mediaPlayer.start()

        return START_STICKY
    }
}