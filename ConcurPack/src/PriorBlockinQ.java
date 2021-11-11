import java.util.concurrent.PriorityBlockingQueue;

class Student implements Comparable<Student>{
    String name;
    int rank;

    public Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';

    }

    @Override
    public int compareTo(Student o) {
        return this.rank - o.rank;
    }
}

//class StudentComparator implements Comparable<Student> {
//    @Override
//    public int compareTo(Student o) {
//        return this.rank - o.rank;
//    }
//}

public class PriorBlockinQ {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
        queue.add(10);//Lowest priority
        queue.add(2);//highest priority
        queue.add(5);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        PriorityBlockingQueue<Student> queue1 = new PriorityBlockingQueue<Student>();
        queue1.add(new Student("A",12));//Lowest priority
        queue1.add(new Student("B",1));//highest priority
        queue1.add(new Student("C",4));

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
    }
}
