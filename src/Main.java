
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate CD = new Candidate(name, percentage, backlogs, graduationYear);
        System.out.println("Candidate: " + CD.getName());
        System.out.println("Percentage: " + CD.getPercentage());
        System.out.println("Backlogs: " + CD.getBacklogs());
        System.out.println("Graduation Year: " + CD.getGraduationYear());
        scanner.close();

    }

}
