package com.github.maciejpalczak.music;

import com.github.maciejpalczak.music.NotesGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static final NotesGenerator notesGenerator = new NotesGenerator();
    private static final Templates templates = new Templates();


    public static void main(String[] args) {

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
        String text = templates.getTemplate() + templates.getPre2() + "\\time " + metric;
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
        String text = templates.getTemplate() + templates.getPre2() + "\\time " + metric;
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
