public class Test3 {
    public void m1() throws InterruptedException{
        for(int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+(i+1));
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new Test3().m1();
    }
}
