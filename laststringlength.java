import java.util.Scanner;

public class laststringlength {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String l = sn.nextLine();
        System.out.println(lengthOfLastWord(l));
    }
    public static int lengthOfLastWord(String s) {
        String[] a;
        String k;
        String j = " ";
        a = s.split(j);
        int i = a.length;
        if(i == 0){
            return 0;
        }
        k = a[i-1];
        if(k == " "){
            return 0;
        }else{
            return k.length();
        }
    }
}
