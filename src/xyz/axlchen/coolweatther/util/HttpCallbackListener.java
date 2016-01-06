package xyz.axlchen.coolweatther.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	void onError(Exception e);
}
