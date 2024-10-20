package pack2;

import pack1.Demo;

public class Test12 {
    public static void main(String[] args){
        Demo d = new Demo();
        System.out.println("public: " + d.num_pub);

        /*
        System.out.println("protected: " + d.num_pro);
         * error: num_pro has protected access in Demo
        System.out.println("protected: " + d.num_pro);
        */

        /*
        System.out.println("default: " + d.num_def);
         * error: num_def is not public in Demo; cannot be accessed from outside package
        System.out.println("default: " + d.num_def);
        */
        
        /*
        * 
         * System.out.println("private: " + d.num_pri);
         * error: num_pri has private access in Demo
         * System.out.println("private: " + d.num_pri);
         * ^
         * 
         */
    }
}
