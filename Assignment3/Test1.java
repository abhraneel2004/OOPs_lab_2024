package Assignment3;
import java.util.Scanner;

class Library{
    String name;
    int price, day;
    double fine;
    Library(int day){
        this.day = day;
    }
    void input(String name, int price){
        this.name = name;
        this.price = price;
    }
    void cal(){
        if (day<=7){
            fine = 0.25*day;
        }
        else if (day>7 && day<=15){
            fine = 1.75 + 0.4*(day-7);
        }
        else if (day>15 && day<=30){
            fine = 4.95+ 0.6*(day-15);
        }
        else{
            fine = 13.95+ 0.8*(day-30);
        }
    }

    void display(){
        System.out.println("Book name: "+name);
        System.out.println("Fine to be paid: "+ fine);
    }
}

public class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of the book: ");
        String name = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        int price = sc.nextInt();
        System.out.println("Enter the number of days the book is late: ");
        int day = sc.nextInt();
        Library l = new Library(day);
        l.input(name, price);
        l.cal();
        l.display();
    }
}