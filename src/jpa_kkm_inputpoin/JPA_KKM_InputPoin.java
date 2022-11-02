/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package jpa_kkm_inputpoin;

import entity.PoinMahasiswa;
import java.util.List;
import service.PoinMahasiswaService;

/**
 *
 * @author HP
 */
public class JPA_KKM_InputPoin {

    private static void tambah(){
        PoinMahasiswa pm = new PoinMahasiswa("672020272", "Edwin", 100, 200, 0, 0);
        new PoinMahasiswaService().createPoinMahasiswa(pm);
    }
    private static void lihat(){
        List<PoinMahasiswa> listPM = new PoinMahasiswaService().listPoinMahasiswa();
        for(PoinMahasiswa poinMahasiswa : listPM){
            System.out.println(poinMahasiswa.getNim()+ " | " + poinMahasiswa.getNama() + " | OMB : " + poinMahasiswa.getOmb() + " | Profesional : " + poinMahasiswa.getProfesional() + " | Kemanusiaan :  " + poinMahasiswa.getKemanusiaan() + " | Penunjang : " + poinMahasiswa.getPenunjang() );
        }
    }
    private static void hapus(){
        new PoinMahasiswaService().deletePoinMahasiswa("672020272");
    }
    private static void update(){
        PoinMahasiswa pm = new PoinMahasiswa("672020272", "Edwin Duta",100, 200, 0, 0);
        new PoinMahasiswaService().updatePoinMahasiswa(pm);
    }
    public static void main(String[] args) {
        //tambah();
        //hapus();
        update();
        lihat();
    }

}
