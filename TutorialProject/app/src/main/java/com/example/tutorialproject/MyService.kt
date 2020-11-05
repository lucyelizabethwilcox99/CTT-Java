package com.example.tutorialproject

import android.app.Service
import android.content.Intent
import android.os.IBinder

class myService extends Service() {

    class MyService: Service() {
        override fun onBind(intent: Intent?): IBinder? {
            TODO("Not yet implemented")
        }

    }