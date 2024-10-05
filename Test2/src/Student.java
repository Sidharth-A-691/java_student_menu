import java.util.HashMap;

class Student {
    private int studentId;
    private String department;
    private HashMap<Integer, Semester> semesters = new HashMap<>();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public HashMap<Integer, Semester> getSemesters() {
        return semesters;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", department=" + department + ", semesters=" + semesters + "]";
    }
}