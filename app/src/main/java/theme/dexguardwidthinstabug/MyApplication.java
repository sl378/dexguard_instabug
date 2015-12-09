package theme.dexguardwidthinstabug;

import android.app.Application;
import android.support.v7.appcompat.BuildConfig;

import com.instabug.library.Instabug;
import com.instabug.wrapper.impl.v14.InstabugAnnotationActivity;

/**
 * Created by alex.liu on 12/9/2015.
 */
public class MyApplication extends Application {
    public static Instabug mInstabugInstance;
    @Override
    public void onCreate() {
        super.onCreate();

        mInstabugInstance = Instabug.initialize(this)
                .setAnnotationActivityClass(InstabugAnnotationActivity.class)
                .setShowIntroDialog(true)
                .setEnableOverflowMenuItem(true)
                .setIsTrackingCrashes(!BuildConfig.DEBUG);
    }
}
