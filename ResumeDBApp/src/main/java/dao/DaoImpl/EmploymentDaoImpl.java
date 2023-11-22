package dao.DaoImpl;

import dao.DaoInter.EmploymentDaoInter;
import entity.EmploymentHistory;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmploymentDaoImpl extends AbstractDAO implements EmploymentDaoInter {
    public EmploymentHistory getEmploymentHistory(ResultSet rs) throws Exception {
        int id= rs.getInt("user_id");
        String header=rs.getString("header");
        Date beginDate=rs.getDate("begin_date");
        Date endDate=rs.getDate("end_date");
        String jobDescription=rs.getString("job_desc");

        return new EmploymentHistory(null,header,beginDate,endDate,jobDescription,new User(id));

    }
    @Override
    public List<EmploymentHistory> getAllEmploymentHistorybyId(int userId) {
        List<EmploymentHistory> userList=new ArrayList<>();
        try (Connection connect=connector();){
            PreparedStatement stmt=connect.prepareStatement("select * from employment_history where user_id=?");
            stmt.setInt(1,userId);
            stmt.execute();
            ResultSet rs=stmt.getResultSet();
            while (rs.next()){
                EmploymentHistory u = getEmploymentHistory(rs);

                userList.add(u);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return userList;

    }
}
