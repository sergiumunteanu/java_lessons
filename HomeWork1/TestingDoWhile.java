package HomeWork1;

public class TestingDoWhile 
{
    public static void main(String[] args) 
    {
        int nr=11, sum=0;


        do{
            sum += nr;
            nr--;
        }while(nr > 0);

        System.out.println(sum);
    }    
}
