package com.github.maciejpalczak.music;

import com.github.maciejpalczak.music.NotesGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static final NotesGenerator notesGenerator = new NotesGenerator();
    private static final Templates templates = new Templates();
    private static final Gamut gamut = new Gamut();

    public static void main(String[] args) {
        System.out.println("Enter the time(metrum): ");
        String metrum = scanner.nextLine();
        System.out.println("Enter number of tacts: ");
        String number = scanner.nextLine();
        System.out.println("Enter the first tone: ");
        String tone = scanner.nextLine();
        System.out.println("Enter the lower value of ambitus: ");
        String low = scanner.nextLine();
        System.out.println("Enter the lower value of ambitus: ");
        String high = scanner.nextLine();
        save(generateMainTask(metrum, number, tone, low, high));
        /*notesGenerator.generateInterval();
        String inter=notesGenerator.getCurrentInterval();
        List<String>basic=gamut.getBasic();
        List<String[]>values=gamut.getValues();
        String currentNote="c";
        String newNote=basic.get(basic.indexOf(currentNote.substring(0,1))+Integer.valueOf(notesGenerator.getCurrentInterval().substring(0,1))-1);
        Integer indexOfCurrentValue=values.indexOf(currentNote);
        System.out.println(inter);
        System.out.println(newNote);
        System.out.println(indexOfCurrentValue);*/
    }

    public static String generateMainTask(String metric, String tacts, String tone, String low, String high) {

        String text = templates.getTemplate() + templates.getPre2() + "\\time " + metric + " ";
        int currentValue = 0;
        text += tone + notesGenerator.generateValue() + " ";
        notesGenerator.setCurrentNote(tone);
        int cur = Integer.valueOf(notesGenerator.getCurrentValue());
        if (cur == 16) {
            currentValue += 1;
        } else if (cur == 8) {
            currentValue += 2;
        } else if (cur == 4) {
            currentValue += 4;
        } else if (cur == 2) {
            currentValue += 8;
        } else if (cur == 1) {
            currentValue += 16;
        }
        int destiny = Integer.valueOf(metric.substring(0, 1)) * Integer.valueOf(tacts) * 4;
        while (currentValue <= (destiny)) {
            /*if (currentValue >= (destiny)) {
                notesGenerator.generateValue();
                if (currentValue + (1 / 16 / (Math.round(Double.valueOf(notesGenerator.getCurrentValue())))) <= (Integer.valueOf(metric.substring(0, 1)) * Integer.valueOf(tacts) * 4))
                    text += notesGenerator.generateNote() + notesGenerator.getCurrentValue() + notesGenerator.generateChromatic() + " ";
            } else if (currentValue % 16 == 0) {
                text += "\n";
            } else {

                */
            if (notesGenerator.getCurrentNote() == null || notesGenerator.getCurrentNote() == "") {
                notesGenerator.setCurrentNote(tone);
            } else  {
                String nownow=notesGenerator.generateNextNote(notesGenerator.getCurrentNote(), low, high) + notesGenerator.generateValue() + notesGenerator.generateChromatic() + " ";
                if (notesGenerator.getCurrentNote() == null || notesGenerator.getCurrentNote() == "") {
                    notesGenerator.setCurrentNote(tone);
                }
                else {
                    text +=nownow;
                    if (Integer.valueOf(notesGenerator.getCurrentValue()) == 16 && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += 1;
                    } else if (Integer.valueOf(notesGenerator.getCurrentValue()) == 8 && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += 2;
                    } else if (Integer.valueOf(notesGenerator.getCurrentValue()) == 4 && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += 4;
                    } else if (Integer.valueOf(notesGenerator.getCurrentValue()) == 2 && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += 8;
                    } else if (Integer.valueOf(notesGenerator.getCurrentValue()) == 1 && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += 16;
                    } else if (notesGenerator.getCurrentChromatic() == "." && notesGenerator.getCurrentNote() != null && notesGenerator.getCurrentNote() != "") {
                        currentValue += (1 / 16 / (Math.round(Double.valueOf(notesGenerator.getCurrentValue()))));
                    }
                }
            }
        }

        return text + templates.getPost2();
    }

    public static void save(String text) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("text.ly"));
        } catch (IOException e) {
            logger.error("IO exception");
        }
        try {
            out.write(text);

        } finally {
            out.close();
        }
    }
}
   /* public void generalMain() {
        System.out.println("Choose the task you want to do: \n\n1. C-dur melody.\n2. Random melody with given metrum and number of notes.\n3. Random melody with given key, metrum, number of notes, ambitus, propability of chosen tones.\nEnter: ");
        int choose = scanner.nextInt();
        if (choose == 1) {
            save(generateTaskOne());
        }
        if (choose == 2) {
            System.out.println("Enter the time(metrum): ");
            scanner.nextLine();
            String metrum = scanner.nextLine();
            System.out.println("Enter number of notes: ");
            int number = scanner.nextInt();
            save(generateTaskTwo(metrum, number));
        }
        if (choose == 3) {
            System.out.println("Enter the time(metrum): ");
            scanner.nextLine();
            String metrum = scanner.nextLine();
            System.out.println("Enter number of notes: ");
            int number = scanner.nextInt();
            System.out.println("Enter the key: ");
            scanner.nextLine();
            String key = scanner.nextLine();
            System.out.println("Enter the ambitus: ");
            String ambitus = scanner.nextLine();
            System.out.println("Enter the propability for chosen frequency(format as one string e.g. \"c'=0.2 d=0.1 gis=0.05\", \"fis=0.5\": ");
            String propability = scanner.nextLine();
            save(generateTaskThree(key, metrum, number, ambitus, propability));
        }
    }
    public static String generateTaskOne() {
        String text = templates.getTemplate() + templates.getPre1();
        return text + templates.getPost1();
    }
    public static String generateTaskTwo(String metric, int n) {
        int j = 0;
        int i = 0;
        String text = templates.getTemplate() + templates.getPre2() + "\\time " + metric + " ";
        while (i < n) {
            text += notesGenerator.generateNote() + "4 ";
            i++;
        }
        if (n % Integer.valueOf(metric.substring(metric.length() - 1)) != 0) {
            int x = Integer.valueOf(metric.substring(0, 1)) - n % Integer.valueOf(metric.substring(0, 1));
            while (j < x) {
                text += "r4 ";
                j++;
            }
        }
        return text + templates.getPost2();
    }
    public static String generateTaskThree(String key, String metric, int n, String ambitus, String propability) {
        int j = 0;
        int i = 0;

        String text = templates.getTemplate() + templates.getPre3() + key + "\n" + "\\time " + metric + " ";
        while (i < n) {
            text += notesGenerator.generateNote() + "4 ";
            i++;
        }
        if (n % Integer.valueOf(metric.substring(metric.length() - 1)) != 0) {
            int x = Integer.valueOf(metric.substring(metric.length() - 1)) - n % Integer.valueOf(metric.substring(metric.length() - 1));
            while (j < x) {
                text += "r4 ";
                j++;
            }
        }
        return text + templates.getPost2();
    }*/
