package lesson05.part04.task12;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    public Computer(Keyboard k, Monitor m1,Mouse m2){
        keyboard=k;
        monitor=m1;
        mouse=m2;
    }
    public Keyboard getKeyboard() { return keyboard; }
    public Monitor getMonitor() {  return monitor;}
    public Mouse getMouse() { return mouse; }
}
