class Student{
    
   private int score;
    String name;
    String gender;
    double height;
    
   
   public void setScore(int s){
       score = s;
   }
   public int getScore(){
       return score;
   }
}
 
public class EncapDemo {
    
    
    
    public static void main(String[] args){
        
        Student s1 = new Student();
        s1.setScore(7);
        s1.name = "omoh";
        s1.gender = "male";
        s1.height = 6.2;
        
        System.out.println(s1.getScore());
        
        
    }
    
}
