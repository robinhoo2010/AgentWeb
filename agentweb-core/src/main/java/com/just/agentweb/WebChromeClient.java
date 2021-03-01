package com.just.agentweb;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/**
 * @author cenxiaozhong
 * @date 2019/4/13
 * @since 1.0.0
 */
public class WebChromeClient extends MiddlewareWebChromeBase{

	public WebChromeClient() {
	}

	@Override
	@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
	public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback,
									 FileChooserParams fileChooserParams) {
		return super.onShowFileChooser(webView, filePathCallback, fileChooserParams);
	}


	/**
	 * Android  >= 4.1
	 *
	 * @param uploadFile
	 * @param acceptType
	 * @param capture
	 */
	@Override
	public void openFileChooser(ValueCallback<Uri> uploadFile, String acceptType, String capture) {
		super.openFileChooser(uploadFile, acceptType, capture);
	}

	/**
	 * Android < 3.0
	 *
	 * @param valueCallback
	 */
	@Override
	public void openFileChooser(ValueCallback<Uri> valueCallback) {
		super.openFileChooser(valueCallback);
	}

	/**
	 * Android  >= 3.0
	 *
	 * @param valueCallback
	 * @param acceptType
	 */
	@Override
	public void openFileChooser(ValueCallback valueCallback, String acceptType) {
		super.openFileChooser(valueCallback, acceptType);
	}
}
