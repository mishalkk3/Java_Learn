public class Door {
    String name;
    boolean isOpnen;
    boolean isLocked;

    void open() {
        isOpnen = true;
    }

    void close() {
        isOpnen = false;
    }

    void showStatus() {
        if(isOpnen)
            System.out.println(name+" door is open");
        else
            System.out.println(name+" door is closed");
    }
}
