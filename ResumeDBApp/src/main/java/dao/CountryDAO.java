package dao;

import entity.Country;

import java.util.List;

public interface CountryDAO {
    //TODO: no need to write public access modifier in interface, by default all abstract methods are public
    public List<Country> getAllCountry();

}
