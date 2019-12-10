package lesson05.part05.task22;

public class Earth implements Planet {
    private static Earth f = null;
    private Earth(){
    }
    public Earth getEart(){
        if(f==null)
        {
            Earth f = new Earth();
        }
        return f;
    }
}
