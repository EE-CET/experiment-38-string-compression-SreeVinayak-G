import java.util.*;
public class StringCompression {
        private static String compress(String s,int n){
                StringBuilder sb = new StringBuilder();
                int cnt = 1;
                for(int i=1;i<n;i++){
                        if(s.charAt(i-1)==s.charAt(i)){
                                cnt++;
                        }else{
                                sb.append(s.charAt(i-1));
                                sb.append(cnt);
                                cnt=1;
                        }
                }
                sb.append(s.charAt(n-1));
                sb.append(cnt);
                return sb.toString();
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                int n = s.length();
                String res = compress(s,n);
                if(res.length()>=n){
                        System.out.println(s);
                }else{
                        System.out.println(res);
                }
        }
}
