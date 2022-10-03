package dayfive;

import java.util.Scanner;

public class ContohScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
        int usia = scanner.nextInt();
        System.out.println("Nama : "+nama);
        System.out.println("Usia : "+usia);
    }
}