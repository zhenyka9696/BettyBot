package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class BettyBotter {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/com/company/bettybotter"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null) {
                    sb.append(s);
                    sb.append(System.lineSeparator());
                }
            } while (s != null);

        } catch (FileNotFoundException e) {

//System.out.println
         //   ("File not found");
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
