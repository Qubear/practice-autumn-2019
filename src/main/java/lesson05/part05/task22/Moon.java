package lesson05.part05.task22;

public class Moon implements Planet {
    private static Moon f = null;
    private Moon(){ }
    public Moon getMoon(){
        if(f==null)
        {
            Moon f = new Moon();
        }
        return f;
    }
}
