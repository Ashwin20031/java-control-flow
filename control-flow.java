import java.util.*;
class ControlFlowJava{
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            num = num*-1;
            System.out.println("it is a negative number");
        }
        else{
            System.out.println("it is a positive number");
        }
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid number it should be between 1-7");
        }

        for (int ind = 1;ind<=num;ind++){
            System.out.print(ind+" ");
        }
        System.out.println();
        int ind = num;
        while(ind>0){
            System.out.print(ind+" ");
            ind--;
        }
        System.out.println("");
        int dig = 1;
        do{
            System.out.print(dig+" ");
            dig++;
        }while( dig <= 3 );
    }
}