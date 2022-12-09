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
    public DataLoader(GatunekRepository gatunekRepository) {this.gatunekRepository = gatunekRepository;}
    @Autowired
    public DataLoader(GraRepository graRepository) {this.graRepository = graRepository;}
    @Autowired
    public DataLoader(KlientRepository klientRepository) {this.klientRepository = klientRepository;}
    @Autowired
    public DataLoader(PracownikRepository pracownikRepository) {this.pracownikRepository = pracownikRepository;}
    @Autowired
    public DataLoader(WydarzenieRepository wydarzenieRepository) {this.wydarzenieRepository = wydarzenieRepository;}
    @Autowired
    public DataLoader(WydawcaRepository wydawcaRepository) {this.wydawcaRepository = wydawcaRepository;}
    @Autowired
    public DataLoader(WypozyczenieRepository wypozyczenieRepository) {this.wypozyczenieRepository = wypozyczenieRepository;}


    public void run(ApplicationArguments args) {
        
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));
        graRepository.save(new Gra("Frogi",2,5,15,25,4,15.00,5.00,1,1,"test"));
    }
}