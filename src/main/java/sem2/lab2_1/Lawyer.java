package sem2.lab2_1;

public class Lawyer extends Approver {

    @Override
    protected boolean canApprove(ClientProblem complaint) {
        if (ProblemDifficulty.MOST_DIFFICULT.equals(complaint.getDifficulty())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void approve(ClientProblem complaint) {
        if (canApprove(complaint)) {
            System.out.println("Получен ответ от адвоката");
        } else {
            System.out.println("проблема нерешаема");
        }
    }

}
