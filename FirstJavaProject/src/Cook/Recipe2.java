package Cook;

public class Recipe2 extends Recipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
        System.out.println("Switch On the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Make the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Switch Off the microwave");
        System.out.println("Clean everything");
    }
}
