import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        String[] third = {"one", "two", "three"};

        System.out.println("Задание 2");
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.print(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.print(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.print(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
        System.out.println("\n\nЗадание 3");
        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        for (int i = third.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
        System.out.println("\n\nЗадание 4");
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
            System.out.print(first[i] + " ");
        }
        System.out.println("\n\nЗадание 4");
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
        }
        System.out.print(Arrays.toString(first));
    }
}