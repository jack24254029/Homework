package com.train;

public class JavaTicket {
    private final int singleTripTicketPrice = 1000;
    private final float roundTripTicketPrice = singleTripTicketPrice * 2 * .9f;
    private int singleTripCount, roundTripCount, totalTicketCount;

    public JavaTicket(int totalTicketCount, int roundTripCount) {
        this.roundTripCount = roundTripCount;
        this.totalTicketCount = totalTicketCount;
        singleTripCount = totalTicketCount - roundTripCount;
    }

    public void calculate() {
        int total = (int) (singleTripCount * singleTripTicketPrice + roundTripCount * roundTripTicketPrice);
        System.out.println("Total tickets: " + totalTicketCount + "\n" +
                "Round-trip: " + roundTripCount + "\n" +
                "Total: " + total);
    }
}
