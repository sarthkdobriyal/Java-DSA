package hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImpl {

    static class HashMap<K,V>{
        
        //Node class
        private class Node{
            K key;
            V val;

            public Node(K key , V val){
                this.key = key;
                this.val = val;
            }
        }

        
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.n=0;
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFn(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }

        private int searchinLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = -1;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    di = i;
                }
            }
            return di;
        }

        private void rehash(){
            LinkedList<Node> oldBuc[] = buckets;
            buckets = new LinkedList[2*N];
            N = 2*N;
            for(int i=0;i<oldBuc.length;i++){
                LinkedList<Node> ll = oldBuc[i];
                Node node = ll.remove();
                put(node.key,node.val);
            }
        }

        public void put(K key, V value){
            int bi = hashFn(key);
            int di = searchinLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.val = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lambda = (double) n/N;

            if(lambda > 2.0){
                rehash();
            }


        }


        public V remove(K key){
            int bi = hashFn(key);
            int di = searchinLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.val;
            }

            return null;
        }

        public V get(K key){
            int bi = hashFn(key);
            int di = searchinLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.val;
            }

            return null; 
        }

        public boolean isEmpty(){
            return N==0;
        }

        public int size(){
            return n;
        }

        public boolean containsKey(K key){
            int bi = hashFn(key);
            LinkedList<Node> ll = buckets[bi];

            for(int i=0;i<ll.size();i++ ){
                if(ll.get(i).key == key){
                    return true;
                }
            }
            return false;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> al = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    al.add(node.key);
                }
            }
            return al;
        }


    }


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india",50 );
        map.put("china",50 );
        map.put("usa",20 );

        System.out.println(map.containsKey("india"));

        System.out.println(map.keySet());
        System.out.println(map.get("india"));
        System.out.println(map.remove("india"));
        System.out.println(map.get("india"));
    }
    
}
