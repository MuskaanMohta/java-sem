import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            int marks = sc.nextInt(); 
            sum+=marks;
        }
        double avg = sum/5.0;
        System.out.printf("%.2f\n",avg); 
    }
}