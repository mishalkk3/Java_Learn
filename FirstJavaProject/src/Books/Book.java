package Books;

public class Book {
    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies){
        if (noOfCopies >0)
            this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopies(int num) {
        setNoOfCopies(this.noOfCopies+num);
    }

    public void decreaseNoOfCopies(int num) {
        setNoOfCopies(this.noOfCopies-num);
    }

}
