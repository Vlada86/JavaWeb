package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.AkcijskaPonuda;
import main.Korisnik;
import main.Proizvodi;
import main.SpecifikacijaModela;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(Telefoni.class)
public class Telefoni_ { 

    public static volatile SingularAttribute<Telefoni, Integer> telId;
    public static volatile ListAttribute<Telefoni, SpecifikacijaModela> specifikacijaModelaList;
    public static volatile SingularAttribute<Telefoni, Proizvodi> proId;
    public static volatile SingularAttribute<Telefoni, String> telNaziv;
    public static volatile SingularAttribute<Telefoni, AkcijskaPonuda> akcId;
    public static volatile SingularAttribute<Telefoni, String> telCena;
    public static volatile SingularAttribute<Telefoni, Korisnik> korId;

}