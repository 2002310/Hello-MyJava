
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * greed
 */
public class greed {
    public static void arra(int[] g,int[]s) {
        int child = 0;
        int cookies = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(;child<g.length&&cookies<s.length;){
            if(g[child]<=s[cookies]){
                child++;
            }
            cookies++;
        }
        System.out.println("能够满足" + child + "个人的胃口");
    }
    public static void main(String[] args) {
        int[] g = {1,2,3,4,5,8,9};
        int[] s = {1,6,3,4,5,2};
        arra(g, s);
    }
    
}