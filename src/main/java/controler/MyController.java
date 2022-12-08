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
        
    @RequestMapping(value = "/print_all", method = RequestMethod.GET)
    public String printAll(Model model)
    {
        List<Wypozyczenie> wypozyczenieList =  wypozyczenieRepository.findAll();
                        
        model.addAttribute("header","Lista wszystkich operacji"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("wypozyczenieList",wypozyczenieList); //Dodanie obiektu do pamieci lokalnej modelu
        
        return "printform"; //Przekierowanie na strone 

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

        