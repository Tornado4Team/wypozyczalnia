package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wydawca {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

  private String nazwa_wydawcy;

    public Wydawca(){
       this.nazwa_wydawcy="";
    }

    public Wydawca(String nazwa) {
        this.nazwa_wydawcy=nazwa;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa_wydawcy() {        return nazwa_wydawcy;    }
    public void setNazwa_wydawcy(String nazwa_wydawcy) {        this.nazwa_wydawcy = nazwa_wydawcy;    }
}

