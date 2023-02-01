package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        
            String ans = "";
            if(divider==0) ans="division by zero";
            else {
                int result = dividend/divider;
            ans =  result*divider==dividend ? "can be divided completely" : "cannot be divided completely" ;}
            System.out.println(ans);
    }
}
