
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        Candidate CD = new Candidate(name, percentage, backlogs, graduationYear);
        System.out.println("Candidate: " + CD.getName());
        System.out.println("Percentage: " + CD.getPercentage());
        System.out.println("Backlogs: " + CD.getBacklogs());
        System.out.println("Graduation Year: " + CD.getGraduationYear());
        sc.close();

    }

}
