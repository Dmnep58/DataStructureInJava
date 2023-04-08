package Problems;

import java.util.HashSet;
import java.util.Set;

public class factorOf {
    private static int solve(int l, int h) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        int res = 0;
        for(int i=9;i<=h;i++) {
            if(set.contains(i/3) && i%3==0 || set.contains(i/5) && i%5==0) {
                set.add(i);
            }
        }
        for(int i=l;i<=h;i++) {
            if(set.contains(i))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int l1=200, h1=405;
        int l2=1, h2=1;
        System.out.println(solve(l1, h1));
        System.out.println(solve(l2, h2));
    }
}
