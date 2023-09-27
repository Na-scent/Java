package ch02;

import org.w3c.dom.ls.LSInput;

import javax.swing.*;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        int in1 = Integer.parseInt(str1);
        System.out.println(in1);
    }
}
