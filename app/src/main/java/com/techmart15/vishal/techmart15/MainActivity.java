package com.techmart15.vishal.techmart15;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle = "Treasure Hunt";
    TextView downloadEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MultiDex.install(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }


    private FragmentManager getSupportFragmentManager(MainActivity mainActivity) {
        return null;
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 0:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, AboutTechmart.newInstance())
                        .commit();
                break;
            case 1:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, adwar.newInstance())
                        .commit();
                break;
            case 2:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, CodeTrek.newInstance())
                        .commit();
                break;
            case 3:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Constructo.newInstance())
                        .commit();
                break;
            case 4:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Electromatrix.newInstance())
                        .commit();
                break;
            case 5:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Focus.newInstance())
                        .commit();
                break;
            case 6:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Hitz.newInstance())
                        .commit();
                break;
            case 7:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Ingenium.newInstance())
                        .commit();
                break;
            case 8:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, LanGaming.newInstance())
                        .commit();
                break;
            case 9:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, ObstacleArena.newInstance())
                        .commit();
                break;
            case 10:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, pioneer.newInstance())
                        .commit();
                break;
            case 11:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Quizomania.newInstance())
                        .commit();
                break;
            case 12:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, REACT.newInstance())
                        .commit();
                break;
            case 13:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, RealSteal.newInstance())
                        .commit();
                break;
            case 14:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Reflux.newInstance())
                        .commit();
                break;
            case 15:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, RocketWar.newInstance())
                        .commit();
                break;
            case 16:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Showbuzz.newInstance())
                        .commit();
                break;
            case 17:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, SpellingBee.newInstance())
                        .commit();
                break;
            case 18:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Tatva.newInstance())
                        .commit();
                break;
            case 19:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, TreasureHunt.newInstance())
                        .commit();
                break;
            case 20:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, GridExplorer.newInstance())
                        .commit();
                break;
            case 21:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, RoboSoccer.newInstance())
                        .commit();
                break;
            case 22:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Update.newInstance())
                        .commit();
                break;
            case 23:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, AboutMe.newInstance())
                        .commit();
                break;
        }
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
                break;
            case 10:
                mTitle = getString(R.string.title_section10);
                break;
            case 11:
                mTitle = getString(R.string.title_section11);
                break;
            case 12:
                mTitle = getString(R.string.title_section13);
                break;
            case 13:
                mTitle = getString(R.string.title_section14);
                break;
            case 14:
                mTitle = getString(R.string.title_section15);
                break;
            case 15:
                mTitle = getString(R.string.title_section16);
                break;
            case 16:
                mTitle = getString(R.string.title_section17);
                break;
            case 17:
                mTitle = getString(R.string.title_section18);
                break;
            case 18:
                mTitle = getString(R.string.title_section19);
                break;
            case 19:
                mTitle = getString(R.string.title_section20);
                break;
            case 20:
                mTitle = getString(R.string.title_section21);
                break;
            case 21:
                mTitle = getString(R.string.gridex);
                break;
            case 22:
                mTitle = getString(R.string.rbso);
                break;
            case 23:
                mTitle = getString(R.string.newsandupdates);
                break;
            case 24:
                mTitle = getString(R.string.title_section22);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        } else if (id == R.id.exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startFileService(View view) {

        Intent intent = new Intent(this, FileService.class);
        intent.putExtra("url", "http://techmart.uietkanpur.com/a.txt");
        this.startService(intent);

    }

    private BroadcastReceiver downloadReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("FileService", "Service Received");
            Toast.makeText(getBaseContext(), "Content Updated", Toast.LENGTH_SHORT).show();
            showFileContent();
        }
    };

    public void showFileContent() {
        StringBuilder sb;
        downloadEditText = (TextView) findViewById(R.id.downloadText);
        try {
            FileInputStream fis = this.openFileInput("myFile.txt");

            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bufferedReader = new BufferedReader(isr);
            sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            downloadEditText.setText(sb.toString());
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            downloadEditText.setText("Error");
        }

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
