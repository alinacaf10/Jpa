package dao.impl;

import dao.CountryDAO;
import dao.impl.Abstract.AbstractDAO;
import entity.Country;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl extends AbstractDAO implements CountryDAO {

    public Country getCountry(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String nationality = rs.getString("nationality");
        return new Country(id, name, nationality);
    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> countryList = new ArrayList<>();
        try (Connection connect = getConnection();) {
            Statement stmt = connect.createStatement();
            stmt.execute("select * from country ");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Country u = getCountry(rs);

                countryList.add(u);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return countryList;

    }

}
