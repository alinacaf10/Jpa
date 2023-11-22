package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "employment_history", schema = "db", catalog = "")
public class EmploymentHistory {

    @Basic(optional = false)
    @Column(name = "begin_date")
    @Temporal(TemporalType.DATE)
    private java.util.Date beginDate;
    @Basic(optional = false)
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private java.util.Date endDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "header")
    private String header;
    @Basic
    @Column(name = "job_desc")
    private String jobDesc;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public EmploymentHistory(Integer id, String header, java.util.Date beginDate, java.util.Date endDate, String jobDesc, User user) {
        this.id = id;
        this.header = header;
        this.beginDate = (Date) beginDate;
        this.endDate = (Date) endDate;
        this.jobDesc = jobDesc;
        this.user = user;
    }

    public EmploymentHistory() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmploymentHistory that = (EmploymentHistory) o;
        return id == that.id && Objects.equals(header, that.header) && Objects.equals(beginDate, that.beginDate) && Objects.equals(endDate, that.endDate) && Objects.equals(jobDesc, that.jobDesc) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, header, beginDate, endDate, jobDesc, userId);
    }

    public User getUser() {
        return user;
    }

    public void setUserByUserId(User user) {
        this.user = user;
    }

    public java.util.Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(java.util.Date beginDate) {
        this.beginDate = beginDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }
}
