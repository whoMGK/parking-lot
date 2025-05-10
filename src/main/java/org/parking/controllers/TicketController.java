package org.parking.controllers;

import org.parking.dto.IssueTicketRequestDTO;
import org.parking.dto.IssueTicketResponseDTO;
import org.parking.models.Ticket;
import org.parking.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(), requestDTO.getVehicleNumber(), requestDTO.getEntryTime(), requestDTO.getVehicleType());
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        responseDTO.setTicketId(ticket.getId());
        responseDTO.setEntryTime(ticket.getEntryTime());
        responseDTO.setParkingSlot(ticket.getParkingSlot());
        responseDTO.setVehicle(ticket.getVehicle());

        return responseDTO;
    }
}

