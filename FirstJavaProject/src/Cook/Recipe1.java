package Cook;

public class Recipe1 extends Recipe{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Make the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean everything");
    }
}
