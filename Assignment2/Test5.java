import java.util.Scanner;

class Telephone{
    int pre;
    int prev;
    String name;
    int call;
    double amt;
    double total;

    void input(int pre, int prev, String name){
        this.name = name;
        this.prev = prev;
        this.pre = pre;
        call = pre - prev;
    }
    void cal(){
        call = pre - prev;
        if(call<=100){
            amt = 0;
        }
        else if(call>100 && call<=200){
            amt = 0.9*(call-100);
        }
        else if(call>200 && call<=400){
            amt = 90 + 0.8*(call-200);
        }
        else{
            amt = 250 + 0.7*(call-400);
        }
        total = amt + 180;
    }
    void show(){
        System.out.println("Name of the customer: "+name);
        System.out.println("Calls Made: "+call);
        System.out.println("Amount to be paid: "+total);
    }
}

class Test5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the present calls made(int): ");
		int pre = sc.nextInt();
        System.out.println("Enter the previous calls made(int): ");
		int prv = sc.nextInt();
		Telephone t1 = new Telephone();
		t1.input(pre, prv, name);
		t1.cal();
		t1.show();
		sc.close();
    }
}