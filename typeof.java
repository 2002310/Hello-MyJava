import java.text.Format;

public class typeof {
    public static void main(String[] args) {
        // test:pack the type int conversion type string;
        int i = 123;
        String is = its(i);
        System.out.println(gittype(is) + is);
        int isi = sti(is);
        System.out.println(gittype(isi) + isi);
        // test:pack the type float conversion type string;
        String s = "129281.192";
        float a = stf(s);
        System.out.println(gittype(a) + a);
        String sas = fts(a);
        System.out.println(gittype(sas) + sas);
        // test:pack the type char arryas conversion type string;
        char[] c = new char[12];
        c[0] = 'h';
        c[1] = 'e';
        c[2] = 'l';
        c[3] = 'l';
        c[4] = 'o';
        c[5] = ' ';
        c[6] = 'w';
        c[7] = 'o';
        c[8] = 'r';
        c[9] = 'l';
        c[10] = 'd';
        String cs = cts(c);
        System.out.println(gittype(cs) + cs);
        char[] csc = stc(cs);
        System.out.println(gittype(csc) + csc[8]);
    }
    public static String gittype(Object o){
        return o.getClass().toString();
    }
    // 判断数据类型
    public static String fts(float value){
        Float fl = new Float(value);
        return fl.toString();
    }
    public static Float stf(String value){
        Float fl = Float.valueOf(value);
        return fl.floatValue();
    }
    // 浮点数和字符串的转换
    public static String its(int i){
        Integer fl = Integer.valueOf(i);
        return fl.toString();
    }
    public static int sti(String i){
        String fl = new String(i);
        return Integer.parseInt(fl);
    }
    // 整形和字符串类型的转换
    public static char[] stc(String i){
        char[] a = i.toCharArray();
        return a;
    }
    public static String cts(char[] i){
        String str = "";
        for(int o =0;o<i.length;o++){
            str += i[o];
        } 
        return str;
    }
    // 字符串类型和字符数组的转换
}
