import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher i : list) {
            System.out.println(i); // выводим в консоль id Учителя
        }
    }

    

}
