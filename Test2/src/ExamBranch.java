import java.util.ArrayList;

class ExamBranch {
    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id)
                return student;
        }
        return null;
    }

    public int getStudentByIdBySemesterPracticals(int id, int semKey, int practical) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                Semester requiredSem = student.getSemesters().get(semKey);
                if (requiredSem != null) {
                    if (practical == 1)
                        return requiredSem.getPractical1();
                    else if (practical == 2)
                        return requiredSem.getPractical2();
                }
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ExamBranch [students=" + students + "]";
    }
}