package com.maple.websocket.client

import com.maple.websocket.utils.LogUtils
import org.java_websocket.client.WebSocketClient
import org.java_websocket.drafts.Draft_6455
import org.java_websocket.handshake.ServerHandshake
import java.net.URI

open class JWebSocketClient : WebSocketClient {

    //构造方法中的 Draft_6455()代表使用的协议版本，这里可以不写或者写成这样即可。
//    constructor(serverUri:URI):super(serverUri);
    constructor(serverUri:URI):super(serverUri, Draft_6455());

    //在websocket连接开启时调用
    override fun onOpen(handshakedata: ServerHandshake?) {
        LogUtils.logGGQ("onOpen")
    }

    //在连接断开时调用
    override fun onClose(code: Int, reason: String?, remote: Boolean) {
        LogUtils.logGGQ("onClose")
    }

    //在接收到消息时调用
    override fun onMessage(message: String?) {
        LogUtils.logGGQ("onMessage $message")
    }

    //在连接出错时调用
    override fun onError(ex: Exception?) {
        LogUtils.logGGQ("onError ${ex?.message}")
    }
}