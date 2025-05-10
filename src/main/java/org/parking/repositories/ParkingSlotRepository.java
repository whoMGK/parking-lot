package org.parking.repositories;

import org.parking.models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingSlotRepository {
    private Map<Long, ParkingSlot> parkingSlots = new HashMap<>();
    private Long previousID = 0L;

    public Optional<ParkingSlot> findById(Long id) {
        return Optional.ofNullable(parkingSlots.get(id));
    }


    public ParkingSlot save(ParkingSlot parkingSlot) {
        if (parkingSlot.getId() == null) {
            previousID++;
            parkingSlot.setId(previousID);
            parkingSlots.put(parkingSlot.getId(), parkingSlot);
        }
        return parkingSlot;
    }
}
