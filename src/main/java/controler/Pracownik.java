package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pracownik {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

  private String imie;
  private String nazwisko;



    public Pracownik(){
       this.imie="";
       this.nazwisko="";
    }



    public Pracownik(String imie, String nazwisko) {
        this.imie=imie;
        this.nazwisko=nazwisko;
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
}

