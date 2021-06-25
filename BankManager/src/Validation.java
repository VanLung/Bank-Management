

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Validation {

    Scanner sc = new Scanner(System.in);
    public int getInteger(int minNum, int maxNum){
        int num=0;
        boolean valid;
        do {            
            valid=true;
            try {
                num=Integer.parseInt(sc.nextLine());
                if(num<minNum ||num>maxNum){
                    System.out.println("Invalid input!");
                    System.out.println("Input again!");
                    valid=false;
                }
            } catch (Exception e) {
                System.out.println("Required integer!");
                System.out.println("Input again!");
                valid=false;
            }
        } while (!valid);
        return num;
    }
    public String getString(){
        String input;
        boolean valid;
        do {            
            valid=true;
            input=sc.nextLine().trim();
            if(input.length()<1){
                System.out.println("Invalid input!");
                System.out.println("Input again!");
                valid=false;
            }
        } while (!valid);
        return input;
    }
}