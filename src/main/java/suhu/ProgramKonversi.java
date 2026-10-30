package suhu;

import java.util.Scanner;

public class ProgramKonversi {
    public static void main(String[] args) {

        // Array Converter
        int jumlahKonverter = 4, n = 0;
        KonverterSatuan konverters[] = new KonverterSatuan[jumlahKonverter];
        konverters[n++] = new CelciusFahrenheit();
        konverters[n++] = new FahrenheitCelcius();
        konverters[n++] = new CelciusReamur();
        konverters[n++] = new ReamurCelcius();

        // Object Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Aku adalah Konverter Besaran Suhu");

        // Main Loop
        while (true) {
            // Converter Display
            System.out.println("Silahkan pilih konverter:");
            for (int i = 0; i < konverters.length; i++) {
                System.out
                        .println((i + 1) + ". " + konverters[i].satuanInput() + " ke " + konverters[i].satuanOutput());
            }

            System.out.println("Pilih konverter anda (0 untuk QUIT)");

            // Validation
            if (!sc.hasNextInt()) {
                System.out.println(">> Masukkan harus berupa angka!");
                sc.next();
                continue;
            }

            int pilih = sc.nextInt();

            // Quit Option
            if (pilih == 0) {
                System.out.println("Terima kasih, sampai jumpa!");
                break;
            }

            // Validation
            if (pilih < 0 || pilih > konverters.length) {
                System.out.println(">> Pilihan tidak sah, pilih 0 sampai " + konverters.length);
                continue;
            }
            // Validation: True
            KonverterSatuan k = konverters[pilih - 1];
            System.out.println(">> Anda pilih " + k.satuanInput() + " ke " + k.satuanOutput());

            System.out.println("Masukkan besaran suhu (" + k.satuanInput() + ") : ");
            if (!sc.hasNext()) {
                System.out.println(">> Masukkan harus berupa angka!");
                sc.next();
                continue;
            }

            float nilai = sc.nextFloat();

            // Count and Display
            float hasil = k.konversi(nilai);
            System.out.println(
                    ">> " + nilai + " " + k.satuanInput() + " setara dengan " + hasil + " " + k.satuanOutput());
            System.out.println();
        }
        sc.close();
    }
}
