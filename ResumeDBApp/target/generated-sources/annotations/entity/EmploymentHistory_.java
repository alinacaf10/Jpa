package entity;

import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-11-24T00:09:11")
@StaticMetamodel(EmploymentHistory.class)
public class EmploymentHistory_ { 

    public static volatile SingularAttribute<EmploymentHistory, Date> beginDate;
    public static volatile SingularAttribute<EmploymentHistory, Date> endDate;
    public static volatile SingularAttribute<EmploymentHistory, String> header;
    public static volatile SingularAttribute<EmploymentHistory, Integer> id;
    public static volatile SingularAttribute<EmploymentHistory, String> jobDesc;
    public static volatile SingularAttribute<EmploymentHistory, Integer> userId;
    public static volatile SingularAttribute<EmploymentHistory, User> user;

}