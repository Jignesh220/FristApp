package com.example.android.miwok;
public class word {
    private String mDefultTranslation;

    private  String mMiwokTranslation;

    public word(String DefultTranslation,String MiwokTranslation){
        mDefultTranslation=DefultTranslation;
        mMiwokTranslation=MiwokTranslation;;
    }
    public String getDeflultTranslation(){
        return mDefultTranslation;
    }

    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
