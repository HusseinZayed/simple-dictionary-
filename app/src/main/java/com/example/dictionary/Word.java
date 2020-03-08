package com.example.dictionary;

public class Word {

    private String wordAR , wordEN ;

    private int image = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    //---------------------------------------------------------------
    public Word(String wordAR, String wordEN, int image) {
        this.wordAR = wordAR;
        this.wordEN = wordEN;
        this.image = image;
    }

    public Word(String wordAR, String wordEN) {
        this.wordAR = wordAR;
        this.wordEN = wordEN;
    }
//------------------------------------------------------------------

    public String getWordAR() {
        return wordAR;
    }

    public String getWordEN() {
        return wordEN;
    }

    public int getImage() {
        return image;
    }


    public boolean hasImage()
    {
        return image !=NO_IMAGE;
    }
}
