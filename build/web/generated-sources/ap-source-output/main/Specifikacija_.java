package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.GrupaSpecifikacija;
import main.SpecifikacijaModela;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(Specifikacija.class)
public class Specifikacija_ { 

    public static volatile ListAttribute<Specifikacija, SpecifikacijaModela> specifikacijaModelaList;
    public static volatile SingularAttribute<Specifikacija, String> spcNaziv;
    public static volatile SingularAttribute<Specifikacija, GrupaSpecifikacija> gsId;
    public static volatile SingularAttribute<Specifikacija, Integer> spcId;

}