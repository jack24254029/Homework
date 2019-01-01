package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int ticketsCount = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTripCount = scanner.nextInt();
        JavaTicket ticket = new JavaTicket(ticketsCount, roundTripCount);
        ticket.calculate();
    }
}
