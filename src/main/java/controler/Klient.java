package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

  private String imie;
  private String nazwisko;
  private String data_urodzenia;
  private String telefon;
  private String email;
  private String miasto;
  private String ulica;
  private String mieszkanie;



    public Klient(){
       this.imie="";
       this.nazwisko="";
       this.data_urodzenia="";
       this.telefon="";
       this.email="";
       this.miasto="";
       this.ulica="";
       this.mieszkanie="";
    }



    public Klient(String imie, String nazwisko, String data_urodzenia, String telefon, String email, String miasto, String ulica, String mieszkanie) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.data_urodzenia=data_urodzenia;
        this.telefon=telefon;
        this.email=email;
        this.miasto=miasto;
        this.ulica=ulica;
        this.mieszkanie=mieszkanie;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {        return imie;    }
    public void setImie(String imie) {        this.imie = imie;    }

    public String getNazwisko() {        return nazwisko;    }
    public void setNazwisko(String nazwisko) {        this.nazwisko = nazwisko;    }

    public String getData_urodzenia() {        return data_urodzenia;    }
    public void setData_urodzenia(String data_urodzenia) {        this.data_urodzenia = data_urodzenia;    }

    public String getTelefon() {        return telefon;    }
    public void setTelefon(String telefon) {        this.telefon = telefon;    }

    public String getEmail() {        return email;    }
    public void setEmail(String email) {        this.email = email;    }

    public String getMiasto() {        return miasto;    }
    public void setMiasto(String miasto) {        this.miasto = miasto;    }

    public String getUlica() {        return ulica;    }
    public void setUlica(String ulica) {        this.ulica = ulica;    }

    public String getMieszkanie() {        return mieszkanie;    }
    public void setMieszkanie(String mieszkanie) {        this.mieszkanie = mieszkanie;    }
}

