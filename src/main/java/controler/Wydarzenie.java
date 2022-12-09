package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wydarzenie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

  private String nazwa_wydarzenia;
  private String data;
  private String miasto;
  private String ulica;
  private String adres;

    public Wydarzenie() {
        this.nazwa_wydarzenia = "";
        this.data = "";
        this.miasto = "";
        this.ulica = "";
        this.adres = "";
    }

    public Wydarzenie(String nazwa_wydarzenia, String data, String miasto, String ulica, String adres) {
        this.nazwa_wydarzenia = nazwa_wydarzenia;
        this.data = data;
        this.miasto = miasto;
        this.ulica = ulica;
        this.adres = adres;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa_wydarzenia() {        return nazwa_wydarzenia;    }
    public void setNazwa_wydarzenia(String nazwa_wydarzenia) {        this.nazwa_wydarzenia = nazwa_wydarzenia;    }

    public String getData() {        return data;    }
    public void setData(String data) {        this.data = data;    }

    public String getMiasto() {        return miasto;    }
    public void setMiasto(String miasto) {        this.miasto = miasto;    }

    public String getUlica() {        return ulica;    }
    public void setUlica(String ulica) {        this.ulica = ulica;    }

    public String getAdres() {        return adres;    }
    public void setAdres(String adres) {        this.adres = adres;    }
}

