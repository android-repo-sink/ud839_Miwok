package com.example.android.miwok;

// stores two strings, viz English word and its Miwok translation. This is the DS item type.
// It is required by ArrayAdapter

import android.content.Intent;
import android.support.annotation.Nullable;

public class Word {
    //    Default translation for the word
    private String mDefaultTranslation;

    //  Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource id
    private Integer mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, Integer mImageResourceId) {
        this(mDefaultTranslation, mMiwokTranslation);
        this.mImageResourceId = mImageResourceId;
    }

    // Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the image resource id
    @Nullable
    public Integer getmImageResourceId() {
        return mImageResourceId;
    }

}