public class BBAStudent extends Student {
    public BBAStudent(String name){
        updateName(name);
        updateDepartment("BBA");
    }
    public BBAStudent(){
        updateName("Default");
        updateDepartment("BBA");
    }
}
