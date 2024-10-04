package Leetcode_Arrays;

public class Leetcode_1732 {
    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int [] gain){
      int current_altitude = 0;
      int maximum_altitude = 0;

      for(int i = 0;i<gain.length;i++){
          current_altitude += gain[i];

          if(current_altitude > maximum_altitude){
              maximum_altitude = current_altitude;
          }
      }

      return maximum_altitude;
    }
}
