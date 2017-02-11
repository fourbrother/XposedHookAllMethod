package cn.wjdiankong.xposedhook;

import android.util.Log;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class XposedInit implements IXposedHookLoadPackage {

	private final String TAG = "Xposed";

	public void log(String s){
		Log.d(TAG, s);
		XposedBridge.log(s);
	}

	@Override
	public void handleLoadPackage(final LoadPackageParam loadPackageParam){
		
		HookAppAllMethod.hookMethod(loadPackageParam);

	}
	
}
