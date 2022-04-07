package by.itstep.khodosevich.eightproject.task02.controller;

import by.itstep.khodosevich.eightproject.view.Print;

import java.util.Scanner;
import static by.itstep.khodosevich.eightproject.task02.module.logic.Card.*;

public class ControllerCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Print.print("Input number of card suit (1-4): ");
        int cardSuit = scanner.nextInt();
        Print.print("Input number of card name (6-14): ");
        int cardName = scanner.nextInt();

        String cardSuitString = getCardSuit(cardSuit);
        String cardNameString = getCardName(cardName);
        String msg = String.format("Your card is \"%s\" and has suit is \"%s\".", cardNameString, cardSuitString);

        Print.print(msg);
        scanner.close();

    }
}
