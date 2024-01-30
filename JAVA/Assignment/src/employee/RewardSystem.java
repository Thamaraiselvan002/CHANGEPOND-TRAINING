package employee;
import java.util.*;

public class RewardSystem {

    public static void main(String[] args) {
        LinkedList<String> emp = new LinkedList<>();
        emp.add("partha");
        emp.add("thamss");
        emp.add("sandy");
        emp.add("ulaga");
        emp.add("sathya");
        emp.add("pradeep");
        emp.add("muthu");
        emp.add("anandh");
        emp.add("ksihore");
        emp.add("dola");

        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("1. List of employees in the company");
            System.out.println("2. Select for reward handler");
            System.out.print("Enter your choice: ");
            int switchChoice = scanner.nextInt();

            switch (switchChoice) {
                case 1:
                    int count = 1;
                    System.out.println("List of Employees:");
                    for (String employee : emp) {
                        System.out.println(count + ". " + employee);
                        count++;
                    }
                    break;

                case 2:
                    System.out.print("Enter a random month (1 to 12): ");
                    int randomMonth = scanner.nextInt();

                    System.out.print(randomMonth+"th -->"+" month reward handler is  "  + ":");

                    if (!emp.isEmpty()) {
                        Random random = new Random();
                        int luckyWinnerIndex = random.nextInt(emp.size());
                        String luckyWinner = emp.get(luckyWinnerIndex);
                        System.out.println(luckyWinner);
                    } else {
                        System.out.println("No employees to select as a lucky winner.");
                    }
                    break;
            }
            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next().toLowerCase();

            if (!continueChoice.equals("yes")) {
                System.out.println("Thank you");
                continueProgram = false;
            }
        }

        scanner.close();
    }
}