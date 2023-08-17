
public class Jump extends Game{
    private int rope = 1;
    protected boolean outside;
    public Jump(){
        super();
        //new Jump(4);
        this(4);
        outside = true;
        this.name = "d";
    }

    public Jump(int rope){
        this.rope = outside ? rope : rope+1;
    }

    public static void main(String[] bounce){
        System.out.println(new Jump().rope);
    }
}
