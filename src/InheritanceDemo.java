class Porn{
    public int add(int i, int j)
    {
        
        return i+j;
    }
}
   class Sex extends Porn{
        
        public int sub(int i, int j)
        {
            return i-j;
        }
    }
   

       
        
        
public class InheritanceDemo {
    
    public static void main(String[] args){
        Sex c1 = new Sex();
        int res1 = c1.add(5,4);
        int res2 = c1.sub(6,3);
        
        
        System.out.println(res2);
         System.out.println(res1);
    }
    
}
