import java.util.ArrayList;

public class Inheritance {

    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();

        Worker worker1 = new Worker("000001", "James", "Johnson", "Mr.", 1999, 10);
        Worker worker2 = new Worker("000002", "Emma", "Smith", "Mrs.", 1985, 20);
        Worker worker3 = new Worker("000003", "Lisa", "Jose", "Ms.", 1973, 15);

        SalaryWorker sWorker1 = new SalaryWorker("000004", "Jackson", "Pinchot", "Mr.", 2000, 30, 62400);
        SalaryWorker sWorker2 = new SalaryWorker("000005", "Tom", "Thompson", "Mr.", 1950, 50, 104000);
        SalaryWorker sWorker3 = new SalaryWorker("000006", "Daniel", "Daniels", "Mr.", 1965, 20, 41600);

        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        workerList.add(sWorker1);
        workerList.add(sWorker2);
        workerList.add(sWorker3);

        // Go through workerList for week 1

        for (Worker w: workerList)
        {
            System.out.println(w.displayWeeklyPay(40));
        }

        System.out.println("\n\n\n");

        for (Worker w: workerList)
        {
            System.out.println(w.displayWeeklyPay(50));
        }

        System.out.println("\n\n\n");

        for (Worker w: workerList)
        {
            System.out.println(w.displayWeeklyPay(40));
        }
    }
}
