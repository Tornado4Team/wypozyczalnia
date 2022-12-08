package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//Dodanie osob do repozytorium na samym poczatku
@Component
public class DataLoader implements ApplicationRunner {

    private WypozyczenieRepository wypozyczenieRepository;

    @Autowired
    public DataLoader(WypozyczenieRepository wypozyczenieRepository) {
        this.wypozyczenieRepository = wypozyczenieRepository;
    }

    public void run(ApplicationArguments args) {
        
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));
        wypozyczenieRepository.save(new Wypozyczenie("04.12.22","08.12.22",1,1,1,25.00));
    }
}