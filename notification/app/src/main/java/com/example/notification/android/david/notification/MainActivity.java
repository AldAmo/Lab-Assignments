package com.example.notification.android.Alden.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


    public class MainActivity extends ActionBarActivity {


        NotificationCompat.Builder notification;
        private static final int uniqueID = 1208;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            notification = new NotificationCompat.Builder(this);
            notification.setAutoCancel(true);

        }

        public void davidButtonClicked(View view) {
            //build notification
            notification.setSmallIcon(R.drawable.ic_launcher);
            notification.setTicker("Open me ");
            notification.setWhen(System.currentTimeMillis());
            notification.setContentTitle("Alden");
            notification.setContentText("Have a wonderful day");

            Intent intent = new Intent(this, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            notification.setContentIntent(pendingIntent);

            //Builds notification and issues it

            NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            nm.notify(uniqueID, notification.build());

        }
    }