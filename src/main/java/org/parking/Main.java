package org.parking;

import org.parking.controllers.TicketController;
import org.parking.dto.IssueTicketRequestDTO;
import org.parking.dto.IssueTicketResponseDTO;
import org.parking.models.VehicleType;
import org.parking.repositories.GateRepository;
import org.parking.repositories.ParkingSlotRepository;
import org.parking.repositories.TicketRepository;
import org.parking.repositories.VehicleRepository;
import org.parking.services.TicketService;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create Ticket
        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setEntryTime(new Date());
        issueTicketRequestDTO.setGateId(1L);
        issueTicketRequestDTO.setVehicleNumber("KA01FA4747");
        issueTicketRequestDTO.setVehicleType(VehicleType.FOUR_WHEELER);

        TicketService ticketService = new TicketService(new VehicleRepository(), new GateRepository(), new TicketRepository(), new ParkingSlotRepository());
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDTO ticket = ticketController.issueTicket(issueTicketRequestDTO);
        System.out.println(ticket.getTicketId() + " " + ticket.getEntryTime());

    }
}