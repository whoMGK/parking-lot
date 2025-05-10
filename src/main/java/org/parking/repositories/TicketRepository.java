package org.parking.repositories;

import org.parking.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new HashMap<>();
    private long previousTicketID = 0L;

    public Optional<Ticket> getTicket(long id) {
        return Optional.ofNullable(tickets.get(id));
    }

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == null) {
            previousTicketID++;
            ticket.setId(previousTicketID);
            tickets.put(ticket.getId(), ticket);
        }
        return ticket;
    }
}
