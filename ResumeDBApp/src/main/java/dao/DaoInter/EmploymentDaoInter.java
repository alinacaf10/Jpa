package dao.DaoInter;

import entity.EmploymentHistory;

import java.util.List;

public interface EmploymentDaoInter {
    public List<EmploymentHistory> getAllEmploymentHistorybyId(int userId);
}
