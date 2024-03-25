 class stdclss {
    int id;
    String stdName;
    String level;

     stdclss(int id, String stdName, String level){
         this.id=id ;
         this.stdName=stdName ;
         this.level=level ;

    }

     stdclss(stdclss s3){
         this.id=s3.id ;
         this.stdName=s3.stdName ;
         this.level=s3.level ;

     }

     public stdclss() {

     }

     public void setLevel() {
        System.out.println(id);
        System.out.println(stdName);
        System.out.println(level);
    }
}


public class Opp{
    public static void main(String[] args) {
        stdclss std1= new stdclss();
        std1.id =522;
        std1.stdName ="Sandesh mainali";
        std1.level ="l3";

        std1.setLevel();

//      stdclss para= new stdclss(23,"san","L3");
//      para.setLevel();
//
//        stdclss s2= new stdclss(para);
//        s2.setLevel();
    }


}
