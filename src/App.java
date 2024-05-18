import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama mahasiswa (ketik 'selesai' untuk berhenti): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                names.add(input);
                System.out.println("Nama ke-" + names.size() + ": " + input);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("\nDaftar Nama Mahasiswa:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}