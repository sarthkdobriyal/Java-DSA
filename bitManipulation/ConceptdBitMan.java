public class ConceptdBitMan {

    //To check if ith bit is one or zero in binary
    public static int  getIBIt(int n, int i){
        return (n & (1<<i)) == 0 ? 0 : 1 ;
    }

    //To make ith bit 1
    public static int setIBit(int n, int i){
        return (n | (1 << i));
    }

    //To clear ith bit ==> if 1 make 0 
    public static int  clearIBit(int n, int i) {
        return (n & ~(1 << i));
    }

    //To update ith bit ==> either make it 1 or 0;
    public static int updateIBit(int n , int i, int update) {
        
        //One method: 
        // if(update == 0){
        //     return clearIBit(n, i);
        // }else{
        //     return setIBit(n, i);
        // }

         //2ND method:
         n = clearIBit(n, i);
         int bitmast = (update << i) ;  
         return n | bitmast;
            
    }


    //Clear last i bits->

    public static int  clearIBits(int n, int i) {
        return n & (-1 << i);
    }

    //Clear range of bits -> 
    public static int clearRangeBits(int n, int i, int j) {
        int a = (-1 << j+1);
        int b = (1 << i) -1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeBits(15, 1,2 ));
    }

    
}