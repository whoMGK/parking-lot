package org.parking.repositories;

import org.parking.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();
    private Long previousGateId = 0L;

    public Optional<Gate> findById(Long id) {
        return Optional.ofNullable(gates.get(id));
    }

    public Gate save(Gate gate) {
        if (gate.getId() == null) {
            previousGateId++;
            gate.setId(previousGateId);
            gates.put(gate.getId(), gate);
        }
        return gate;
    }
}
