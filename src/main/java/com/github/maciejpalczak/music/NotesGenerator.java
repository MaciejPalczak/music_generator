package com.github.maciejpalczak.music;

import java.util.Random;

public class NotesGenerator {
    private static final Random rand = new Random();
    private String currentNote;

    public final String generateNote() {
        int n = rand.nextInt(13);
        n+=1;
        if(n== 1){
            setCurrentNote("c");
        }
        else if(n==2) {
            setCurrentNote("cis");
        }
        else if(n==3) {
            setCurrentNote("d");
        }
        else if(n==4) {
            setCurrentNote("dis");
        }
        else if(n==5) {
            setCurrentNote("e");
        }
        else if(n==6) {
            setCurrentNote("f");
        }
        else if(n==7) {
            setCurrentNote("fis");
        }
        else if(n==8) {
            setCurrentNote("g");
        }
        else if(n==9) {
            setCurrentNote("gis");
        }
        else if(n==10) {
            setCurrentNote("a");
        }
        else if(n==11) {
            setCurrentNote("ais");
        }
        else if(n==12) {
            setCurrentNote("b");
        }
        else if(n==13) {
            setCurrentNote("c'");
        }
        return getCurrentNote();
    }

    public void setCurrentNote(String currentNote) {
        this.currentNote = currentNote;
    }

    public String getCurrentNote() {
        return currentNote;
    }
}
