package controler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gra {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

   private String nazwa_gry;
   private int min_graczy;
   private int max_graczy;
   private int min_czas;
   private int max_czas;
   private int wiek;
   private double koszt;
   private double kaucja;
   private double kara;
   private int id_wydawcy;
   private String gatunki;



    public Gra(){
       this.nazwa_gry = "";
       this.min_graczy=0;
       this.max_graczy=0;
       this.min_czas=0;
       this.max_czas=0;
       this.wiek=0;
       this.kaucja=0.0;
       this.kara=0.0;
       this.id_wydawcy=0;
       this.koszt = 0.0;
       this.gatunki="";
    }



    public Gra(String gra, int min_graczy, int max_graczy, int min_czas, int max_czas, int wiek, double koszt, double kaucja, double kara, int wydawca,  String gatunki) {
        this.nazwa_gry = gra;
        this.min_graczy=min_graczy;
        this.max_graczy=max_graczy;
        this.min_czas=min_czas;
        this.max_czas=max_czas;
        this.wiek=wiek;
        this.kaucja=kaucja;
        this.kara=kara;
        this.id_wydawcy=wydawca;
        this.koszt = koszt;
        this.gatunki=gatunki;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa_gry() {        return nazwa_gry;    }
    public void setNazwa_gry(String nazwa_gry) {        this.nazwa_gry = nazwa_gry;    }

    public int getMin_graczy() {        return min_graczy;    }
    public void setMin_graczy(int min_graczy) {        this.min_graczy = min_graczy;    }

    public int getMax_graczy() {        return max_graczy;    }
    public void setMax_graczy(int max_graczy) {        this.max_graczy = max_graczy;    }

    public int getMin_czas() {        return min_czas;    }
    public void setMin_czas(int min_czas) {        this.min_czas = min_czas;    }

    public int getMax_czas() {        return max_czas;    }
    public void setMax_czas(int max_czas) {        this.max_czas = max_czas;    }

    public int getWiek() {        return wiek;    }
    public void setWiek(int wiek) {        this.wiek = wiek;    }

    public double getKoszt() {        return koszt;    }
    public void setKoszt(double koszt) {        this.koszt = koszt;    }

    public double getKaucja() {        return kaucja;    }
    public void setKaucja(double kaucja) {        this.kaucja = kaucja;    }

    public double getKara() {        return kara;    }
    public void setKara(double kara) {        this.kara = kara;    }

    public int getId_wydawcy() {        return id_wydawcy;    }
    public void setId_wydawcy(int id_wydawcy) {        this.id_wydawcy = id_wydawcy;    }

    public String getGatunki() {        return gatunki;    }
    public void setGatunki(String gatunki) {        this.gatunki = gatunki;    }
}

