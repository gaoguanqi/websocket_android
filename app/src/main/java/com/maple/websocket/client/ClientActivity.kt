package com.maple.websocket.client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maple.websocket.R
import java.net.URI


class ClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)

        val uri: URI = URI.create("ws://echo.websocket.org")
        val client: JWebSocketClient = object : JWebSocketClient(uri) {
            //message就是接收到的消息
            override fun onMessage(message: String?) {

            }
        }



    }
}
