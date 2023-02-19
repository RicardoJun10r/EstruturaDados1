package QuestaoQuarentaUm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class QuestaoQuarentaUmResposta {
    
    public QuestaoQuarentaUmResposta()
    {
        this.collectionList();
        System.out.println();
        this.collectionSet();
        System.out.println();
        this.collectionQueue();
        System.out.println();
        this.collectionDeque();
        System.out.println();
        this.collectionMap();
    }

    private void collectionList()
    {
        Integer numero = 2;
        System.out.println("LIST");
        System.out.println("ArrayList");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(78);
        arrayList.add(25);
        arrayList.add(69);
        arrayList.add(9);
        arrayList.add(numero);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.toString());
        System.out.println(arrayList.contains(numero));
        arrayList.clear();
        System.out.println();

        System.out.println("Vector");
        List<String> vetor = new Vector<>();
        vetor.add("RN");
        vetor.add("CE");
        vetor.add("RO");
        vetor.add("SP");
        vetor.add("RJ");
        System.out.println(vetor.size());
        System.out.println(vetor.get(0));
        System.out.println(vetor.contains("RN"));
        System.out.println(vetor.toString());
        System.out.println(vetor.remove("SP"));
        System.out.println(vetor.toString());
        vetor.add(0, "SP");
        System.out.println(vetor.toString());
        vetor.clear();
        System.out.println();

        System.out.println("LinkedList");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(numero);
        linkedList.add(5);
        linkedList.add(94);
        linkedList.add(3434);
        linkedList.add(5151);
        linkedList.add(88888);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.toString());
        linkedList.remove(numero);
        System.out.println(linkedList.toString());
        linkedList.clear();
    }

    private void collectionSet()
    {
        Integer numero = 2;
        System.out.println("SET");
        System.out.println("HashSet");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        hashSet.add(25);
        hashSet.add(55);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(6);
        hashSet.add(0);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(numero));
        System.out.println(hashSet.toString());
        hashSet.remove(55);
        System.out.println(hashSet.toString());
        hashSet.clear();
        System.out.println();

        System.out.println("LinkedHashSet");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(numero);
        linkedHashSet.add(8);
        linkedHashSet.add(9);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(8);
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.toString());
        linkedHashSet.remove(numero);
        System.out.println(linkedHashSet.toString());
        linkedHashSet.clear();
        System.out.println();

        System.out.println("TreeSet");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(numero);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(8);
        treeSet.add(10);
        System.out.println(treeSet.size());
        System.out.println(treeSet.toString());
        System.out.println(treeSet.remove(numero));
        System.out.println(treeSet.toString());
        treeSet.clear();

    }

    private void collectionQueue()
    {
        Integer numero = 2;
        System.out.println("QUEUE");
        System.out.println("PriorityQueue");
        Queue<Integer> fila = new PriorityQueue<>();
        fila.add(numero);
        fila.add(3);
        fila.add(1);
        fila.add(4);
        fila.add(8);
        fila.add(9);
        fila.add(10);
        System.out.println(fila.toString());
        System.out.println(fila.peek());
        System.out.println(fila.isEmpty());
        System.out.println(fila.poll());
        System.out.println(fila.toString());
        fila.clear();
        System.out.println();

        System.out.println("LinkedList");
        Queue<Integer> queueLinkedList = new LinkedList<>();
        queueLinkedList.addAll(fila);
        queueLinkedList.add(numero);
        queueLinkedList.add(3);
        queueLinkedList.toString();
        queueLinkedList.peek();
        queueLinkedList.poll();
        queueLinkedList.toString();
        queueLinkedList.clear(); 
    }

    private void collectionDeque()
    {
        Integer numero = 2;
        System.out.println("DEQUE");
        System.out.println("LinkedList");
        Deque<Integer> deque = new LinkedList<>();
        deque.add(numero);
        deque.add(1);
        deque.add(8);
        deque.add(7);
        deque.add(40);
        deque.add(3);
        System.out.println(deque.toString());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pop());
        System.out.println(deque.toString());
        deque.clear();
    }

    private void collectionMap()
    {
        Integer numero = 2;
        System.out.println("MAP");
        System.out.println("HashMap");
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, numero);
        map.put(1L, 3);
        map.put(2L, 1);
        map.put(3L, 10);
        map.put(4L, 22);
        map.put(5L, 43);
        map.put(null, 2);
        System.out.println(map.toString());
        System.out.println(map.entrySet());
        System.out.println(map.get(0L));
        System.out.println(map.remove(null, 2));
        System.out.println(map.containsKey(0L));
        System.out.println(map.containsValue(10));
        System.out.println(map.replace(2L, 1, 84));
        System.out.println(map.size());
        System.out.println(map.keySet().toString());
        System.out.println(map.toString());
        map.clear();
        System.out.println();

        System.out.println("LinkedHashMap");
        Map<Long, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0L, "RN");
        linkedHashMap.put(1L, "SP");
        linkedHashMap.put(2L, "RO");
        linkedHashMap.put(3L, "CE");
        linkedHashMap.put(4L, "PE");
        linkedHashMap.put(5L, "AL");
        linkedHashMap.put(null, "TT");
        System.out.println(linkedHashMap.toString());
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.containsKey(0L));
        System.out.println(linkedHashMap.remove(3L, "CE"));
        System.out.println(linkedHashMap.replace(null, "TT", "RJ"));
        System.out.println(linkedHashMap.isEmpty());
        System.out.println(linkedHashMap.get(3L));
        System.out.println(linkedHashMap.keySet().toString());
        System.out.println(linkedHashMap.containsValue("PE"));
        linkedHashMap.clear();
        System.out.println();

        System.out.println("TreeMap");
        Map<Long, Integer> treeMap = new TreeMap<>();
        treeMap.put(0L, numero);
        treeMap.put(1L, 3);
        treeMap.put(2L, 8);
        treeMap.put(3L, 7);
        treeMap.put(4L, 10);
        System.out.println(treeMap.get(0L));
        System.out.println(treeMap.toString());
        System.out.println(treeMap.isEmpty());
        System.out.println(treeMap.size());
        System.out.println(treeMap.containsKey(4L));
        System.out.println(treeMap.containsValue(8));
        System.out.println(treeMap.replace(3L, 7, 9));
        System.out.println(treeMap.keySet().toString());
        System.out.println(treeMap.remove(2L, 8));
        System.out.println(treeMap.toString());
        treeMap.clear();        
    }
    
}
