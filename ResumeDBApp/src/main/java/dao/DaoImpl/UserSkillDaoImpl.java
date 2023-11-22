package dao.DaoImpl;

import dao.DaoInter.UserSkillDaoInter;
import entity.Skill;
import entity.User;
import entity.UserSkill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter {
    private UserSkill getUserSkill(ResultSet rs) throws Exception {
        int userId = rs.getInt("id");
        int userSkillId = rs.getInt("userSkillId");
        int skillId = rs.getInt("skill_id");
        String skill_name = rs.getString("skill_name");
        int power = rs.getInt("power");

        return new UserSkill(userSkillId, new User(userId), new Skill(skillId, skill_name), power);
    }

    @Override
    public List<UserSkill> getAllSkillbyId(int id) {
        List<UserSkill> userList = new ArrayList<>();
        try (Connection connect = connector();) {
            PreparedStatement stmt = connect.prepareStatement("select " +
                    " us.id as userSkillId, " +
                    " u.*," +
                    " us.skill_id, us.power, " +
                    "    s.name as skill_name" +
                    "    from user_skill us" +
                    "    left join user u on us.user_id=u.id" +
                    "    left join skill s on us.skill_id=s.id where u.id=?");
            stmt.setInt(1, id);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                UserSkill u = getUserSkill(rs);

                userList.add(u);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return userList;

    }
}
