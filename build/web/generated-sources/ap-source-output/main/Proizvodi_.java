package main;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.Telefoni;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-12T15:08:03")
@StaticMetamodel(Proizvodi.class)
public class Proizvodi_ { 

    public static volatile SingularAttribute<Proizvodi, Integer> proId;
    public static volatile SingularAttribute<Proizvodi, String> proNaziv;
    public static volatile ListAttribute<Proizvodi, Telefoni> telefoniList;

}