package dao.DaoInter;

import entity.EmploymentHistory;

import java.util.List;

public interface EmploymentDaoInter {
    //TODO: naming convention is wrong in method name
    public List<EmploymentHistory> getAllEmploymentHistorybyId(int userId);
}
