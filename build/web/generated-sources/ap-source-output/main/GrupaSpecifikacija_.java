package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Specifikacija;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(GrupaSpecifikacija.class)
public class GrupaSpecifikacija_ { 

    public static volatile SingularAttribute<GrupaSpecifikacija, String> gsNaziv;
    public static volatile SingularAttribute<GrupaSpecifikacija, Integer> gsId;
    public static volatile ListAttribute<GrupaSpecifikacija, Specifikacija> specifikacijaList;

}