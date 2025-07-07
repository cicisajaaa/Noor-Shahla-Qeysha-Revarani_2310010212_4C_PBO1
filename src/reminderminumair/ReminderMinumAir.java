
package reminderminumair;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;


public class ReminderMinumAir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            LocalDate hariIni = LocalDate.now();
            
            WaterReminder[] pengguna = new WaterReminder[10];
            int jumlahPengguna = 2;
            
            pengguna[0] = new WaterReminder("Qeysha", 2000);
            pengguna[1] = new WaterReminder("Cici", 1800);
            
            System.out.println("====================");
            System.out.println("APLIKASI PENGINGAT MINUM AIR SEDERHANA");
            System.out.println("====================");
            
            System.out.println("Masukkan nama Anda: ");
            String nama = input.nextLine();
            
           int target = 0;
            while (true) {
                System.out.print("Masukkan Target Minum Harian Anda (ml): ");
                try {
                    target = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(" Input harus berupa angka!");
                    input.nextLine(); 
                }
            }

            
            pengguna[jumlahPengguna] = new WaterReminder(nama, target);
            WaterReminder reminder = pengguna[jumlahPengguna];
            jumlahPengguna++;
            
            User penggunaAktif = reminder;
            penggunaAktif.tampilkanProfil();
            int pilihan =-1;
          
            
            while (pilihan !=0){
                System.out.println("\n===== MENU =====");
                System.out.println("1. Tambah Minum Hari Ini: ");
                System.out.println("2. Lihat Progress Hari Ini");
                System.out.println("3. Tambah Minum pada Tanggal Lain");
                System.out.println("4. Edit Minum Pada Tanggal Tertentu");
                System.out.println("5. Lihat Riwayat Minum");
                System.out.println("6. Ubah Target Harian");
                System.out.println("0. Keluar");
                try {
                    System.out.print("Pilihan: ");
                    pilihan = input.nextInt();
                    input.nextLine(); 
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    input.nextLine(); 
                    continue;
                }

                
                switch (pilihan) {
                    case 1 -> {
                        try {
                            System.out.print("Masukkan Jumlah Air (ml): ");
                            int jumlah = input.nextInt();
                            reminder.tambahAir(hariIni, jumlah);
                        } catch (InputMismatchException e) {
                            System.out.println("Input tidak valid. Harus angka.");
                            input.nextLine();
                        }
                    }

                    case 2 -> 
                        reminder.lihatProgress(hariIni);
                    case 3 -> {
                        try {
                            System.out.print("Masukkan Tanggal (yyyy-mm-dd): ");
                            String tglInput = input.nextLine();
                            LocalDate tanggalLain = LocalDate.parse(tglInput);

                            System.out.print("Jumlah Air (ml): ");
                            int jml = input.nextInt();
                            reminder.tambahAir(tanggalLain, jml);
                        } catch (DateTimeParseException e) {
                            System.out.println("Format tanggal salah. Gunakan yyyy-mm-dd.");
                        } catch (InputMismatchException e) {
                            System.out.println("Jumlah air harus berupa angka.");
                            input.nextLine();
                        }
                    }

                    case 4 -> {
                        try {
                            System.out.print("Masukkan Tanggal yang ingin diedit (yyyy-mm-dd): ");
                            String editTgl = input.nextLine();
                            LocalDate editTanggal = LocalDate.parse(editTgl);

                            System.out.print("Jumlah air baru (ml): ");
                            int baru = input.nextInt();
                            reminder.editAir(editTanggal, baru);
                        } catch (DateTimeParseException e) {
                            System.out.println("Format tanggal salah. Gunakan yyyy-mm-dd.");
                        } catch (InputMismatchException e) {
                            System.out.println("Jumlah air harus berupa angka.");
                            input.nextLine();
                        }
                    }

                    case 5 -> 
                       reminder.lihatRiwayat();
                    case 6 -> {
                        try {
                            System.out.print("Masukkan Target Harian Baru (ml): ");
                            int targetBaru = input.nextInt();
                            reminder.setTargetHarian(targetBaru);
                        } catch (InputMismatchException e) {
                            System.out.println("Input harus berupa angka.");
                            input.nextLine();
                        }
                    }

                    case 0 ->
                        System.out.println("Terimakasih sudah menggunakan aplikasi ini.");
                    default ->
                        System.out.println("Pilihan Tidak Tersedia.");
                
            }
        }
    } 
}
}
