package by.itstep.khodosevich.eightproject.task01.controller;

import by.itstep.khodosevich.eightproject.task01.logic.Mark;
import by.itstep.khodosevich.eightproject.task01.view.Print;

import java.util.Scanner;

public class ControllerMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Print.print("Input your mark:");
        int mark = scanner.nextInt();

        String msg = Mark.getStringEquivalentOfMark(mark);
        Print.print(msg);

        scanner.close();
    }
}
