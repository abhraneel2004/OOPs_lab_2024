package pack1;

import pack1.Demo;

public class Test11 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("public: " + d.num_pub);
        System.out.println("protected: " + d.num_pro);
        System.out.println("default: " + d.num_def);

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
