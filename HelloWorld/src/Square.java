public class Square implements Shape{
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public void draw() {
        System.out.println("Chaduram");
    }

    public String getShapeType() {
        return "2-D";
    }
}
