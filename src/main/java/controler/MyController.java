package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


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


//######################################################################################################################
//######################################################################################################################
//######################################################################################################################

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
    @RequestMapping("/oddaj")
    public String oddaj(Model model)
    {
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        model.addAttribute("wypozyczenie", wypozyczenie);
        return "addform";
    }

    @RequestMapping(value = "/oddaj", method = RequestMethod.POST)
    public String oddaj(Model model,Wypozyczenie wypozyczenie)
    {
        wypozyczenieRepository.save(new Wypozyczenie());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }
//######################################################################################################################
//######################################################################################################################
//######################################################################################################################

    @RequestMapping("/dodajgre")
    public String dodajgre(Model model)
    {
        Gra gra = new Gra();
        model.addAttribute("gra", gra);
        return "addform_gra";
    }

    @RequestMapping(value = "/dodajgre", method = RequestMethod.POST)
    public String dodajgre(Model model,Gra gra)
    {
        String nazwa = gra.getNazwa_gry();
        int min_graczy = gra.getMin_graczy();
        int max_gracz = gra.getMax_graczy();
        int min_czas = gra.getMin_czas();
        int max_czas = gra.getMax_czas();
        int wiek = gra.getWiek();
        Double koszt = gra.getKoszt();
        Double kaucja = gra.getKaucja();
        Double kara = gra.getKara();
        String wydawca = gra.getId_wydawcy();
        String gatunki = gra.getGatunki();

        graRepository.save(new Gra(nazwa, min_graczy, max_gracz, min_czas,max_czas, wiek, koszt,kaucja,kara,wydawca,gatunki));

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }

    //-------------------------------------------------------------------
    @RequestMapping("/dodajklienta")
    public String dodajklienta(Model model)
    {
        Klient klient = new Klient();
        model.addAttribute("klient", klient);
        return "addform_klient";
    }

    @RequestMapping(value = "/dodajklienta", method = RequestMethod.POST)
    public String dodajklienta(Model model,Klient klient)
    {
        klientRepository.save(new Klient());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }

    //-------------------------------------------------------------------
    @RequestMapping("/dodajwydawce")
    public String dodajwydawcec(Model model)
    {
        Wydawca wydawca = new Wydawca();
        model.addAttribute("wydawca", wydawca);
        return "addform_wydawca";
    }

    @RequestMapping(value = "/dodajwydawce", method = RequestMethod.POST)
    public String dodajwydawce(Model model,Wydawca wydawca)
    {
        wydawcaRepository.save(new Wydawca());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }

    //-------------------------------------------------------------------
    @RequestMapping("/dodajpracownika")
    public String dodajpracownika(Model model)
    {
        Pracownik pracownik = new Pracownik();
        model.addAttribute("pracownik", pracownik);
        return "addform_pracownik";
    }

    @RequestMapping(value = "/dodajpracownika", method = RequestMethod.POST)
    public String dodajpracownika(Model model,Pracownik pracownik)
    {
        pracownikRepository.save(new Pracownik());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }

    //-------------------------------------------------------------------
    @RequestMapping("/dodajgatunek")
    public String dodajgatunek(Model model)
    {
        Gatunek gatunek = new Gatunek();
        model.addAttribute("gatunek", gatunek);
        return "addform_gatunek";
    }

    @RequestMapping(value = "/dodajgatunek", method = RequestMethod.POST)
    public String dodajgatunek(Model model,Gatunek gatunek)
    {
        gatunekRepository.save(new Gatunek());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }

    //-------------------------------------------------------------------
    @RequestMapping("/dodajwydarzenie")
    public String dodajwydarzenie(Model model)
    {
        Wydarzenie wydarzenie = new Wydarzenie();
        model.addAttribute("wydarzenie", wydarzenie);
        return "addform_wydarzenie";
    }

    @RequestMapping(value = "/dodajwydarzenie", method = RequestMethod.POST)
    public String dodajwydarzenie(Model model,Wydarzenie wydarzenie)
    {
        wydarzenieRepository.save(new Wydarzenie());

        model.addAttribute("header", "Wynik");
        model.addAttribute("message","Wstawiono do bazy wymiane: ");
        return "viewmessage";
    }
//######################################################################################################################
//######################################################################################################################
//######################################################################################################################
        
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
//######################################################################################################################
//######################################################################################################################
//######################################################################################################################

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

        