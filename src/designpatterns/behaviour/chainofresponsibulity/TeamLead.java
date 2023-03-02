package designpatterns.behaviour.chainofresponsibulity;

public class TeamLead extends LeaveHandler{

   private LeaveHandler superVisor;

    public LeaveHandler getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public String applyLeave(Leave leave) {
        //"reasonType" is not going to be considered under TeamLeader & ProjectLeader
        //Team Leader can approve up to 7 days, otherwise it will pass to the Project Leader
        if(leave.getNumberOfDays() <= 7){
            //Employee tier should be 4 or above to get approved
            if(leave.getEmpTier() <= 4){
                return "Your leave days has been APPROVED by TeamLeader";
            }else{
                return "You employee Tier level is too low for request " + leave.getNumberOfDays() + " days";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }
}
