package org.parking.dto;

import org.parking.models.ParkingSlot;
import org.parking.models.Ticket;
import org.parking.models.Vehicle;

import java.util.Date;

public class IssueTicketResponseDTO {
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSlot parkingSlot;
    private long ticketId;

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

}
