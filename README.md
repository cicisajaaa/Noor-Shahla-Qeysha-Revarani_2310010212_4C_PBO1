# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana pengingat minum air berbasis menggunakan Java, dibuat sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini membantu pengguna menjaga hidrasi tubuh dengan mengingatkan untuk minum air secara berkala. Aplikasi bekerja dengan mencetak pesan pengingat pada interval tertentu yang dapat ditentukan oleh pengguna. Terdapat fitur untuk menghentikan pengingat melalui input dari pengguna.

Aplikasi ini dibangun menggunakan paradigma Object Oriented Programming (OOP) dengan menerapkan 14 konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, 
Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

### 1. Class
Class adalah template atau blueprint dari object  
Pada kode di bawah ini merupakan contoh dari Class. 
```java
public class WaterReminder { ... }
public class ReminderMinumAir extends WaterReminder { ... }
```
- `WaterReminder` menyimpan logika pengingat dasar.
- `ReminderMinumAir` menambahkan fitur lebih lanjut dengan mewarisi `WaterReminder`.

### 2. Object
Objek adalah hasil nyata dari class, digunakan untuk menjalankan method.  
Pada kode di bawah ini merupakan contoh dari pembuatan object. 
```java
WaterReminder reminder = new ReminderMinumAir(30);
```
Objek `reminder` menjalankan metode seperti `mulaiPengingat()`.

### 3. Atribut
Variabel yang menyimpan data dalam class.  
Pada kode di bawah ini merupakan contoh dari Atribut. 
```java
private int intervalMenit;
private boolean berjalan;
```
Digunakan untuk menentukan interval pengingat dan status jalannya program.

### 4. Constructor
Method pertama kali yang dijalankan saat objek dibuat.  
Pada kode di bawah ini merupakan contoh dari pengaplikasian method constructor. 
```java
public WaterReminder(int intervalMenit) {
    this.intervalMenit = intervalMenit;
    this.berjalan = true;
}
```
Secara otomatis mengatur nilai awal atribut saat objek dibuat.

### 5. Mutator (Setter)
Method untuk mengubah nilai atribut privat.  
Pada kode di bawah ini merupakan contoh dari Method Mutator. 
```java
public void setBerjalan(boolean berjalan) {
    this.berjalan = berjalan;
}
```
Memungkinkan pengubahan status `berjalan` dari luar class.

### 6. Accessor (Getter)
Method untuk mengambil nilai dari atribut privat.  
Pada kode di bawah ini merupakan contoh dari Method accessor. 
```java
public boolean isBerjalan() {
    return berjalan;
}
```
Digunakan untuk mengetahui apakah program masih aktif atau tidak.

### 7. Encapsulation
Menyembunyikan data dengan menjadikan atribut `private` dan mengaksesnya melalui getter/setter.  
Contoh:
```java
private int intervalMenit;
```
Melindungi atribut agar tidak bisa diakses/diubah langsung dari luar class.

### 8. Inheritance
Pewarisan method dan atribut dari superclass ke subclass.  
Contoh:
```java
public class ReminderMinumAir extends WaterReminder
```
Class `ReminderMinumAir` otomatis memiliki semua fitur dari `WaterReminder`.

### 9. Polymorphism
Method dengan nama sama berperilaku berbeda.  
Contoh:
```java
@Override
public void mulaiPengingat() {
    ...
}
```
Method ini ada di dua class (`WaterReminder` dan `ReminderMinumAir`), namun isi dan cara kerjanya berbeda.

### 10. Seleksi
Pengambilan keputusan berdasarkan kondisi.  
Contoh:
```java
if (input.equalsIgnoreCase("stop")) {
    setBerjalan(false);
}
```
Program akan berhenti jika pengguna mengetik "stop".

### 11. Perulangan
Menjalankan proses secara berulang.  
Contoh:
```java
while (isBerjalan()) {
    System.out.println("Saatnya minum air!");
    Thread.sleep(intervalMenit * 1000);
}
```
Program terus mengingatkan pengguna selama belum diminta berhenti.

### 12. Input Output Sederhana
Interaksi sederhana dengan pengguna.  
Contoh:
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Ketik 'stop' untuk menghentikan pengingat: ");
```

### 13. Array
Struktur data untuk menyimpan banyak objek.  
Contoh:
```java
WaterReminder[] pengingatArray = new WaterReminder[2];
```
Bisa digunakan untuk menyimpan lebih dari satu pengingat sekaligus.

### 14. Error Handling
Menangani kemungkinan kesalahan saat program dijalankan.  
Contoh:
```java
try {
    Thread.sleep(intervalMenit * 1000);
} catch (InterruptedException e) {
    System.out.println("Pengingat terganggu: " + e.getMessage());
}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Noor Shahla Qeysha Revarani
NPM: 2310010212
