package org.knit.jnbovfavhk.sem2.lab2_1.Task2_1Classes;

import org.knit.jnbovfavhk.TaskDescription;

@TaskDescription(number = 26, description = "Chain of Responsibility\n" +
        "Реализуйте систему обработки жалоб клиентов в банке.\n" +
        "\n" +
        "    Жалоба сначала поступает в колл-центр.\n" +
        "    Если проблема сложная, запрос передается менеджеру.\n" +
        "    Если даже менеджер не может решить проблему, запрос уходит в юридический отдел.\n" +
        "    Каждый уровень обработки либо решает проблему, либо передает ее дальше. (не менее 4х уровней поддержки)\n" +
        "    Представить проблему в виде объекта, с описанием, уровнем сложности.\n", href = "org/knit/jnbovfavhk/sem2/lab2_1/Task2_1Classes")
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
