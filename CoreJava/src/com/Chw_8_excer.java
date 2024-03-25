class employee{
    int Salary;
     String  name;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class celphone {

   public static void ringing(){
        System.out.println("ringing");
    }

    public static void vibrate (){
        System.out.println("vibrate");
    }

}

public class Chw_8_excer {
    public static void main(String[] args) {

        employee em= new employee();
        em.setName("Sandesh");
        em.setSalary(50);

        System.out.println( em.getName() +"\t Salary is \t"+ em.getSalary()+"."  );

        celphone cell= new celphone();
        cell.ringing();
        cell.vibrate();

    }


}



