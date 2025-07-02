
package reminderminumair;


public class User {
    protected String nama;
    
    public User(String nama) {
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void tampilkanProfil(){
        System.out.println("Nama Pengguna: " + nama);
    }
}
