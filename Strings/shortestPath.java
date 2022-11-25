import java.util.Scanner;

// Q: Given a route containing 4 directions (N, E, W,S) . FInd the shortest path to the destination
// eg route --> W N E E N E S E N N N ==> (SHORTEST PATH = 5)

public class shortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String route = sc.next();
        
        System.out.println(shortestRoute(route));
        sc.close();
    }


    public static float shortestRoute(String route){
        
        int x =0 , y = 0;
        for(int i=0;i<route.length();i++){
            char c = route.charAt(i);
            if(c == 'N'){
                y++;
            }else if(c == 'E'){
                x++;
            }else if(c == 'w'){
                x--;
            }else{
                y--;
            }
        }
        return (float)Math.sqrt((x*x) + (y*y));
    }
}
