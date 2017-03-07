package gr.survivor.admin.survivorfans;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("");

        ImageButton ht_twitter_btn = (ImageButton) findViewById(R.id.ht_twitter_btn);
        ht_twitter_btn.setOnClickListener(this);
        ImageButton ht_fb_btn = (ImageButton) findViewById(R.id.ht_fb_btn);
        ht_fb_btn.setOnClickListener(this);
        ImageButton ht_insta_btn = (ImageButton) findViewById(R.id.ht_insta_btn);
        ht_insta_btn.setOnClickListener(this);

        ImageButton celebrities_btn = (ImageButton) findViewById(R.id.celebrities_btn);
        celebrities_btn.setOnClickListener(this);
        ImageButton fighters_btn = (ImageButton) findViewById(R.id.fighters_btn);
        fighters_btn.setOnClickListener(this);

        ImageButton social_fb_btn = (ImageButton) findViewById(R.id.social_fb_btn);
        social_fb_btn.setOnClickListener(this);
        ImageButton social_twitter_btn = (ImageButton) findViewById(R.id.social_twitter_btn);
        social_twitter_btn.setOnClickListener(this);
        ImageButton social_insta_btn = (ImageButton) findViewById(R.id.social_insta_btn);
        social_insta_btn.setOnClickListener(this);
        ImageButton social_video_btn = (ImageButton) findViewById(R.id.social_video_btn);
        social_video_btn.setOnClickListener(this);
        ImageButton social_news_btn = (ImageButton) findViewById(R.id.social_news_btn);
        social_news_btn.setOnClickListener(this);

        Button btn_ataka_epi_topou = (Button) findViewById(R.id.btn_ataka_epi_topou);
        btn_ataka_epi_topou.setOnClickListener(this);
        Button btn_survivor_memes = (Button) findViewById(R.id.btn_survivor_memes);
        btn_survivor_memes.setOnClickListener(this);
        Button btn_sullogos_ragby = (Button) findViewById(R.id.btn_sullogos_ragby);
        btn_sullogos_ragby.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String url;
        CustomTabsIntent.Builder builder;
        CustomTabsIntent intent;
        switch (view.getId()){
            case R.id.ht_fb_btn:
                url = "https://m.facebook.com/hashtag/survivorgr?";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.ht_twitter_btn:
                url = "https://m.twitter.com/hashtag/survivorgr?lang=el";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.ht_insta_btn:
                url = "https://www.instagram.com/explore/tags/survivorgr/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.celebrities_btn:
                url = "http://survivor.skai.gr/celebs/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.fighters_btn:
                url = "http://survivor.skai.gr/machites/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.social_fb_btn:
                url = "https://m.facebook.com/SurvivorGreece/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.social_twitter_btn:
                url = "https://m.twitter.com/survivorgreece";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.social_insta_btn:
                url = "https://instagram.com/survivorgreece/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.social_video_btn:
                url = "http://survivor.skai.gr/videos/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.social_news_btn:
                url = "http://survivor.skai.gr/category/news/";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.btn_ataka_epi_topou:
                url = "https://m.facebook.com/atakakiepitopou/?fref=nf";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.btn_sullogos_ragby:
                url = "https://m.facebook.com/%CE%A0%CE%B1%CE%BD%CE%B5%CE%BB%CE%BB%CE%AE%CE%BD%CE%B9%CE%BF%CF%82-%CE%A3%CF%8D%CE%BB%CE%BB%CE%BF%CE%B3%CE%BF%CF%82-%CE%9C%CE%AC%CE%BD%CE%B1%CF%84%CE%B6%CE%B5%CF%81-%CE%A1%CE%AC%CE%B3%CE%BA%CE%BC%CF%80%CE%B9-628886827297541/?fref=ts";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            case R.id.btn_survivor_memes:
                url = "https://m.facebook.com/SurvivorMems/?hc_ref=NEWSFEED&fref=nf";
                builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true);
                builder.setStartAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
                builder.setExitAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
                intent = builder.build();
                intent.launchUrl(MainActivity.this, Uri.parse(url));
                break;
            default:
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
        }

        return super.onOptionsItemSelected(item);
    }
}
