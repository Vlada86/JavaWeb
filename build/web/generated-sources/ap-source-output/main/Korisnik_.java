package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Korpa;
import main.Polovnitelefoni;
import main.Telefoni;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(Korisnik.class)
public class Korisnik_ { 

    public static volatile ListAttribute<Korisnik, Korpa> korpaList;
    public static volatile SingularAttribute<Korisnik, String> korIme;
    public static volatile SingularAttribute<Korisnik, String> korPassword;
    public static volatile SingularAttribute<Korisnik, String> korEmail;
    public static volatile ListAttribute<Korisnik, Polovnitelefoni> polovnitelefoniList;
    public static volatile SingularAttribute<Korisnik, String> korPrezime;
    public static volatile SingularAttribute<Korisnik, String> korFunkcija;
    public static volatile ListAttribute<Korisnik, Telefoni> telefoniList;
    public static volatile SingularAttribute<Korisnik, Integer> korId;

}