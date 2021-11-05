package gaming;

public class Frogger implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump Up");
    }

    @Override
    public void down() {
        System.out.println("Jump Down");
    }

    @Override
    public void left() {
        System.out.println("Jump Left");
    }

    @Override
    public void right() {
        System.out.println("Jump Right");
    }
}
