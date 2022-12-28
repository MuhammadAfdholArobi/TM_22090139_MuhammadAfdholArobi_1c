package Model;
import java.util.ArrayList;

public class EventOrganizer {
    private int custID;
    private String custName;
    private String custAddres;
    private String custEmail;
    private String custNoPhone;

    public EventOrganizer(){}

    public EventOrganizer(int id, String nama, String alamat, String email, String nomor_hp){
        this.custID = id;
        this.custName = nama;
        this.custAddres = alamat;
        this.custEmail = email;
        this.custNoPhone = nomor_hp;
    }

    //untuk melakukan manipulasi nilai properti objek
    public void setID(int id) {
        this.custID = id;
    }

    public void setNAMA(String nama) {
        this.custName = nama;
    }

    public void setALAMAT(String alamat) {
        this.custAddres = alamat;
    }

    public void setEMAIL(String email) {
        this.custEmail = email;
    }

    public void setNO_HP(String no_HP){
        this.custNoPhone = no_HP;
    }

    //untuk mengambil nilai properti objek
    public int getID() {
        return this.custID;
    }

    public String getNAMA(){
        return this.custName;
    }

    public String getALAMAT(){
        return this.custAddres;
    }

    public String getEMAIL(){
        return this.custEmail;
    }

    public String getNO_HP(){
        return this.custNoPhone;
    }

    //untuk mencetak semua data tamu undangan
    public static void PrintGuests(ArrayList<EventOrganizer> daftar_tamu) {
        System.out.println("\n===================Data Guest===================");
        for (EventOrganizer tamu : daftar_tamu) {
            System.out.println("ID\t: " + tamu.getID());
            System.out.println("Nama\t: " + tamu.getNAMA());
            System.out.println("Alamat\t: " + tamu.getALAMAT());
            System.out.println("Email\t: " + tamu.getEMAIL());
            System.out.println("No HP\t: " + tamu.getNO_HP() + "\n");
        }
    }
}