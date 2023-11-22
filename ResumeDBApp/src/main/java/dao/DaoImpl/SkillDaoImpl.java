package dao.DaoImpl;

import dao.DaoInter.SkillDaoInter;
import entity.Skill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {
    public Skill getSkill(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String skill = rs.getString("name");
        return new Skill(id, skill);
    }

    @Override
    public List<Skill> getAllSkill() {
        List<Skill> skillList = new ArrayList<>();
        try (Connection connect = connector();) {
            Statement stmt = connect.createStatement();
            stmt.execute("select * from skill ");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Skill u = getSkill(rs);

                skillList.add(u);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return skillList;

    }

    @Override
    public boolean addSkill(Skill skill) {
        try (Connection connect = connector();) {
            PreparedStatement stmt = connect.prepareStatement("insert into skill (name) values (?)");
            stmt.setString(1, skill.getName());

            return stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeSkill(int id) {
        try (Connection connect = connector();) {
            Statement stmt = connect.createStatement();
            stmt.execute("delete from skill where id=" + id);
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateSkill(Skill skill) {
        try (Connection connect = connector();) {
            PreparedStatement stmt = connect.prepareStatement("update skill set name=? where id=?");
            stmt.setString(1, skill.getName());
            stmt.setInt(2, skill.getId());
            return stmt.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Skill getSkillbyId(int skillId) {
        //TODO: keep 'resumeappPU' as a separate constant string field, private static final
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("resumeappPU");
        EntityManager em = entityManagerFactory.createEntityManager();

        Skill skill = em.find(Skill.class, skillId);

        return skill;

    }


}
