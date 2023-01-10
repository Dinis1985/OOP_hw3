import OOP_HW2.Data.User;
import OOP_HW2.Util.ReaderFromTxt;
import OOP_HW2.Util.WriterToTxt;

public class StudentDataService implements DataService {
    
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}