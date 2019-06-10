package com.github.maciejpalczak.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class NotesGenerator {
    private static final Random rand = new Random();
    private String currentNote;
    private String currentValue;
    private String currentChromatic;
    private String currentInterval;
    private int currentLength;
    private int currentJump;
    private int jumper;
    private static final Gamut gamut = new Gamut();

    public final String generateNote() {
        int n = rand.nextInt(39);
        n += 1;
        if (n == 1) {
            setCurrentNote("bis,");
        } else if (n == 2) {
            setCurrentNote("c");
        } else if (n == 3) {
            setCurrentNote("deses");
        } else if (n == 4) {
            setCurrentNote("bisis,");
        } else if (n == 5) {
            setCurrentNote("cis");
        } else if (n == 6) {
            setCurrentNote("des");
        } else if (n == 7) {
            setCurrentNote("cisis");
        } else if (n == 8) {
            setCurrentNote("d");
        } else if (n == 9) {
            setCurrentNote("eses");
        } else if (n == 10) {
            setCurrentNote("dis");
        } else if (n == 11) {
            setCurrentNote("es");
        } else if (n == 12) {
            setCurrentNote("feses");
        } else if (n == 13) {
            setCurrentNote("disis");
        } else if (n == 14) {
            setCurrentNote("e");
        } else if (n == 15) {
            setCurrentNote("fes");
        } else if (n == 16) {
            setCurrentNote("eis");
        } else if (n == 17) {
            setCurrentNote("f");
        } else if (n == 18) {
            setCurrentNote("geses");
        } else if (n == 19) {
            setCurrentNote("eisis");
        } else if (n == 20) {
            setCurrentNote("fis");
        } else if (n == 21) {
            setCurrentNote("ges");
        } else if (n == 22) {
            setCurrentNote("fisis");
        } else if (n == 23) {
            setCurrentNote("g");
        } else if (n == 24) {
            setCurrentNote("ases");
        } else if (n == 25) {
            setCurrentNote("gis");
        } else if (n == 26) {
            setCurrentNote("as");
        } else if (n == 27) {
            setCurrentNote("gisis");
        } else if (n == 28) {
            setCurrentNote("a");
        } else if (n == 29) {
            setCurrentNote("beses");
        } else if (n == 30) {
            setCurrentNote("ais");
        } else if (n == 31) {
            setCurrentNote("bes");
        } else if (n == 32) {
            setCurrentNote("ceses'");
        } else if (n == 33) {
            setCurrentNote("aisis");
        } else if (n == 34) {
            setCurrentNote("b");
        } else if (n == 35) {
            setCurrentNote("ces'");
        } else if (n == 36) {
            setCurrentNote("bis");
        } else if (n == 37) {
            setCurrentNote("c'");
        } else if (n == 38) {
            setCurrentNote("deses'");
        } else if (n == 39) {
            setCurrentNote("r");
        }
        return getCurrentNote();
    }

    public final String generateValue() {
        int n = rand.nextInt(5);
        n += 1;
        if (n == 1) {
            setCurrentValue("1");
        } else if (n == 2) {
            setCurrentValue("2");
        } else if (n == 3) {
            setCurrentValue("4");
        } else if (n == 4) {
            setCurrentValue("8");
        } else if (n == 5) {
            setCurrentValue("16");
        }
        return getCurrentValue();
    }

    public final String generateChromatic() {
        int n = rand.nextInt(8);
        n += 1;
        if (n == 1 || n == 4) {
            setCurrentChromatic(".");
        } else if (n == 2) {
            setCurrentChromatic("~");
        } else {
            setCurrentChromatic("");
        }
        return currentChromatic;
    }

    public final void generateInterval() {
        int n = rand.nextInt(27);
        n += 1;
        if (n == 1) {
            setCurrentInterval("1cz");
            setCurrentLength(0);
            setCurrentJump(0);
        } else if (n == 2) {
            setCurrentInterval("1zw");
            setCurrentLength(1);
            setCurrentJump(0);
        } else if (n == 3) {
            setCurrentInterval("2zm");
            setCurrentLength(0);
            setCurrentJump(1);
        } else if (n == 4) {
            setCurrentInterval("2m");
            setCurrentLength(1);
            setCurrentJump(1);
        } else if (n == 5) {
            setCurrentInterval("2w");
            setCurrentLength(2);
            setCurrentJump(1);
        } else if (n == 6) {
            setCurrentInterval("2zw");
            setCurrentLength(3);
            setCurrentJump(1);
        } else if (n == 7) {
            setCurrentInterval("3zm");
            setCurrentLength(2);
            setCurrentJump(2);
        } else if (n == 8) {
            setCurrentInterval("3m");
            setCurrentLength(3);
            setCurrentJump(2);
        } else if (n == 9) {
            setCurrentInterval("3w");
            setCurrentLength(4);
            setCurrentJump(2);
        } else if (n == 10) {
            setCurrentInterval("3zw");
            setCurrentLength(5);
            setCurrentJump(2);
        } else if (n == 11) {
            setCurrentInterval("4zm");
            setCurrentLength(4);
            setCurrentJump(3);
        } else if (n == 12) {
            setCurrentInterval("4cz");
            setCurrentLength(5);
            setCurrentJump(3);
        } else if (n == 13) {
            setCurrentInterval("4zw");
            setCurrentLength(6);
            setCurrentJump(3);
        } else if (n == 14) {
            setCurrentInterval("5zm");
            setCurrentLength(6);
            setCurrentJump(4);
        } else if (n == 15) {
            setCurrentInterval("5cz");
            setCurrentLength(7);
            setCurrentJump(4);
        } else if (n == 16) {
            setCurrentInterval("5zw");
            setCurrentLength(8);
            setCurrentJump(4);
        } else if (n == 17) {
            setCurrentInterval("6zm");
            setCurrentLength(7);
            setCurrentJump(5);
        } else if (n == 18) {
            setCurrentInterval("6m");
            setCurrentLength(8);
            setCurrentJump(5);
        } else if (n == 19) {
            setCurrentInterval("6w");
            setCurrentLength(9);
            setCurrentJump(5);
        } else if (n == 20) {
            setCurrentInterval("6zw");
            setCurrentLength(10);
            setCurrentJump(5);
        } else if (n == 21) {
            setCurrentInterval("7zm");
            setCurrentLength(9);
            setCurrentJump(6);
        } else if (n == 22) {
            setCurrentInterval("7m");
            setCurrentLength(10);
            setCurrentJump(6);
        } else if (n == 23) {
            setCurrentInterval("7w");
            setCurrentLength(11);
            setCurrentJump(6);
        } else if (n == 24) {
            setCurrentInterval("7zw");
            setCurrentLength(12);
            setCurrentJump(6);
        } else if (n == 25) {
            setCurrentInterval("8zm");
            setCurrentLength(11);
            setCurrentJump(7);
        } else if (n == 26) {
            setCurrentInterval("8cz");
            setCurrentLength(12);
            setCurrentJump(7);
        }
    }

    public final String generateNextNote(String currentNote, String ambitusD, String ambitusU) {
        int n = rand.nextInt(2);
        n += 1;
        List<String> notes = gamut.getGamut();
        int down = notes.indexOf(ambitusD);
        int up = notes.indexOf(ambitusU);
        List<String> newNotes = notes.stream()
                .filter(x -> notes.indexOf(x) >= down)
                .filter(x -> notes.indexOf(x) <= up)
                .collect(toList());

        if (n == 1) {
            try {
                generateInterval();
                List<String> basic = gamut.getBasic();
                String newNote = basic.get(basic.indexOf(currentNote.substring(0, 1)) + Integer.valueOf(getCurrentInterval().substring(0, 1)) - 1);
                String notey = if1(currentNote, newNote);
                setCurrentNote(notey);

                if (getCurrentLength() >= 5) {
                    if (currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "," || currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "'") {
                        if (newNotes.contains(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35))) {
                            //if (String.valueOf(newNotes.contains(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35))).substring(currentNote.length() - 2, currentNote.length() - 1) == ",") {
                                setCurrentNote(String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35)));
                                return (String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35)).substring(0, String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35)).length() - 2)+",");
                            /*}
                            else {
                                setCurrentNote(String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35)));
                                return (String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) - 35)));
                            }*/
                        } else {
                            setCurrentNote(ambitusD);
                            return ambitusD.replace("'","").replace(",","");
                        }

                    } else {
                        if (newNotes.contains(notey + ",")) {
                            setCurrentNote(notey + ",");
                            return notey + ",";
                        } else {
                            setCurrentNote(ambitusD);
                            return ambitusD.replace("'","").replace(",","");
                        }

                    }
                } else {
                    if (currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "," || currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "'") {
                        if (newNotes.contains(notey)) {
                            setCurrentNote(notey);
                            return notey.substring(0, currentNote.length() - 2);
                        } else {
                            setCurrentNote(ambitusD);
                            return ambitusD.replace("'","").replace(",","");
                        }

                    } else {
                        if (newNotes.contains(notey)) {
                            setCurrentNote(notey);
                            return notey;
                        } else {
                            setCurrentNote(ambitusD);
                            return ambitusD.replace("'","").replace(",","");
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
            }

        } else

        {
            try {
                generateInterval();
                List<String> basic = gamut.getBasic();
                String newNote = basic.get(basic.indexOf(currentNote.substring(0, 1)) + Integer.valueOf(getCurrentInterval().substring(0, 1)) - 1);
                String notey = if2(currentNote, newNote);
                setCurrentNote(notey);
                if (getCurrentLength() >= 5) {
                    if (currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "," || currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "'") {
                        if (newNotes.contains(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35))) {
                           // if (String.valueOf(newNotes.contains(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35))).substring(currentNote.length() - 2, currentNote.length() - 1) == "'") {
                                setCurrentNote(String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35)));
                                return (String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35)).substring(0, String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35)).length() - 2)+",");
                            /*} else {
                                setCurrentNote(String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35)));
                                return (String.valueOf(gamut.getGamut().indexOf(gamut.getGamut().indexOf(notey) + 35)));
                            }*/
                        } else {
                            setCurrentNote(ambitusU);
                            return ambitusU.replace("'","").replace(",","");
                        }

                    } else {
                        if (newNotes.contains(notey + "'")) {
                            setCurrentNote(notey + "'");
                            return notey + "'";
                        } else {
                            setCurrentNote(ambitusU);
                            return ambitusU.replace("'","").replace(",","");
                        }
                    }
                } else {
                    if (currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "," || currentNote.substring(currentNote.length() - 2, currentNote.length() - 1) == "'") {
                        if (newNotes.contains(notey)) {
                            setCurrentNote(notey);
                            return notey.substring(0, currentNote.length() - 2);
                        } else {
                            setCurrentNote(ambitusU);
                            return ambitusU.replace("'","").replace(",","");
                        }

                    } else {
                        if (newNotes.contains(notey)) {
                            setCurrentNote(notey);
                            return notey;
                        } else {
                            setCurrentNote(ambitusU);
                            return ambitusU.replace("'","").replace(",","");
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }

        return getCurrentNote();

    }

    public String getCurrentValue() {
        return currentValue;
    }

    public String if1(String currentNote, String newNote) {
        if (gamut.getA0().contains(currentNote)) {
            jumper = 0;
        } else if (gamut.getB0().contains(currentNote)) {
            jumper = 1;
        } else if (gamut.getC0().contains(currentNote)) {
            jumper = 2;
        } else if (gamut.getD0().contains(currentNote)) {
            jumper = 3;
        } else if (gamut.getE0().contains(currentNote)) {
            jumper = 4;
        } else if (gamut.getF0().contains(currentNote)) {
            jumper = 5;
        } else if (gamut.getG0().contains(currentNote)) {
            jumper = 6;
        } else if (gamut.getH0().contains(currentNote)) {
            jumper = 7;
        } else if (gamut.getI0().contains(currentNote)) {
            jumper = 8;
        } else if (gamut.getJ0().contains(currentNote)) {
            jumper = 9;
        } else if (gamut.getK0().contains(currentNote)) {
            jumper = 10;
        } else if (gamut.getL0().contains(currentNote)) {
            jumper = 11;
        } else if (gamut.getA().contains(currentNote)) {
            jumper = 12;
        } else if (gamut.getB().contains(currentNote)) {
            jumper = 13;
        } else if (gamut.getC().contains(currentNote)) {
            jumper = 14;
        } else if (gamut.getD().contains(currentNote)) {
            jumper = 15;
        } else if (gamut.getE().contains(currentNote)) {
            jumper = 16;
        } else if (gamut.getF().contains(currentNote)) {
            jumper = 17;
        } else if (gamut.getG().contains(currentNote)) {
            jumper = 18;
        } else if (gamut.getH().contains(currentNote)) {
            jumper = 19;
        } else if (gamut.getI().contains(currentNote)) {
            jumper = 20;
        } else if (gamut.getJ().contains(currentNote)) {
            jumper = 21;
        } else if (gamut.getK().contains(currentNote)) {
            jumper = 22;
        } else if (gamut.getL().contains(currentNote)) {
            jumper = 23;
        } else if (gamut.getA1().contains(currentNote)) {
            jumper = 24;
        } else if (gamut.getB1().contains(currentNote)) {
            jumper = 25;
        } else if (gamut.getC1().contains(currentNote)) {
            jumper = 26;
        } else if (gamut.getD1().contains(currentNote)) {
            jumper = 27;
        } else if (gamut.getE1().contains(currentNote)) {
            jumper = 28;
        } else if (gamut.getF1().contains(currentNote)) {
            jumper = 29;
        } else if (gamut.getG1().contains(currentNote)) {
            jumper = 30;
        } else if (gamut.getH1().contains(currentNote)) {
            jumper = 31;
        } else if (gamut.getI1().contains(currentNote)) {
            jumper = 32;
        } else if (gamut.getJ1().contains(currentNote)) {
            jumper = 33;
        } else if (gamut.getK1().contains(currentNote)) {
            jumper = 34;
        } else if (gamut.getL1().contains(currentNote)) {
            jumper = 35;
        }
        Integer toJump = jumper + getCurrentLength();
        if (toJump == 0) {
            for (String x : gamut.getA0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 1) {
            for (String x : gamut.getB0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 2) {
            for (String x : gamut.getC0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 3) {
            for (String x : gamut.getD0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 4) {
            for (String x : gamut.getE0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 5) {
            for (String x : gamut.getF0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 6) {
            for (String x : gamut.getG0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 7) {
            for (String x : gamut.getH0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 8) {
            for (String x : gamut.getI0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 9) {
            for (String x : gamut.getJ0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 10) {
            for (String x : gamut.getK0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 11) {
            for (String x : gamut.getL0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 12) {
            for (String x : gamut.getA()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 13) {
            for (String x : gamut.getB()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 14) {
            for (String x : gamut.getC()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 15) {
            for (String x : gamut.getD()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 16) {
            for (String x : gamut.getE()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 17) {
            for (String x : gamut.getF()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 18) {
            for (String x : gamut.getG()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 19) {
            for (String x : gamut.getH()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 20) {
            for (String x : gamut.getI()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 21) {
            for (String x : gamut.getJ()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 22) {
            for (String x : gamut.getK()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 23) {
            for (String x : gamut.getL()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 24) {
            for (String x : gamut.getA1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 25) {
            for (String x : gamut.getB1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 26) {
            for (String x : gamut.getC1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 27) {
            for (String x : gamut.getD1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 28) {
            for (String x : gamut.getE1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 29) {
            for (String x : gamut.getF1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 30) {
            for (String x : gamut.getG1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 31) {
            for (String x : gamut.getH1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 32) {
            for (String x : gamut.getI1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 33) {
            for (String x : gamut.getJ1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 34) {
            for (String x : gamut.getK1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 35) {
            for (String x : gamut.getL1()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else {
            return "";
        }
        return "";
    }

    public String if2(String currentNote, String newNote) {
        if (gamut.getA0().contains(currentNote)) {
            jumper = 0;
        } else if (gamut.getB0().contains(currentNote)) {
            jumper = 1;
        } else if (gamut.getC0().contains(currentNote)) {
            jumper = 2;
        } else if (gamut.getD0().contains(currentNote)) {
            jumper = 3;
        } else if (gamut.getE0().contains(currentNote)) {
            jumper = 4;
        } else if (gamut.getF0().contains(currentNote)) {
            jumper = 5;
        } else if (gamut.getG0().contains(currentNote)) {
            jumper = 6;
        } else if (gamut.getH0().contains(currentNote)) {
            jumper = 7;
        } else if (gamut.getI0().contains(currentNote)) {
            jumper = 8;
        } else if (gamut.getJ0().contains(currentNote)) {
            jumper = 9;
        } else if (gamut.getK0().contains(currentNote)) {
            jumper = 10;
        } else if (gamut.getL0().contains(currentNote)) {
            jumper = 11;
        } else if (gamut.getA().contains(currentNote)) {
            jumper = 12;
        } else if (gamut.getB().contains(currentNote)) {
            jumper = 13;
        } else if (gamut.getC().contains(currentNote)) {
            jumper = 14;
        } else if (gamut.getD().contains(currentNote)) {
            jumper = 15;
        } else if (gamut.getE().contains(currentNote)) {
            jumper = 16;
        } else if (gamut.getF().contains(currentNote)) {
            jumper = 17;
        } else if (gamut.getG().contains(currentNote)) {
            jumper = 18;
        } else if (gamut.getH().contains(currentNote)) {
            jumper = 19;
        } else if (gamut.getI().contains(currentNote)) {
            jumper = 20;
        } else if (gamut.getJ().contains(currentNote)) {
            jumper = 21;
        } else if (gamut.getK().contains(currentNote)) {
            jumper = 22;
        } else if (gamut.getL().contains(currentNote)) {
            jumper = 23;
        } else if (gamut.getA1().contains(currentNote)) {
            jumper = 24;
        } else if (gamut.getB1().contains(currentNote)) {
            jumper = 25;
        } else if (gamut.getC1().contains(currentNote)) {
            jumper = 26;
        } else if (gamut.getD1().contains(currentNote)) {
            jumper = 27;
        } else if (gamut.getE1().contains(currentNote)) {
            jumper = 28;
        } else if (gamut.getF1().contains(currentNote)) {
            jumper = 29;
        } else if (gamut.getG1().contains(currentNote)) {
            jumper = 30;
        } else if (gamut.getH1().contains(currentNote)) {
            jumper = 31;
        } else if (gamut.getI1().contains(currentNote)) {
            jumper = 32;
        } else if (gamut.getJ1().contains(currentNote)) {
            jumper = 33;
        } else if (gamut.getK1().contains(currentNote)) {
            jumper = 34;
        } else if (gamut.getL1().contains(currentNote)) {
            jumper = 35;
        }
        Integer toJump = jumper - getCurrentLength();
        if (toJump == 0) {
            for (String x : gamut.getA0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 1) {
            for (String x : gamut.getB0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 2) {
            for (String x : gamut.getC0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 3) {
            for (String x : gamut.getD0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 4) {
            for (String x : gamut.getE0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 5) {
            for (String x : gamut.getF0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 6) {
            for (String x : gamut.getG0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 7) {
            for (String x : gamut.getH0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 8) {
            for (String x : gamut.getI0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 9) {
            for (String x : gamut.getJ0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 10) {
            for (String x : gamut.getK0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 11) {
            for (String x : gamut.getL0()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 12) {
            for (String x : gamut.getA()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 13) {
            for (String x : gamut.getB()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 14) {
            for (String x : gamut.getC()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 15) {
            for (String x : gamut.getD()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 16) {
            for (String x : gamut.getE()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 17) {
            for (String x : gamut.getF()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 18) {
            for (String x : gamut.getG()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 19) {
            for (String x : gamut.getH()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 20) {
            for (String x : gamut.getI()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 21) {
            for (String x : gamut.getJ()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 22) {
            for (String x : gamut.getK()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 23) {
            for (String x : gamut.getL()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 24) {
            for (String x : gamut.getA()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 25) {
            for (String x : gamut.getB()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 26) {
            for (String x : gamut.getC()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 27) {
            for (String x : gamut.getD()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 28) {
            for (String x : gamut.getE()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 29) {
            for (String x : gamut.getF()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 30) {
            for (String x : gamut.getG()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 31) {
            for (String x : gamut.getH()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 32) {
            for (String x : gamut.getI()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 33) {
            for (String x : gamut.getJ()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 34) {
            for (String x : gamut.getK()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else if (toJump == 35) {
            for (String x : gamut.getL()) {
                if (x.charAt(0) == newNote.charAt(0)) {
                    return x;
                }
            }
        } else {
            return "";
        }
        return "";
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public void setCurrentNote(String currentNote) {
        this.currentNote = currentNote;
    }

    public String getCurrentNote() {
        return currentNote;
    }

    public String getCurrentChromatic() {
        return currentChromatic;
    }

    public void setCurrentChromatic(String currentChromatic) {
        this.currentChromatic = currentChromatic;
    }

    public String getCurrentInterval() {
        return currentInterval;
    }

    public void setCurrentInterval(String currentInterval) {
        this.currentInterval = currentInterval;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public void setCurrentLength(int currentLength) {
        this.currentLength = currentLength;
    }

    public int getCurrentJump() {
        return currentJump;
    }

    public void setCurrentJump(int currentJump) {
        this.currentJump = currentJump;
    }
}
