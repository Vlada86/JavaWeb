package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.AkcijskaPonuda;
import main.DodatnaOpremaGrupe;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(DodatnaOprema.class)
public class DodatnaOprema_ { 

    public static volatile SingularAttribute<DodatnaOprema, String> doCena;
    public static volatile SingularAttribute<DodatnaOprema, DodatnaOpremaGrupe> dogId;
    public static volatile SingularAttribute<DodatnaOprema, Integer> doId;
    public static volatile SingularAttribute<DodatnaOprema, AkcijskaPonuda> akcId;
    public static volatile SingularAttribute<DodatnaOprema, String> doVrednost;

}