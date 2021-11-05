package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
    private int i=0;
    private int j=0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI() {
        lockForI.lock();
        i++;
        lockForI.unlock();
    }

    public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}