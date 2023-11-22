package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_skill", schema = "db", catalog = "")
public class UserSkill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "skill_id")
    private int skillId;
    @Basic
    @Column(name = "power")
    private int power;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "id", nullable = false)
    private Skill skill;

    public UserSkill(Integer userSkillId, User user, Skill skill, int power) {
        this.id=userSkillId;
        this.user=user;
        this.skill=skill;
        this.power=power;

    }

    public UserSkill() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSkill that = (UserSkill) o;
        return id == that.id && userId == that.userId && skillId == that.skillId && power == that.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, skillId, power);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User userByUserId) {
        this.user = userByUserId;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skillBySkillId) {
        this.skill = skill;
    }
}
