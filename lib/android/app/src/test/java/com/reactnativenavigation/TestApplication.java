package com.reactnativenavigation;

import com.reactnativenavigation.controllers.ActivityLifecycleDelegate;
import com.reactnativenavigation.mocks.TestDevPermissionRequest;
import com.reactnativenavigation.mocks.TestReactNativeHost;

public class TestApplication extends NavigationApplication {

	@Override
	public boolean isDebug() {
		return true;
	}

	@Override
	protected Config createConfig() {
		Config config = new Config();
		config.reactNativeHost = new TestReactNativeHost(this, isDebug());
		config.activityLifecycleDelegate = new ActivityLifecycleDelegate(config.reactNativeHost.getReactInstanceManager(), new TestDevPermissionRequest());
		return config;
	}
}