package com.example.jsbridge;


interface WebViewJavascriptBridge {
	
	void sendToWeb(Object data);

	void sendToWeb(Object data, OnBridgeCallback responseCallback);

	void sendToWeb(String function, Object... values);

}
