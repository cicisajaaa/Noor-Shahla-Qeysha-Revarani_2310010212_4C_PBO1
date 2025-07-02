
package reminderminumair;

import java.time.LocalDate;
import java.util.Scanner;

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
            
            System.out.println("Masukkan Target Minum Harian Anda (ml) : ");
            int target = input.nextInt();
            
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
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");
                pilihan = input.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.println("Masukkan Jumlah Air (ml): ");
                        int jumlah = input.nextInt();
                        reminder.tambahAir(hariIni, jumlah);
                    }
                    case 2 -> 
                        reminder.lihatProgress(hariIni);
                    case 3 -> {
                        input.nextLine();
                        System.out.println("Masukkan Tanggal (yyyy-mm-dd): ");
                        String tglInput = input.nextLine();
                        LocalDate tanggalLain = LocalDate.parse(tglInput);
                        System.out.println("Jumlah Air (ml): ");
                        int jml = input.nextInt();
                      reminder.tambahAir(tanggalLain, jml);
                    }
                    case 4 -> { 
                        input.nextLine();
                        System.out.println("Masukkan Tanggal yang ingin di edit (yyyy-mm-dd): ");
                        String editTgl = input.nextLine();
                        LocalDate editTanggal = LocalDate.parse(editTgl);
                        System.out.println("Jumlah air baru (ml): ");
                        int baru = input.nextInt();
                        reminder.editAir(editTanggal, baru);
                    }
                    case 5 -> 
                       reminder.lihatRiwayat();
                    case 0 ->
                        System.out.println("Terimakasih sudah menggunakan aplikasi ini.");
                    default ->
                        System.out.println("Pilihan Tidak Tersedia.");
                }
            }
        }
    } 
}
