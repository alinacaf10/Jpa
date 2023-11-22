package entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "db")
public class User {

    //TODO: Give some line breaks between fields to make the code more readable
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "surname")
    private String surname;
    @Basic
    @Column(name = "age")
    private int age;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "profile_description")
    private String profileDescription;
    @Basic
    @Column(name = "adress")
    private String adress;
    @Basic
    @Column(name = "birth_place_id")
    private Integer birthPlaceId;
    @Basic
    @Column(name = "nationality_id")
    private Integer nationalityId;
    @OneToMany(mappedBy = "user")
    private Collection<EmploymentHistory> employmentHistoriesById;
    @ManyToOne
    @JoinColumn(name = "birth_place_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Country birthplace;
    @ManyToOne
    @JoinColumn(name = "nationality_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Country nationality;
    @OneToMany(mappedBy = "user")
    private Collection<UserSkill> userSkillsById;

    @OneToMany
    private List<UserSkill> skills;

    public User(int id) {
        this.id = id;
    }

    //TODO: Do not put every field into constructor, use setters or create Builder design pattern
    public User(int id, String name, String surname,
                int age, String email, String profileDescription, String phone,
                Date birthDate, Country birthplace, Country nationality,
                List<UserSkill> skills) {
        this.id = id;
        this.profileDescription = profileDescription;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.birthplace = birthplace;
        this.nationality = nationality;
        this.skills = skills;
    }

    public User() {

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public Country getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Country birthplace) {
        this.birthplace = birthplace;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public List<UserSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<UserSkill> skills) {
        this.skills = skills;
    }

    public Integer getBirthPlaceId() {
        return birthPlaceId;
    }

    public void setBirthPlaceId(Integer birthPlaceId) {
        this.birthPlaceId = birthPlaceId;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    //TODO: Do not put every fields into equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(profileDescription, that.profileDescription) && Objects.equals(adress, that.adress) && Objects.equals(birthDate, that.birthDate) && Objects.equals(birthPlaceId, that.birthPlaceId) && Objects.equals(nationalityId, that.nationalityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, email, phone, profileDescription, adress, birthDate, birthPlaceId, nationalityId);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profileDescription='" + profileDescription + '\'' +
                ", adress='" + adress + '\'' +
                ", birthDate=" + birthDate +
                ", birthPlaceId=" + birthPlaceId +
                ", nationalityId=" + nationalityId +
                ", employmentHistoriesById=" + employmentHistoriesById +
                ", country=" + birthplace +
                ", nationality=" + nationality +
                ", userSkillsById=" + userSkillsById +
                ", skills=" + skills +
                '}';
    }

    public Collection<EmploymentHistory> getEmploymentHistoriesById() {
        return employmentHistoriesById;
    }

    public void setEmploymentHistoriesById(Collection<EmploymentHistory> employmentHistoriesById) {
        this.employmentHistoriesById = employmentHistoriesById;
    }

    public Collection<UserSkill> getUserSkillsById() {
        return userSkillsById;
    }

    public void setUserSkillsById(Collection<UserSkill> userSkillsById) {
        this.userSkillsById = userSkillsById;
    }

    public java.util.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }
}
