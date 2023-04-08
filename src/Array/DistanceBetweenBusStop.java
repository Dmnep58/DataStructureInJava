package Array;

/*
A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance between
 all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.

The bus goes along both directions i.e. clockwise and counterclockwise.

Return the shortest distance between the given start and destination stops.

 */
public class DistanceBetweenBusStop {

    public int BusStops(int[] distance, int start, int destination) {
        int sum =0;
        int total=0;


        for(int i=0;i<distance.length;i++){
            if(start < destination  && (i>=start && i<destination)){
                sum +=distance[i];
            }
            if (start > destination  && (i>=start || i< destination)){
                sum += distance[i];
            }

            total += distance[i];
        }

        if(total-sum > sum){
            return sum;
        }
        else
            return total-sum;


    }

    public static void main(String[] args) {
        DistanceBetweenBusStop ds = new DistanceBetweenBusStop();

        int[] arr = {1,2,3,4};

        System.out.println("the distance is "+ds.BusStops(arr,0,2));
    }
}
