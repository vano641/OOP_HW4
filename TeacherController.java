import java.util.ArrayList;
import java.util.List;

public class TeacherController {
    
    private List<Teacher> Tlist; // Список Учителей
    private TeacherView TView = new TeacherView(); // Экземпляр TeachreView

    public TeacherController() {
        this.Tlist = initTeacher();
    }

// Метод инициализации/редактирования учителей
    public List<Teacher> initTeacher() {
        List<Teacher> TeachersList = new ArrayList<>();
        TeachersList.add(new Teacher("Иван", "Иванов", "Иванович", 1));
        TeachersList.add(new Teacher("Петр", "Петров", "Петрович", 2));
        TeachersList.add(new Teacher("Алексей", "Алексеев", "Алексеевич", 3));
        return TeachersList;
    }

// Метод печати списка Учителей
    public void PrintTList(){ 
        TView.sendOnConsole(Tlist);
    }
}
