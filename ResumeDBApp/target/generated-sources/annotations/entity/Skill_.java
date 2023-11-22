package entity;

import entity.UserSkill;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-11-21T23:21:34")
@StaticMetamodel(Skill.class)
public class Skill_ { 

    public static volatile CollectionAttribute<Skill, UserSkill> userSkillsById;
    public static volatile SingularAttribute<Skill, String> name;
    public static volatile SingularAttribute<Skill, Integer> id;

}