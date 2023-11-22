package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "db")
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "nationality")
    private String nationality;
    @OneToMany(mappedBy = "nationality")
    private Collection<User> usersById;
    @OneToMany(mappedBy = "birthplace")
    private Collection<User> usersById_0;

    public Country() {

    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", usersById=" + usersById +
                ", usersById_0=" + usersById_0 +
                '}';
    }

    public Country(int id, String name, String nationality) {
        this.id=id;
        this.name=name;
        this.nationality=nationality;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country that = (Country) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(nationality, that.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nationality);
    }

    public Collection<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(Collection<User> usersById) {
        this.usersById = usersById;
    }

    public Collection<User> getUsersById_0() {
        return usersById_0;
    }

    public void setUsersById_0(Collection<User> usersById_0) {
        this.usersById_0 = usersById_0;
    }
}
