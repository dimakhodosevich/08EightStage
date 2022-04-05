package by.itstep.khodosevich.eightproject.task01.controller;

import by.itstep.khodosevich.eightproject.task01.view.Print;
import java.util.Scanner;
import static by.itstep.khodosevich.eightproject.task01.module.logic.Mark.*;

public class ControllerMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Print.print("Input your mark:");
        int mark = scanner.nextInt();

        String msg = getStringEquivalentOfMark(mark);
        Print.print(msg);

        scanner.close();
    }
}
