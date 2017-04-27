# SimplePlayer

SimplePlayer is a video player based on ijkPlayer which Support live and video.

## How to use
### .xml
    
    <com.song.simplevideolibrary.SimplePlayer
        android:id="@+id/simple_player"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

### .java
  
    private SimplePlayer mSimplePlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimplePlayer = (SimplePlayer) findViewById(R.id.simple_player);

        mSimplePlayer.setTitle("cctv-6");
        mSimplePlayer.play("http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8");
        mSimplePlayer.live(true); //true if the video is live;
        mSimplePlayer.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mSimplePlayer != null) {
            mSimplePlayer.onResume();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (mSimplePlayer != null) {
            mSimplePlayer.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mSimplePlayer != null) {
            mSimplePlayer.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (mSimplePlayer != null) {
            mSimplePlayer.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (mSimplePlayer != null && mSimplePlayer.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
#
### Using SimplePlayer in your application

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  	dependencies {
		compile 'com.github.songmingwen:SimplePlayer:0.1.0'
	}
  
# 
    Copyright 2016 Mingwen Song

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
