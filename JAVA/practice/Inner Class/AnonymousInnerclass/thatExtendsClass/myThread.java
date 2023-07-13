class myThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread " + i);
        }
    }
}

class Test {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}

