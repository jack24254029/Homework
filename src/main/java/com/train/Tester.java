package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 1, ticketsCount = 0, roundTripCount = 0;
        while (step <= 3) {
            switch (step) {
                case 1:
                    System.out.print("Please enter number of tickets: ");
                    ticketsCount = scanner.nextInt();
                    if (ticketsCount > 0) {
                        step++;
                    } else {
                        System.out.println("Number have to more than 0.");
                    }
                    break;
                case 2:
                    System.out.print("How many round-trip tickets: ");
                    roundTripCount = scanner.nextInt();
                    if (roundTripCount > 0 && roundTripCount <= ticketsCount) {
                        step++;
                    } else {
                        System.out.println("Number have to more then 0 and less than number of tickets.");
                    }
                    break;
                case 3:
                    JavaTicket ticket = new JavaTicket(ticketsCount, roundTripCount);
                    ticket.calculate();
                    step++;
                    break;
            }
        }
    }
}
