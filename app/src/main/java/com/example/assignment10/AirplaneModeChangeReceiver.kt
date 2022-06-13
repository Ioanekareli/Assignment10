package com.example.assignment10

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AirplaneModeChangeReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state",false) ?:return
        if (isAirplaneModeEnabled){
            NotificationHelper.showNotification(context, "Airplane mode is on")
        }else {
            NotificationHelper.showNotification(context, "Airplane mode is off")
        }
    }
}