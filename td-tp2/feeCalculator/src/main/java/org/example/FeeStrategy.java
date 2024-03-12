package org.example;

public interface FeeStrategy {
    double calculate(TicketType ticketType);
    boolean accept(Visitor visitor);
}
