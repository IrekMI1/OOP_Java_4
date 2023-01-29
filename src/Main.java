import TasksPlanner.Planner;
import Tasks.Task;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Task<Integer> task1 = new Task<>(
                1,
                "12.03.2022",
                "30.03.2022",
                "Mark Hilt",
                "Create UI for app",
                Task.priorityEnum.urgent
        );

        Task<String> task2 = new Task<>(
                "str 1",
                "30.06.2021",
                "30.07.2021",
                "Nell Mety",
                "Develop database",
                Task.priorityEnum.high
        );

        Planner planner = new Planner(task1);

        planner.addTask(task2);
        planner.setCurrentTask(task2);
        System.out.printf("Количество задач: %s\n", planner.getCount());
        planner.showAll();
        planner.exportToCSV();
        planner.exportToJSON();
    }
}