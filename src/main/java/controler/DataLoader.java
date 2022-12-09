package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//Dodanie osob do repozytorium na samym poczatku
@Component
public class DataLoader implements ApplicationRunner {

    private GatunekRepository gatunekRepository;
    private GraRepository graRepository;
    private KlientRepository klientRepository;
    private PracownikRepository pracownikRepository;
    private WydarzenieRepository wydarzenieRepository;
    private WydawcaRepository wydawcaRepository;
    private WypozyczenieRepository wypozyczenieRepository;


    @Autowired
    public DataLoader(GatunekRepository gatunekRepository, GraRepository graRepository, KlientRepository klientRepository, PracownikRepository pracownikRepository,
    WydarzenieRepository wydarzenieRepository, WydawcaRepository wydawcaRepository, WypozyczenieRepository wypozyczenieRepository) {
        this.gatunekRepository = gatunekRepository;
        this.graRepository = graRepository;
        this.klientRepository = klientRepository;
        this.pracownikRepository = pracownikRepository;
        this.wydarzenieRepository = wydarzenieRepository;
        this.wydawcaRepository = wydawcaRepository;
        this.wypozyczenieRepository = wypozyczenieRepository;
    }

    public void run(ApplicationArguments args) {
        //gatunki
        gatunekRepository.save(new Gatunek("Familijna"));

        //gry
        graRepository.save(new Gra("Frogi",2,5,15,25,4,15.00,5.00,1.0,"Rebel","test"));

        //klient
        klientRepository.save(new Klient("Jan","Nowak","05.04.1997","543159764","jnowak@wp.pl","Krosno","Lwowska","24"));

        //pracownik
        pracownikRepository.save(new Pracownik("Tadeusz","Nowacki"));

        //wydarzenia
        wydarzenieRepository.save(new Wydarzenie("Lokal","0.0.0","Krosno","Lewakowskiego","18b"));

        //wydawca
        wydawcaRepository.save(new Wydawca("Rebel"));

        //wypozyczenia
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));

      }
}