package designpatterns.behaviour.chainofresponsibulity;

public class Manager extends LeaveHandler{

    private LeaveHandler superVisor;

    public LeaveHandler getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }
    @Override
    public String applyLeave(Leave leave) {
        if (leave.getNumberOfDays() > 21) {
            //Employee tier should be 2 or above & reason type should be "Special" to get approved
            if (leave.getEmpTier() <= 2 && leave.getReason().equals(ReasonType.SPECIAL)) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
        return "Your leave request has been DENIED by Manager";

    }
}
