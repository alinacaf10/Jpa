package dao;

import entity.EmploymentHistory;

import java.util.List;

public interface EmploymentDAO {
    //TODO: naming convention is wrong in method name
    public List<EmploymentHistory> getAllEmploymentHistorybyId(int userId);
}
