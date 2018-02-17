package com.example.ocimarabarcellos.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by ocimarabarcellos on 17/02/2018.
 */
class AlarmeReceiver : BroadcastReceiver(){

private var mp: MediaPlayer? = null

    override fun onReceive(context: Context?, intent: Intent?) {


        val i = Intent(context, MeuServico::class.java)
        i.putExtra("Parametro1","oi")

        context?.startService(i)



       // mp = MediaPlayer.create(context,R.raw.alarm_clock)
      //  mp!!.start()
     //   Toast.makeText(context, "Alarm.....", Toast.LENGTH_SHORT).show()
    }

}