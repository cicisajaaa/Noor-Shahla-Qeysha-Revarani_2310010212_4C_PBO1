
package reminderminumair;

import java.time.LocalDate;
import java.util.Scanner;

public class ReminderMinumAir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            LocalDate hariIni = LocalDate.now();
            
            System.out.println("====================");
            System.out.println("APLIKASI PENGINGAT MINUM AIR SEDERHANA");
            System.out.println("====================");
            
            System.out.println("Masukkan nama Anda: ");
            String nama = input.nextLine();
            
            System.out.println("Masukkan Target Minum Harian Anda (ml) : ");
            int target = input.nextInt();
        }
    }
 
}
