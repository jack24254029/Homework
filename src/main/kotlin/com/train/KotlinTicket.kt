package com.train

class KotlinTicket(private val totalTicketCount: Int, private val roundTripTicketCount: Int) {
    private val singleTripPrice = 1000
    private val roundTripPrice = singleTripPrice * 2 * .9f
    private val singleTripTicketCount: Int = totalTicketCount - roundTripTicketCount
    fun calculate() {
        val total: Int = (singleTripTicketCount * singleTripPrice + roundTripTicketCount * roundTripPrice).toInt()
        print("Total tickets: $totalTicketCount\nRound-trip: $roundTripTicketCount\nTotal: $total")
    }
}