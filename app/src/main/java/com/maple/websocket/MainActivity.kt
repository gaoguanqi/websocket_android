package com.maple.websocket

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maple.websocket.client.ClientActivity
import com.maple.websocket.service.ServiceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_client.setOnClickListener {
            startActivity(
                Intent(
                    MainActivity@ this,
                    ClientActivity::class.java
                )
            )
        }
        btn_service.setOnClickListener {
            startActivity(
                Intent(
                    MainActivity@ this,
                    ServiceActivity::class.java
                )
            )
        }
    }
}
