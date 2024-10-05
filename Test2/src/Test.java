import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamBranch branch = new ExamBranch();
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student by ID");
            System.out.println("3. Get Practical Marks by Student ID and Semester");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Department: ");
                    String department = scanner.next();
                    Student student = new Student();
                    student.setStudentId(studentId);
                    student.setDepartment(department);
                    
                    for (int i = 1; i <= 4; i++) {
                        System.out.println("Enter details for Semester " + i + ":");
                        System.out.print("SemId: ");
                        int semId = scanner.nextInt();
                        System.out.print("Sub1: ");
                        int sub1 = scanner.nextInt();
                        System.out.print("Sub2: ");
                        int sub2 = scanner.nextInt();
                        System.out.print("Sub3: ");
                        int sub3 = scanner.nextInt();
                        System.out.print("Sub4: ");
                        int sub4 = scanner.nextInt();
                        System.out.print("Practical1: ");
                        int practical1 = scanner.nextInt();
                        System.out.print("Practical2: ");
                        int practical2 = scanner.nextInt();
                        Semester sem = new Semester(semId, sub1, sub2, sub3, sub4, practical1, practical2);
                        student.getSemesters().put(semId, sem);
                    }
                    
                    branch.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    
                    System.out.print("Enter Student ID: ");
                    int idToFetch = scanner.nextInt();
                    Student foundStudent = branch.getStudentById(idToFetch);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                  
                    System.out.print("Enter Student ID: ");
                    int idForMarks = scanner.nextInt();
                    System.out.print("Enter Semester Key (0-3): ");
                    int semKey = scanner.nextInt();
                    System.out.print("Enter Practical Number (1 or 2): ");
                    int practicalNum = scanner.nextInt();
                    int practicalMarks = branch.getStudentByIdBySemesterPracticals(idForMarks, semKey, practicalNum);
                    System.out.println("Practical Marks: " + practicalMarks);
                    break;

                case 4:
                    
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}

