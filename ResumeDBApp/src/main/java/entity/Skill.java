package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "skill", schema = "db", catalog = "")
public class Skill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "skill")
    private Collection<UserSkill> userSkillsById;

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Skill() {

    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userSkillsById=" + userSkillsById +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill that = (Skill) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Collection<UserSkill> getUserSkillsById() {
        return userSkillsById;
    }

    public void setUserSkillsById(Collection<UserSkill> userSkillsById) {
        this.userSkillsById = userSkillsById;
    }
}
