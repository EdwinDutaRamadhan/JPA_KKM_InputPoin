package entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PoinMahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nim; 
    private String nama;
    private int omb; 
    private int profesional;
    private int kemanusiaan;
    private int penunjang;
    
    public PoinMahasiswa(){
        super();
    }
    
    public PoinMahasiswa(String nim, String nama, int omb, int profesional, int kemanusiaan, int penunjang) {
        this.nim = nim;
        this.nama = nama;
        this.omb = omb;
        this.profesional = profesional;
        this.kemanusiaan = kemanusiaan;
        this.penunjang = penunjang;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getOmb() {
        return omb;
    }

    public void setOmb(int omb) {
        this.omb = omb;
    }

    public int getProfesional() {
        return profesional;
    }

    public void setProfesional(int profesional) {
        this.profesional = profesional;
    }

    public int getKemanusiaan() {
        return kemanusiaan;
    }

    public void setKemanusiaan(int kemanusiaan) {
        this.kemanusiaan = kemanusiaan;
    }

    public int getPenunjang() {
        return penunjang;
    }

    public void setPenunjang(int penunjang) {
        this.penunjang = penunjang;
    }
    
    
   
}
