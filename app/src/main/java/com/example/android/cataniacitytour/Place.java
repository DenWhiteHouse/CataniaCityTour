package com.example.android.cataniacitytour;

/**
 * Created by casab on 18/05/2017.
 */

public class Place {
    /*This variable will contain the name of the showed place*/
    private String mTitle;

    /*This variable will cantin che day in which the place will be open to public*/
    private String mDays;

    /*This variable will contain the general price of the place or the entry cost*/
    private String mPrice;

    /* This wariable will be needed to get the ID of the image conteined in the listview*/
    private int mImageResourceID;

    /*Constructor of the new Class, as in all the categories an image will be displayed, the constractor will be unique*/
    public Place (String Title, String Days, String Price, int ImageResourceID){
        mTitle=Title;
        mDays=Days;
        mPrice=Price;
        mImageResourceID=ImageResourceID;
    }

    /*Method to get the variable Title*/
    public String getTitle(){
        return mTitle;
    }

    /*Method to get the variable Price*/
    public String getPrice(){
        return mPrice;
    }

    /*Method to get the variable Days*/
    public String getDays(){
        return mDays;
    }

    /*Method to get the ImageID*/
    public int getImageResourceID()  {
        return mImageResourceID; }

}
