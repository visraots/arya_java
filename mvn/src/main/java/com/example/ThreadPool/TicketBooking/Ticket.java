package com.example.ThreadPool.TicketBooking;

public class Ticket {
    static Integer tickets=100;
    static int users=3;
    public static void main (String [] args){
        for(int i=0;i<users;i++){

            Thread t=new ThreadTickets(2);
            t.start();
        }

        System.out.println(tickets);
    }
}
