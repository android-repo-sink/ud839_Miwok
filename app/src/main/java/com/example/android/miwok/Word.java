package com.example.android.miwok;

// stores two strings, viz English word and its Miwok translation. This is the DS item type.
// It is required by ArrayAdapter

public class Word {
    //    Default translation for the word
    private String mDefaultTranslation;

    //  Miwok translation for the word
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //    Get the default translation of the word.
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //    Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}