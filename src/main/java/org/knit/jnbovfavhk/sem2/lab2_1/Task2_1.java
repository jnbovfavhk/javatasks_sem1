package org.knit.jnbovfavhk.sem2.lab2_1;

public class Task2_1 {
    public static void execute() {
        ClientProblem problem = new ClientProblem(ProblemDifficulty.NORMAL, "Документы",
                "как сделать справку номер 4627831546702364789");
        ClientProblem problem2 = new ClientProblem(ProblemDifficulty.MOST_DIFFICULT,
                "Судимость", "как шггрывепщлрепгриищрииорешгнр");

        Lawyer lawyer = new Lawyer();
        DepartmentConsultant consultant = new DepartmentConsultant(lawyer);
        Manager manager = new Manager(consultant);
        CallCenter callCenter = new CallCenter(manager);

        callCenter.approve(problem);
        callCenter.approve(problem2);
    }
}
