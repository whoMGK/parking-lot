package org.parking.models;

public class Gate extends BaseModel {

    private GateType gateType;
    private Operator operator;
    private GateStatus status;

    public Gate(long gateNumber, GateType gateType, Operator operator, GateStatus status) {
        this.gateType = gateType;
        this.operator = operator;
        this.status = status;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }
}
