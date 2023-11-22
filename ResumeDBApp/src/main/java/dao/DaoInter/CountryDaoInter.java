package dao.DaoInter;

import entity.Country;

import java.util.List;

public interface CountryDaoInter {
    //TODO: no need to write public access modifier in interface, by default all abstract methods are public
    public List<Country> getAllCountry();

}
