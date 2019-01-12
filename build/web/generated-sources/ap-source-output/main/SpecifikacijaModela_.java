package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Specifikacija;
import main.Telefoni;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(SpecifikacijaModela.class)
public class SpecifikacijaModela_ { 

    public static volatile SingularAttribute<SpecifikacijaModela, Integer> smId;
    public static volatile SingularAttribute<SpecifikacijaModela, Telefoni> telId;
    public static volatile SingularAttribute<SpecifikacijaModela, Specifikacija> spcId;
    public static volatile SingularAttribute<SpecifikacijaModela, String> smVrednost;

}