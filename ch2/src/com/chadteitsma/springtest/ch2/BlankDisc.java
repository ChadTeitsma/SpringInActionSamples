package com.chadteitsma.springtest.ch2;

import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private int testInt;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setTestInt(int testInt) {
        this.testInt = testInt;}

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
    public void play() {
        System.out.println("TestInt: " + testInt);
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}