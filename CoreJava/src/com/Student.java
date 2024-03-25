public class Student {
    private int regNo;
    private String Name;
    private String Email;


    public Student(int regNo, String name, String email) {
        this.regNo = regNo;
       this. Name = name;
        this.Email = email;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
void disply(){
    System.out.println("REGISTRATION NO: " + getRegNo() + "Name: " + getName() + "Email : " + getEmail());
}

}
