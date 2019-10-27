
class Sex{
    int age;
    String gender;
    double height;
    
  public void show(){
    System.out.println(age + " : " + gender + " : " + height);
}
  
}



public class StaticDemo {
    
     
     
    
    public static void main(String[] arg){
        
       
        
        Sex omoh = new Sex();
        omoh.age = 23;
        omoh.gender = "male";
        omoh.height = 6.2;
        
        
        Sex Imade = new Sex();
        Imade.age = 19;
        Imade.gender = "female";
        Imade.height = 5.5;
        
        omoh.show();
        Imade.show();
    }
    
    
    
    
    
}
