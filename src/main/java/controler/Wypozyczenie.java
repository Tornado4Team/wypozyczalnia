package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String data_wypozyczenia;
    private String data_oddania;
    private int id_klienta;
    private int id_gry;
    private int id_pracownika;
    private double koszt;



    public Wypozyczenie(){
        this.data_wypozyczenia = "";
        this.data_oddania = "";
        this.id_klienta = 0;
        this.id_gry = 0;
        this.id_pracownika = 0;
        this.koszt = 0.0;
    }



    public Wypozyczenie(String data_out, String data_in, int klient, int gra, int pracownik, double koszt) {
        this.data_wypozyczenia = data_out;
        this.data_oddania = data_in;
        this.id_klienta = klient;
        this.id_gry = gra;
        this.id_pracownika = pracownik;
        this.koszt = koszt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_wypozyczenia() {        return data_wypozyczenia;    }
    public void setData_wypozyczenia(String data_wypozyczenia) {        this.data_wypozyczenia = data_wypozyczenia;    }

    public String getData_oddania() {        return data_oddania;    }
    public void setData_oddania(String data_oddania) {        this.data_oddania = data_oddania;    }

    public int getId_klienta() {        return id_klienta;    }
    public void setId_klienta(int id_klienta) {        this.id_klienta = id_klienta;    }

    public int getId_gry() {        return id_gry;    }
    public void setId_gry(int id_gry) {        this.id_gry = id_gry;    }

    public int getId_pracownika() {        return id_pracownika;    }
    public void setId_pracownika(int id_pracownika) {        this.id_pracownika = id_pracownika;    }

    public double getKoszt() {        return koszt;    }
    public void setKoszt(double koszt) {        this.koszt = koszt;    }
}

