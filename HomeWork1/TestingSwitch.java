package HomeWork1;

public class TestingSwitch 
{
    public static void main(String[] args) 
    {
        char ch = 'a';

        System.out.println("Litera '" + ch + "' este consoana sau vocala?");

        switch(ch){
            case 'a': 
                System.out.println("Vocala");
            break;
            case 'e': 
                System.out.println("Vocala");
            break;
            case 'i': 
                System.out.println("Vocala");
            break;
            case 'o': 
                System.out.println("Vocala");
            break;
            case 'u': 
                System.out.println("Vocala");
            break;
            default:
                System.out.println("Consoana");
            break;
        }        
    }    
}
