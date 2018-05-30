package com.example.roshani.androidgame;

import java.util.Random;

public class Star {
    private int starx,stary,maxX ,maxY, speed;
    public Star(int x,int y){
        maxX=x;
        maxY=y;
        Random rand=new Random();
        speed=rand.nextInt(20);
        starx=rand.nextInt(maxX);
        stary=rand.nextInt(maxY);

    }

    public float getX() {
        return starx;
    }

    public float getY() {
        return stary;
    }

    public void update(int playerspeed) {
        starx=starx-playerspeed-speed;
        if (starx<0){
            starx=maxX;
            Random generator=new Random();
            stary=generator.nextInt(maxY);
            speed=generator.nextInt(20);

        }


    }
}
