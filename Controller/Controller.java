import OOP_HW2.Data.StudentGroup;
import OOP_HW2.Data.Student;
import OOP_HW2.Data.Teacher;
import OOP_HW2.Service.DataService;
import OOP_HW2.Service.StudentDataService;
import OOP_HW2.Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent (Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher (Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}