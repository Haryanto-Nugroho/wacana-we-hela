/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenWisata;
import java.sql.Date;
/**
 *
 * @author Acer
 */
public class Data {
    private String tema;
    private String lokasi;
    private String tanggal;
    private String biaya;
    private String kegiatan;
    private String gambar;

    public Data(String tema, String lokasi,String tanggal, String biaya, String kegiatan, String gambar) {
        this.tema = tema;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.biaya = biaya;
        this.kegiatan = kegiatan;
        this.gambar = gambar;
    }

    public String getTema() {
        return tema;
    }

    public String getLokasi() {
        return lokasi;
    }
    public String getTanggal() {
        return tanggal;
    }
    public String getBiaya() {
        return biaya;
    }
    public String getKegiatan() {
        return kegiatan;
    }
    public String getGambar() {
        return gambar;
    }
}