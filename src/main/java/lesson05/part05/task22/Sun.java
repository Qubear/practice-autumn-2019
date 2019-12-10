package lesson05.part05.task22;

public class Sun implements Planet {
    private static Sun f = null;
    private Sun(){ }
    public Sun getMoon(){
        if(f==null)
        {
            Sun f = new Sun();
        }
        return f;
    }
}
