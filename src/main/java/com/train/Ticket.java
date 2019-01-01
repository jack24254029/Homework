package com.train;

public class Ticket {
    private final int singleTripTicketPrice = 1000;
    private final float roundTripTicketPrice = singleTripTicketPrice * 2 * .9f;
    private int singleTripCount, roundTripCount;

    public Ticket(int singleTripCount, int roundTripCount) {
        this.singleTripCount = singleTripCount;
        this.roundTripCount = roundTripCount;
    }

    public void calculate() {
        int totalTicketCount = singleTripCount + roundTripCount;
        int total = (int) (singleTripCount * singleTripTicketPrice + roundTripCount * roundTripTicketPrice);
        System.out.println("Total tickets: " + totalTicketCount + "\n" +
                "Round-trip: " + roundTripCount + "\n" +
                "Total: " + total);
    }
}
