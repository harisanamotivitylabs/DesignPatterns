package designpatterns.behaviour.chainofresponsibulity;

public class MainChain {
    public static void main(String[] args) {
        TeamLead teamLeader = new TeamLead();
        ProjectLeader projectLeader = new ProjectLeader();
        Manager manager = new Manager();
        teamLeader.setSuperVisor(projectLeader);
        projectLeader.setSuperVisor(manager);
        Leave leave1 = new Leave(13,3, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave1));

//        Leave leave2 = new Leave(5,5, ReasonType.REGULAR);
//        System.out.println(teamLeader.applyLeave(leave2));
//        Leave leave3 = new Leave(12,3, ReasonType.REGULAR);
//        System.out.println(teamLeader.applyLeave(leave3));
//
//        Leave leave4 = new Leave(23,2, ReasonType.SPECIAL);
//        System.out.println(teamLeader.applyLeave(leave4));
    }
}
