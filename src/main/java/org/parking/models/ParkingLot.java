package org.parking.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleTypes;
    private FeeCalculationStrategyType feeCalculationStrategyType;
    private ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public ParkingSlotAssignmentStrategy getParkingSlotAssignmentStrategy() {
        return parkingSlotAssignmentStrategy;
    }

    public void setParkingSlotAssignmentStrategy(ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy) {
        this.parkingSlotAssignmentStrategy = parkingSlotAssignmentStrategy;
    }
}
