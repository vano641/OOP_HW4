public class Teacher extends User{

    private Integer teacherId;

    public Teacher(String firstName, String lastName, String middleName, Integer teacherId) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }


    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", firstName, lastName, middleName, teacherId );
    }
    
}