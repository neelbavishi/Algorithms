package com.interview.multithreading.Threads;

class DiningPhilosophers {
    private boolean[] valid;
    
    private final int[] leftFork = new int[] {0, 1, 2, 3, 4};
    private final int[] rightFork = new int[] {4, 0, 1, 2, 3};
    
    public DiningPhilosophers() {
        valid = new boolean[5];
        for (int i = 0; i < 5; ++i) {
            valid[i] = true;
        }
    }
    
    
    // call the run() method of any runnable to execute its code
    public void wantsToEat(int i,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int left = leftFork[i];
        int right = rightFork[i];
        
        synchronized (valid) {
            while (!valid[left] || !valid[right]) {
                valid.wait();
            }
            valid[left] = false;
            valid[right] = false;
            pickLeftFork.run();
            pickRightFork.run();
            valid.notifyAll();
        }
        
        eat.run();
        
        synchronized(valid) {
            putLeftFork.run();
            valid[left] = true;
            valid.notifyAll();
        }
        
        synchronized(valid) {
            putRightFork.run();
            valid[right] = true;
            valid.notifyAll();
        }
    }
}
