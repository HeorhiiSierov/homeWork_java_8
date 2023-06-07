import java.util.Scanner;

public class Home_Work_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача со сломанным лифтом
        System.out.print("Введите высоту здания: ");
        int H = scanner.nextInt();
        System.out.print("Введите количество этажей подъема: ");
        int N = scanner.nextInt();
        System.out.print("Введите количество этажей спуска: ");
        int M = scanner.nextInt();
        int numberOfLifts = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов: " + numberOfLifts);

        // Задача с подсчетом оценок
        System.out.print("Введите количество учеников: ");
        int n = scanner.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите оценку для ученика " + (i + 1) + ": ");
            String grade = scanner.next();
            grades[i] = counter(grade);
        }

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int grade : grades) {
            if (grade == 4) {
                countA++;
            } else if (grade == 3) {
                countB++;
            } else if (grade == 2) {
                countC++;
            } else if (grade == 1) {
                countD++;
            }
        }

        System.out.println("Количество оценок:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
    }

    private static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int lifts = 0;
        while (floor > 0) {
            lifts++;
            floor -= stepUp;
            if (floor <= 0) {
                break;
            }
            floor += stepDown;
        }
        return lifts;
    }

    private static int counter(String grade) {
        switch (grade) {
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            default:
                return 0;
        }
    }
}
