package org.parking.repositories;

import org.parking.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public Optional<Vehicle> findByVehicleNumber(String id) {
        return Optional.ofNullable(vehicles.get(id));
    }

    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getvehicleNumber() == null) {
            vehicles.put(vehicle.getvehicleNumber(), vehicle);
        }
        return vehicle;
    }
}
