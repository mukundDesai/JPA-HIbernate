package entity;

import javax.persistence.*;

@Entity
@Table(name = "engineeringstudents", schema = "university")
public class EngineeringstudentsEntity {
    private int studentId;
    private String dept;
    private String firstName;
    private String lastName;
    private int passOutYear;
    private int universityRank;

    @Id
    @Column(name = "Student_ID")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Dept")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "First_Name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "Last_Name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "PassOutYear")
    public int getPassOutYear() {
        return passOutYear;
    }

    public void setPassOutYear(int passOutYear) {
        this.passOutYear = passOutYear;
    }

    @Basic
    @Column(name = "UniversityRank")
    public int getUniversityRank() {
        return universityRank;
    }

    public void setUniversityRank(int universityRank) {
        this.universityRank = universityRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EngineeringstudentsEntity that = (EngineeringstudentsEntity) o;

        if (studentId != that.studentId) return false;
        if (passOutYear != that.passOutYear) return false;
        if (universityRank != that.universityRank) return false;
        if (dept != null ? !dept.equals(that.dept) : that.dept != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + passOutYear;
        result = 31 * result + universityRank;
        return result;
    }

    @Override
    public String toString() {
        return "EngineeringstudentsEntity{" +
                "studentId=" + studentId +
                ", dept='" + dept + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passOutYear=" + passOutYear +
                ", universityRank=" + universityRank +
                '}';
    }
}
