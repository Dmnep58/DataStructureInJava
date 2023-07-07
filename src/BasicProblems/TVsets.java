package BasicProblems;

import java.util.Set;

public class TVsets {

    public int shooping(int N, int L,int R,int[] cost){
        int count=0;
        for(int i = 0; i<cost.length;i++){
            if(cost[i]>=L || cost[i]<=R){
                count++;
            }
        }
        return count;

    }
}
