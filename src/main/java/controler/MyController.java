package controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Tuple;


@Controller
public class MyController {

    @Autowired
    WypozyczenieRepository wypozyczenieRepository;
    @Autowired
    GraRepository graRepository;
    @Autowired
    KlientRepository klientRepository;
    @Autowired
    PracownikRepository pracownikRepository;
    @Autowired
    WydawcaRepository wydawcaRepository;
    @Autowired
    WydarzenieRepository wydarzenieRepository;
    @Autowired
    GatunekRepository gatunekRepository;

    
    @RequestMapping("/wypozycz")
    public String wypozycz(Model model)
    {       
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        model.addAttribute("wypozyczenie", wypozyczenie);
        return "addform";  
    }
    
    @RequestMapping(value = "/wypozycz", method = RequestMethod.POST)
    public String wypozycz(Model model,Wypozyczenie wypozyczenie)
    {
        wypozyczenieRepository.save(new Wypozyczenie());
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";                
    }

    //-------------------------------------------------------------------
        
    @RequestMapping(value = "/print_all_wypozyczenia", method = RequestMethod.GET)
    public String printAll_wypozyczenia(Model model)
    {
        List<Wypozyczenie> wypozyczenieList =  wypozyczenieRepository.findAll();
                        
        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("wypozyczenieList",wypozyczenieList); //Dodanie obiektu do pamieci lokalnej modelu
        
        return "printform_wypozyczenia"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_gry", method = RequestMethod.GET)
    public String printAll_gry(Model model)
    {
        List<Gra> graList =  graRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("graList",graList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_gry"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_klienci", method = RequestMethod.GET)
    public String printAll_klienci(Model model)
    {
        List<Klient> klientList =  klientRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("klientList",klientList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_klienci"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_pracownicy", method = RequestMethod.GET)
    public String printAll_pracownicy(Model model)
    {
        List<Pracownik> pracownikList =  pracownikRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("pracownikList",pracownikList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_pracownicy"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_wydawcy", method = RequestMethod.GET)
    public String printAll_wydawcy(Model model)
    {
        List<Wydawca> wydawcaList =  wydawcaRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("wydawcaList",wydawcaList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_wydawcy"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_wydarzenia", method = RequestMethod.GET)
    public String printAll_wydarzenia(Model model)
    {
        List<Wydarzenie> wydarzenieList =  wydarzenieRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("wydarzenieList",wydarzenieList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_wydarzenia"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------

    @RequestMapping(value = "/print_all_gatunki", method = RequestMethod.GET)
    public String printAll_gatunki(Model model)
    {
        List<Gatunek> gatunekList =  gatunekRepository.findAll();

        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("gatunekList",gatunekList); //Dodanie obiektu do pamieci lokalnej modelu

        return "printform_gatunki"; //Przekierowanie na strone

    }
    //-------------------------------------------------------------------
    
    //Obsluga bledow

    @ExceptionHandler
    public String handlerException(Model model,Exception exception)
    {
        String message = exception.getMessage();
        model.addAttribute("errormessage", message);
        return "errorpage";
    }
}

        