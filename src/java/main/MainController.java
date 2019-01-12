package main;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = {"/", "/start"})
    public String homepage() {
        return "redirect";
    }

    @RequestMapping("/oprema")
    public String oprema(ModelMap model,
            @RequestParam(required = false) String Oprema
    ) {
        if (Oprema != null) {

            List<DodatnaOprema> dodatna_oprema = DB.query("SELECT d FROM DodatnaOprema d WHERE d.dogId.dogId='" + Oprema + "'");
            model.addAttribute("dodatna_oprema", dodatna_oprema);
        }

        List<DodatnaOpremaGrupe> dodatna_oprema_grupe = DB.query("SELECT d FROM DodatnaOpremaGrupe d");
        model.addAttribute("dodatna_oprema_grupe", dodatna_oprema_grupe);
        return "oprema";
    }

    /*@RequestMapping("/oprema")
    public String oprema(ModelMap model) {
         List<DodatnaOprema> lista=DB.query("SELECT d FROM DodatnaOprema d");
        System.out.println(lista);
        model.addAttribute("oprema",lista);
    
        return "oprema";
    }*/
 /*@RequestMapping("/telefoni")
    public String telefoni(ModelMap model,
            @RequestParam (required = false) String brend
            ) {
        if(brend!=null){
            
            List<Telefoni> telefoni = DB.query("SELECT t FROM Telefoni t WHERE t.proId.proId='"+brend+"'");
            model.addAttribute("telefoni", telefoni);
        }
        
        List<Proizvodi> proizvodi = DB.query("SELECT p FROM Proizvodi p");
        model.addAttribute("proizvodi",proizvodi);
        return "telefoni";*/
 /* @RequestMapping("/telefoni")
    public String telefoni(ModelMap model) {
        List<Telefoni> lista=DB.query("SELECT t FROM Dogadjaji t");
        System.out.println(lista);
        model.addAttribute("telefoni",lista);
        return "telefoni";
    
}       */
    @RequestMapping("/home")
    public String home(HttpSession session, ModelMap model) {
        boolean ulogovan = session.getAttribute("korisnik") != null;
        model.addAttribute("ulogovan", ulogovan);
        return "home";
    }
   
        
    
    @RequestMapping("/servis")
    public String servis() {
        return "servis";
    }

    @RequestMapping("/akcijska_ponuda")
    public String akcijska_ponuda(HttpSession session, ModelMap model) {
        List<DodatnaOprema> oprema =DB.query("SELECT d FROM DodatnaOprema d");
        System.out.println(oprema);
        List<AkcijskaPonuda> lista = DB.query("SELECT a FROM AkcijskaPonuda a");
        System.out.println(lista);
        model.addAttribute("oprema", oprema);
        model.addAttribute("akcijska_ponuda", lista);
        return "akcijska_ponuda";
    }

    @RequestMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }

    @RequestMapping("/vidikorpu")
    public String vidikorpu(HttpSession session, ModelMap model) {
        boolean ulogovan = session.getAttribute("korisnik") != null;
        model.addAttribute("ulogovan", ulogovan);
        Korisnik k = (Korisnik) session.getAttribute("korisnik");
        List<Korpa> korpe = DB.query("SELECT k FROM Korpa k WHERE k.korId.korId='" + k.getKorId() + "'");
        model.addAttribute("korpe", korpe);
        return "vidikorpu";
    }

    @RequestMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping("/polovnitelefoni")
    public String polovnitefoni(HttpSession session, ModelMap model
            ) {
       
        

        
        List<Polovnitelefoni> polovnitelefoni = DB.query("SELECT p FROM Polovnitelefoni p");
        System.out.println(polovnitelefoni);
        model.addAttribute("polovnitelefoni", polovnitelefoni);
        return "polovnitelefoni";
    }

    @RequestMapping("/korpa")
    public String korpa(ModelMap model, HttpSession session,
            @RequestParam(required = true) String id
            
    ) {
        List<Telefoni> res = DB.query("SELECT t FROM Telefoni t WHERE t.telId='" + id + "'");
        Telefoni t = res.get(0);
        //Korpa(String kpKupljeno, Korisnik korId)
        Korpa k = new Korpa(t.getTelNaziv(), (Korisnik) session.getAttribute("korisnik"));
        DB.insert(k);
        return "home";
    }
    @RequestMapping("/prikazkorisnika")
    public String prikazkorisnika(ModelMap model,HttpSession session){
        boolean ulogovan = session.getAttribute("Administrator") != null;
        model.addAttribute("ulogovan", ulogovan);
        List<Korisnik> korisnik =DB.query("SELECT k FROM Korisnik k");
        System.out.println(korisnik);
        model.addAttribute("korisnik",korisnik);
                return "prikazkorisnika";
    }
                    
    @RequestMapping("/prikaz")
    public String prikaz(ModelMap model,
            @RequestParam(required = true) String id
    ) {
        List<Telefoni> res = DB.query("SELECT t FROM Telefoni t WHERE t.telId='" + id + "'");
        Telefoni t = res.get(0);
        
        
        List<SpecifikacijaModela> specifikacije = t.getSpecifikacijaModelaList();
        model.addAttribute("specifikacije", specifikacije);
        return "prikaz";
    }

    @RequestMapping("/telefoni")
    public String telefoni(HttpSession session, ModelMap model) {
        boolean ulogovan = session.getAttribute("korisnik") != null;
        model.addAttribute("ulogovan", ulogovan);
        List<Telefoni> lista = DB.query("SELECT t FROM Telefoni t");
        System.out.println(lista);
        model.addAttribute("telefoni", lista);
        return "telefoni";
    }

    @RequestMapping("/zakazivanje")
    public String zakazivanje(ModelMap model,
            @RequestParam(required = false) String ime,
            @RequestParam(required = false) String prezime,
            @RequestParam(required = false) String telefon,
            @RequestParam(required = false) String poruka
    ) {
        //Servis(String serPoruka, String serIme, String serPrezime, String serTelefon)
        Servis s = new Servis(poruka, ime, prezime, telefon);
        DB.insert(s);
        return "home";
    }
    @RequestMapping("/dodaj")
    public String dodaj(ModelMap model,HttpSession session,
            @RequestParam(required = false) String cena,
            @RequestParam(required = false) String Model,
            @RequestParam(required = false) String displej,
            @RequestParam(required = false) String rammemorija,
             @RequestParam(required = false) String procesor,
             @RequestParam(required = false) String kraciopis
             
            
    ) {
        boolean ulogovan = session.getAttribute("Administrator") != null;
        model.addAttribute("ulogovan", ulogovan);
        //String ptCena, String ptModel, String ptDisplej, String ptRammemorija, String ptProcesor, String ptKraciopis, Korisnik korId)
        Polovnitelefoni p = new Polovnitelefoni(cena, Model, displej, rammemorija,procesor,kraciopis);
        DB.insert(p);
        return "administracija";
    }
    
    
    

    @RequestMapping("/login")
    public String login(
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String password,
            ModelMap model,
            HttpSession session
            
            

            ) {

        //List<Korisnik> res=DB.query("SELECT k FROM Korisnik k WHERE k.korEmail=?1",email);
        List<Korisnik> res = DB.query("SELECT k FROM Korisnik k WHERE k.korEmail='" + email + "'");
        if (res.isEmpty() || !password.equals(res.get(0).getKorPassword())) {
            String poruka = "Email ili password nisu ispravni,pokusajte ponovo";
            model.addAttribute("poruka", poruka);
            return "greska";
        }
        if (res.get(0).getKorFunkcija().equals("Administrator")) {
            session.setAttribute("korisnik", res.get(0));
            List<Servis> servisi = DB.query("SELECT s FROM Servis s");
           List<Polovnitelefoni> pt = DB.query("SELECT p FROM Polovnitelefoni p");
           List<Korisnik> korisnik = DB.query("SELECT k FROM Korisnik k");
           model.addAttribute("korisnik", korisnik);
           
           model.addAttribute("pt", pt);
           
            model.addAttribute("servisi", servisi);
            model.addAttribute("email", email);
            model.addAttribute("password", password);

            return "administracija";
        }

        session.setAttribute("korisnik", res.get(0));
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        return "home";

    }
  /*  @RequestMapping("/dodaj")
     public String dodaj(HttpSession session,ModelMap model){
        boolean ulogovan = session.getAttribute("Administrator") != null;
        model.addAttribute("ulogovan", ulogovan);
        
        
            
           List<DodatnaOpremaGrupe> dog = DB.query("SELECT d FROM DodatnaOpremaGrupe d");
           List<DodatnaOprema> dop = DB.query("SELECT d FROM DodatnaOprema d");
            model.addAttribute("dog" ,dog);
            model.addAttribute("dop", dop);
            return "administracija";
    }*/

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //jedan nacin:
        //session.removeAttribute("korisnik");
        //drugi nacin:
        session.invalidate();
        return "home";
        //mozda ovde da stavim login kad ga uredim
    }
}
