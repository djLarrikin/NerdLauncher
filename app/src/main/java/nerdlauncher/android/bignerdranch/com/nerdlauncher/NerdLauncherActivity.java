package nerdlauncher.android.bignerdranch.com.nerdlauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class NerdLauncherActivity extends SingleFragmentActivity {

    String TAG = "NerdLauncherActivity";

    @Override
    public Fragment createFragment(){
        return new NerdLauncherFragment();
    }
}
