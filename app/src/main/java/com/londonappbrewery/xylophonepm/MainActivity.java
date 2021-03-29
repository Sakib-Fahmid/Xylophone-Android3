package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool soundPoolObject ;
    //soundPoolObject=new SoundPool( maxStreams: 7,AudioManager.STREAM_MUSIC,srcQuality: 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        soundPoolObject=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId=soundPoolObject.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=soundPoolObject.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=soundPoolObject.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=soundPoolObject.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=soundPoolObject.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId=soundPoolObject.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId=soundPoolObject.load(getApplicationContext(),R.raw.note7_b,1);
        //mBSoundId=soundPoolObject.load("file:///D:/b.wav",1);

    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View view){
        soundPoolObject.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playD(View view){
        soundPoolObject.play(mDSoundId,1.0f,1.0f,0,0,1.0f);
    }

    public void playE(View v){
        soundPoolObject.play(mESoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playF(View v){
        soundPoolObject.play(mFSoundId,1.0f,1.0f,0,0,1.0f);
        Log.d("Xylophone","mFSound ===================== "+mFSoundId);
    }
    public void playG(View v){
        soundPoolObject.play(mGSoundId,1.0f,1.0f,0,0,1.0f);
        Log.d("Xylophone","mGSound ===================== "+mGSoundId);
    }

    public void playA(View v){
        soundPoolObject.play(mASoundId,1.0f,1.0f,0,0,1.0f);
        Log.d("Xylophone","mASound ===================== "+mASoundId);
    }
    public void playB(View v){
        soundPoolObject.play(mBSoundId,1.0f,1.0f,0,0,1.0f);
        Log.d("Xylophone","mbSound ===================== "+mBSoundId);
    }

}
