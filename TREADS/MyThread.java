public class MyThread extends Thread {
    @Override
    public void run(){
        // System.out.println("Hello");
        for(int i =  1; i <= 5 ; i++){
            System.out.println(i);
        }
    }
}
