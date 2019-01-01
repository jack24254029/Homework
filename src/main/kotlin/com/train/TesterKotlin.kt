package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val totalTicketCount = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTripTicketCount = scanner.nextInt()
    val ticket = KotlinTicket(totalTicketCount, roundTripTicketCount)
    ticket.calculate()
}