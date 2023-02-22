package hashmap;

import java.util.HashMap;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<String, String>();
        HashMap<String, String> reversetickets = new HashMap<String, String>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = "";

        for(String from : tickets.keySet()){
            reversetickets.put(tickets.get(from), from);
        }

        for(String from : tickets.keySet()){
            if(!reversetickets.containsKey(from)){
                start= from;
                break;
            }
        }

        System.out.print(start);
        for(String from : tickets.keySet()){
            System.out.print( " -> " + tickets.get(start));
            start = tickets.get(start);
        }


    }
}
