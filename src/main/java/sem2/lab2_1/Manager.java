package sem2.lab2_1;

public class Manager extends Approver {

    @Override
    protected boolean canApprove(ClientProblem complaint) {
        if (ProblemDifficulty.NORMAL.equals(complaint.getDifficulty())) {
            return true;
        }
        return false;
    }

    @Override
    protected void approve(ClientProblem complaint) {
        if (canApprove(complaint)) {
            System.out.println("Получен ответ от менеджера");
        } else {
            nextApprover.approve(complaint);
        }
    }

    public Manager(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
