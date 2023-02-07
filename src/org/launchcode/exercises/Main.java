package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        //Divide(4,2);
        //Divide(7,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            CheckFileExtension(entry.getValue());
        }

        // Test out your CheckFileExtension() function!
        /*ArrayList<String> files = new ArrayList<String>();
        files.add("myFile.java");
        files.add("myFile2.exe");
        files.add("");
        files.add(null);

        for (String i: files) {
            CheckFileExtension(i);
        }*/
    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(x / y);
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int points = 0;
        String lastFiveChars = "";

        if (fileName == null || fileName.equals("")) {
            try {
                throw new NullPointerException("File name value is empty or null!");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        if (fileName.length() < 6) {
            points = 0;
        } else if (fileName.length() >= 6) {
            lastFiveChars = fileName.substring(fileName.length() -5);
            if (lastFiveChars.equals(".java")) {
                points = 1;
            }
        }
        System.out.println(points + " points awarded for: " + fileName);
        return points;
    }
}
