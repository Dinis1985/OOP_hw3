import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List <Student> students;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List <Student> students, int groupNumber) {
        this.teacher = teacher;
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}