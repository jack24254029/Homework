package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int ticketsCount = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTripCount = scanner.nextInt();
        int singleTripCount = ticketsCount - roundTripCount;
        Ticket ticket = new Ticket(singleTripCount, roundTripCount);
        ticket.calculate();
    }
}
