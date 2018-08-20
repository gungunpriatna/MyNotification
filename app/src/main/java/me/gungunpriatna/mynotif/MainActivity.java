package me.gungunpriatna.mynotif;

import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final int NOTIFICATION_ID =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder notification = new NotificationCompat
                .Builder(this)
                .setSmallIcon(R.drawable.ic_notifications_black_48px)
                .setLargeIcon(BitmapFactory
                        .decodeResource(getResources()
                                , R.drawable.ic_notifications_black_48px))
                .setContentTitle(getResources()
                        .getString(R.string.content_title))
                .setContentText("Bismillahirrahmanirrahim")
                .setSubText(getResources()
                        .getString(R.string.subtext))
                .setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(NOTIFICATION_ID, notification.build());
    }
}