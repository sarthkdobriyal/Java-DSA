//Given an array containing n nonnegetive integers of elevations.Calculate how much water it can trap
//Trapped water = (Height of water - height of elevation)* width
// height of water trapped for one bar = Min(leftmost highest bar , rightmost highest bar)
package Array;

public class trappingRainwater {
    public static void main(String[] args) {
        int elev[] = {4, 2, 0, 3, 2, 5};

        int lhb[] = new int[elev.length]; 
        int rhb[] = new int[elev.length]; 

        lhb[0] = elev[0];
        for(int i=1;i<elev.length;i++){
            lhb[i] = Math.max(lhb[i-1], elev[i]);
        }

        rhb[rhb.length-1] = elev[elev.length-1];
        for(int i=elev.length-2;i>=0;i--){
            rhb[i] = Math.max(elev[i], rhb[i+1]);
        }

        int waterLevel = 0;
        int trappedWater = 0;
        for(int i=1;i<elev.length;i++){
            waterLevel = Math.min(lhb[i],rhb[i]);
            trappedWater += waterLevel - elev[i];
        }

        System.out.println(trappedWater);

    }
}
