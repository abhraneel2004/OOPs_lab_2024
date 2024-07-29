class Factorial{
  int x;
  Factorial(int x){
    this.x = x;
  }
  public int factorial(){
    int fact = 1;
    for(int i = 1; i <= x; i++){
      fact = fact * i;
    }
    return fact;
  }
}

class Test1{
  static int validData(String a){
    for(int i=0; i< a.length(); i++){
      if (a.charAt(i)<'0' || a.charAt(i)>'9') return 0;
    }
    return 1;
  }
  public static void main(String[] args){
    if (validData(args[0])==1){
      int n = Integer.parseInt(args[0]);
      Factorial f = new Factorial(n);
      System.out.println("Factorial = "+f.factorial());
    }
  }
}