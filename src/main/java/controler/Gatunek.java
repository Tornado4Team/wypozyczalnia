package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gatunek {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

  private String nazwa_gatunku;

    public Gatunek(){
       this.nazwa_gatunku="";
    }

    public Gatunek(String nazwa) {
        this.nazwa_gatunku=nazwa;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa_gatunku() {        return nazwa_gatunku;    }
    public void setNazwa_gatunku(String nazwa_gatunku) {        this.nazwa_gatunku = nazwa_gatunku;    }
}

