package entity;

import entity.Country;
import entity.EmploymentHistory;
import entity.UserSkill;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-11-24T00:09:11")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> birthPlaceId;
    public static volatile SingularAttribute<User, String> profileDescription;
    public static volatile SingularAttribute<User, Integer> nationalityId;
    public static volatile SingularAttribute<User, String> adress;
    public static volatile SingularAttribute<User, Date> birthDate;
    public static volatile CollectionAttribute<User, EmploymentHistory> employmentHistoriesById;
    public static volatile ListAttribute<User, UserSkill> skills;
    public static volatile CollectionAttribute<User, UserSkill> userSkillsById;
    public static volatile SingularAttribute<User, Country> birthplace;
    public static volatile SingularAttribute<User, Country> nationality;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Integer> age;
    public static volatile SingularAttribute<User, String> email;

}