package com.example.hannahoffren.horoskooppi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by HannaHoffren on 04/12/14.
 */
public abstract class BaseActivity extends ActionBarActivity {

    private static BaseActivity lastPausedActivity = null;

    @Override
    protected void onPause() {

        super.onPause();
        lastPausedActivity = this;
    }

    @Override
    protected void onResume() {

        super.onResume();
        if(this == lastPausedActivity) {
            lastPausedActivity = null;
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
            startActivity( intent );
        }
    }
}