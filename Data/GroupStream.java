import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>{
    private List <StudentGroup> listStudentGroup;

    public GroupStream(List <StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    public List<StudentGroup> getListStudentGroup() {
        return listStudentGroup;
    }

    public void setListStudentGroup(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(listStudentGroup);
    }
    
}