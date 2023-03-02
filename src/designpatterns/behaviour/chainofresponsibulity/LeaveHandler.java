package designpatterns.behaviour.chainofresponsibulity;

public abstract class LeaveHandler {
    protected LeaveHandler superVisor;

    public LeaveHandler() {
    }

    public LeaveHandler(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }
    public abstract String applyLeave(Leave leave);
}
