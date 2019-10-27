
class Sex{
    int age;
    String gender;
    static double height;
    
    static{
        height = 6.2;
    }
    
    public Sex(){
    age = 20;
    gender = "male";
}
    
  public void show(){
    System.out.println(age + " : " + gender + " : " + height);
}
  
  
}



public class StaticDemo {
    
     
     
    
    public static void main(String[] arg){
        
       
        
        Sex omoh = new Sex();
        
        
        
        Sex Imade = new Sex();
        
        
        omoh.show();
        Imade.show();
    }
    
    
    
    
    
}
