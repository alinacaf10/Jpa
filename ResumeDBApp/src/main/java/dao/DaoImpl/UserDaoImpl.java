package dao.DaoImpl;

import dao.DaoInter.UserDaoInter;
import entity.Country;
import entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoImpl extends AbstractDAO implements UserDaoInter {
    private User getUser(ResultSet rs) throws Exception{
        int id = Integer.parseInt(String.valueOf(rs.getInt("id")));
        String name=rs.getString("name");
        String surname=rs.getString("surname");
        int age=Integer.parseInt(String.valueOf(rs.getInt("age")));
        String email=rs.getString("email");
        String phone=rs.getString("phone");
        String profileDescription=rs.getString("profile_description");

        Date birthDate=rs.getDate("birthdate");
        int nationalityId=(rs.getInt("nationality_id"));
        int birthPlaceId=(rs.getInt("birth_place_id"));

        String nationalityname=rs.getString("nationality");
        String birthplacestr=rs.getString("birthplace");

        Country birthplace =new Country(nationalityId,null,nationalityname);
        Country country=new Country(birthPlaceId,birthplacestr,null);

        return new User(id,name,surname,age,email,profileDescription,phone,birthDate, country,birthplace, null);
    }
        @Override
    public boolean addUser(User u) {
        try (Connection connect=connector();){
            PreparedStatement stmt=connect.prepareStatement("insert into user (name,surname,age,email,phone) values (?,?,?,?,?)");
            stmt.setString(1,u.getName());
            stmt.setString(2,u.getSurname());
            stmt.setInt(3,u.getAge());
            stmt.setString(4,u.getEmail());
            stmt.setString(5,u.getPhone());
            return stmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public User getById(int UserId) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("resumeappPU");
        EntityManager em=entityManagerFactory.createEntityManager();

        User u = em.find(User.class,UserId);
        entityManagerFactory.close();
        em.close();
        
        return u;
    }

    @Override
    public boolean deleteUser(int id) {
        try (Connection connect=connector();){
            Statement stmt=connect.createStatement();
            stmt.execute("delete from User where id="+id);
        return false;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }}

        @Override
    public List<User> getAll() {
        List<User> userList=new ArrayList<>();
        try (Connection connect=connector();){
            Statement stmt=connect.createStatement();
            stmt.execute("select " +
                            "u.*, " +
                            "c.name as birthplace , " +
                            "n.nationality  " +
                            "from user u " +
                            "left join country n on u.nationality_id=n.id " +
                            "left join country c on u.birth_place_id=c.id ");
            ResultSet rs=stmt.getResultSet();
            while (rs.next()){
              User u = getUser(rs);

userList.add(u);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return userList;

    }

    @Override
    public boolean updateUser(User u) {
        try (Connection connect=connector()){
            PreparedStatement stmt=connect.prepareStatement("update user set name=?,surname=?,age=?,email=?,phone=? where id=?");
            stmt.setString(1,u.getName());
            stmt.setString(2,u.getSurname());
            stmt.setInt(3,u.getAge());
            stmt.setString(4,u.getEmail());
            stmt.setString(5,u.getPhone());
            stmt.setInt(6,u.getId());
            return stmt.execute();
    } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
