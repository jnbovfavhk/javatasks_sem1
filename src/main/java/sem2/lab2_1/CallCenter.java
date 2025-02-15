package sem2.lab2_1;

public class CallCenter extends Approver {

    @Override
    protected boolean canApprove(ClientProblem p) {
        if (ProblemDifficulty.SIMPLE == p.getDifficulty()){
            return true;
        }
        return false;
    }

    @Override
    protected void approve(ClientProblem p) {
        if (canApprove(p)) {
            System.out.println("Получен ответ от колл-центра");
        } else {
            nextApprover.approve(p);
        }
    }

    public CallCenter(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
