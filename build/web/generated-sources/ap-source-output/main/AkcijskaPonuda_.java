package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.DodatnaOprema;
import main.Telefoni;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(AkcijskaPonuda.class)
public class AkcijskaPonuda_ { 

    public static volatile ListAttribute<AkcijskaPonuda, DodatnaOprema> dodatnaOpremaList;
    public static volatile SingularAttribute<AkcijskaPonuda, String> akcCena;
    public static volatile ListAttribute<AkcijskaPonuda, Telefoni> telefoniList;
    public static volatile SingularAttribute<AkcijskaPonuda, Integer> akcId;
    public static volatile SingularAttribute<AkcijskaPonuda, String> akcNaziv;

}