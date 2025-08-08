public class deadlock {
    public void fun(){
        synchronized (Test.obj1){
            synchronized(Test.obj2){}
        }   
    }
    
    public void fun2(){
        synchronized Test.obj2;
    }
}


HELOO MAN