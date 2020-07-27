    import java.util.*;
    public class cpbracket {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            for (int t = 0; t < T; t++) {
                int n = in.nextInt();
                String s = in.next();
                int c=0;
                for(int i=0;i<n;i++){
                    if(s.charAt(i)=='('){
                        c++;
                    }
                    else{
                        c--;
                        if(c<0){
                            c=0;
                        }
                    }
                }
                System.out.println(c);
            }
        }
    }

