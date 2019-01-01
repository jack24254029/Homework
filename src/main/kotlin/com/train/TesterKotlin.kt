package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var step = 1
    var totalTicketCount = 0
    var roundTripTicketCount = 0
    while (step <= 3) {
        when (step) {
            1 -> {
                print("Please enter number of tickets: ")
                totalTicketCount = scanner.nextInt()
                if (totalTicketCount > 0) {
                    step += 1
                } else {
                    println("Number have to more than 0.")
                }
            }
            2 -> {
                print("How many round-trip tickets: ")
                roundTripTicketCount = scanner.nextInt()
                if (roundTripTicketCount in 1..totalTicketCount) {
                    step += 1
                } else {
                    println("Number have to more then 0 and less than number of tickets.")
                }
            }
            3 -> {
                val ticket = KotlinTicket(totalTicketCount, roundTripTicketCount)
                ticket.calculate()
                step += 1
            }
        }
    }
}