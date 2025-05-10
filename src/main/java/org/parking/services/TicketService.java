package org.parking.services;

import org.parking.models.*;
import org.parking.repositories.GateRepository;
import org.parking.repositories.ParkingSlotRepository;
import org.parking.repositories.TicketRepository;
import org.parking.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public TicketService(VehicleRepository vehicleRepository, GateRepository gateRepository, TicketRepository ticketRepository, ParkingSlotRepository parkingSlotRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    public Ticket issueTicket(long gateNumber, String vehicleNumber, Date entryTime, VehicleType vehicleType) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(entryTime);

        Optional<Gate> gate = gateRepository.findById(gateNumber);
        if (gate.isPresent()) {
            ticket.setEntryGate(gate.get());
        } else {
//            System.out.println("Gate not found");
        }

        Optional<Vehicle> vehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if (vehicle.isPresent()) {
            ticket.setVehicle(vehicle.get());
        } else {
            ticket.setVehicle(vehicleRepository.save(new Vehicle(vehicleNumber, vehicleType)));
        }

        ticketRepository.save(ticket);

        return ticket;
    }
}
