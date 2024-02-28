package multithreading;

import java.awt.*;

public class DelayingStrategySample {
    public static void main(String[] args) {
        int reps = 100;
        int delayTime = 10;
        Toolkit tk = Toolkit.getDefaultToolkit();

        // 두 스레드 실행 (sleep or occupy)
        boolean occupyCpu = true;  // true/false 바꿔가며 실험해 보기
        printThreadWithElapsed(reps, delayTime, occupyCpu);
        beepThreadWithElapsed(tk, reps, delayTime, occupyCpu);
    }

    public static class ThreadWithElapsed extends Thread {
        public  ThreadWithElapsed(Runnable target) {
            super(target);
        }
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            super.run();
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println(this.getName()+" done at elapsed time:"+elapsedTime+"ms");
        }
    }
    public static void printThreadWithElapsed(int reps, int delayTime, boolean isOccupyThread) {
        ThreadWithElapsed printElapsedThread = new ThreadWithElapsed(() -> {
            for (int i = 0; i < reps; i++) {
                System.out.println("Beep" + i);
                delayMethod(delayTime, isOccupyThread);
            }
        });
        printElapsedThread.setName("프린팅 스레드");
        printElapsedThread.start();
    }
    public static void beepThreadWithElapsed(Toolkit tk, int reps, int delayTime, boolean isOccupyThread) {
        ThreadWithElapsed beepElapsedThread = new ThreadWithElapsed(() -> {
            for (int i = 0; i < reps; i++) {
                tk.beep();
                delayMethod(delayTime, isOccupyThread);
            }
        });
        beepElapsedThread.setName("비프음 스레드");
        beepElapsedThread.start();
    }
    public static void delayMethod(int delayTime, boolean isOccupyThread) {
        if(!isOccupyThread) {
            // sleep()을 사용한 delay
            try { Thread.sleep(delayTime); } catch (InterruptedException e) { throw new RuntimeException(e); }
        } else {
            // CPU 점유형 delay
            long startTime = System.currentTimeMillis();
            long elapsedTime = 0;
            while (elapsedTime < delayTime) {
                // Update elapsed time
                elapsedTime = System.currentTimeMillis() - startTime;
            }
        }
    }
}