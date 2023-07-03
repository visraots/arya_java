package com.example.ThreadPool.TicketBooking;

public class ThreadTickets extends Thread {
    int i;
    public ThreadTickets(int i){
        this.i=i;
    }
    @Override
    public void run() {
        synchronized (Ticket.tickets){
            Ticket.tickets=Ticket.tickets-i;
        }
    }
}
