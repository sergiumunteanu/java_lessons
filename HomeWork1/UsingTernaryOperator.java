package HomeWork1;

public class UsingTernaryOperator
{
    public static void main(String[] args) 
    {
        int num = 1000000;
        String message;
        
        message = num <= 0 ? "Small" : num >= 1000000 ? "Large" : "";

        System.out.println(message);
    }    
}
