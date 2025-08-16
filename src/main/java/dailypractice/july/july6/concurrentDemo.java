package dailypractice.july.july6;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentDemo {
    public static void main(String[] args) {

//        //**************Example of .ConcurrentModificationException
//        System.out.println("**********************ConcurrentModificationException");
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//
//        Iterator<Integer> it = map.keySet().iterator();
//        while(it.hasNext()){
//            Integer key = it.next();
//            System.out.println("Map value is :" + map.get(key));
//            if(key.equals(2))
//                map.put(4,4);
//        }
        ConcurrentHashMap cuncurrentMap = new ConcurrentHashMap();
        cuncurrentMap.put(1,1);
        cuncurrentMap.put(2,2);
        cuncurrentMap.put(3,3);

        Iterator<Integer> it = cuncurrentMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Map value is :" + cuncurrentMap.get(key));
            if(key.equals(2))
                cuncurrentMap.put(4,4);
        }

    }
}
