package entity;

import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-11-24T00:09:11")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> nationality;
    public static volatile SingularAttribute<Country, String> name;
    public static volatile CollectionAttribute<Country, User> usersById;
    public static volatile CollectionAttribute<Country, User> usersById_0;
    public static volatile SingularAttribute<Country, Integer> id;

}