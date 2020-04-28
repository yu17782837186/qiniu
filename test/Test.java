import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0;i < strs.length;i++) {
            strs[i] = sc.nextLine();
            String s = isYes(strs[i]);
            System.out.println(s);
        }
    }
    public static String isYes(String str) {
        int len = str.length();
        int mid = len/2;
        int count = 0;
        if(str.charAt(mid) != str.charAt(mid+1)) {
            for(int i = 0;i < len;i++) {
                if(str.charAt(i) != str.charAt(len-i-1)) {
                    return "No";
                }
            }
        }else {
            for(int j = mid;j < len;j++) {
                if(str.charAt(j) == str.charAt(j+1)) {
                    count++;
                }
            }
            int high = mid + count;
            char c = str.charAt(mid);
            for(int m = mid;m <= high;m++) {
                if(str.charAt(m) != c) {
                    return "No";
                }
            }
            int low = mid - 1 - count;
            char c1 = str.charAt(low);
            for(int n = low;n <= (mid-1);n++) {
                if(str.charAt(n) != c1) {
                    return "No";
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int p = 0;p < low;p++) {
                sb.append(str.charAt(p));
            }
            for(int q = (high+1);q < len;q++) {
                sb.append(str.charAt(q));
            }
            String string = sb.toString();
            int length = string.length();
            for(int w = 0;w < length;w++) {
                if(string.charAt(w) != string.charAt(length-w-1)) {
                    return "No";
                }
            }
        }
        return "Yes";
    }
}
