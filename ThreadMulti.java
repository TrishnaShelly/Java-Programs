public class ThreadMulti {

    public static void main(String[] args) {
               A t1 = new A("Thread A");
                t1.start();
                try {
                    t1.join(2000);
                } catch (Exception e) {
                }
                System.out.println("After 2 Seconds ");
                Runnable r2 = new A("Thread B");
                A t2 = new A("Thread B");
                t2.start();
                try {
                    t2.join(5000);
                } catch (Exception e) {
                }
                System.out.println("After 5 seconds");
                // t1.suspend();
                try {
                    t2.join(10000);
                } catch (Exception e) {
                }
                t2.stop();
                System.out.println("Thread B stopped after 10 seconds");
                t1.stop();
                System.out.println("Thread A stopped after 10 seconds");
            }
        }

        class A extends Thread{
        A(String s){
            super(s);
        }
            public void run(){
                try {
                for(int i = 1; i <=25; i++) {
                   System.out.println(Thread.currentThread().getName() +                           ": " + i);
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+                  "Interrupted");
                }

            }
        }

