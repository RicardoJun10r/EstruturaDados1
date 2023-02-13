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

    }

    private void collectionList()
    {
        Integer numero = 2;
        System.out.println("LIST");
        System.out.println("ArrayList");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.size();
        arrayList.get(0);
        arrayList.isEmpty();
        arrayList.add(2);
        arrayList.toString();
        arrayList.contains(numero);
        arrayList.clear();

        System.out.println("Vector");
        List<Integer> vetor = new Vector<>();
        vetor.size();
        vetor.get(0);
        vetor.contains(numero);
        vetor.add(2);
        vetor.remove(numero);
        vetor.clear();

        System.out.println("LinkedList");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.size();
        linkedList.get(0);
        linkedList.isEmpty();
        linkedList.add(numero);
        linkedList.add(3);
        linkedList.toString();
        linkedList.clear();
    }

    private void collectionSet()
    {
        Integer numero = 2;
        System.out.println("SET");
        System.out.println("HashSet");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.size();
        hashSet.add(3);
        hashSet.add(2);
        hashSet.contains(numero);
        hashSet.clear();

        System.out.println("LinkedHashSet");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.size();
        linkedHashSet.add(numero);
        linkedHashSet.add(4);
        linkedHashSet.remove(numero);
        linkedHashSet.clear();

        System.out.println("TreeSet");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.size();
        treeSet.add(numero);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.remove(numero);
        treeSet.toString();
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
        fila.peek();
        fila.isEmpty();
        fila.poll();
        fila.clear();

        System.out.println("LinkedList");
        Queue<Integer> queueLinkedList = new LinkedList<>();
        queueLinkedList.add(numero);
        queueLinkedList.add(3);
        queueLinkedList.peek();
        queueLinkedList.poll();
        queueLinkedList.clear(); 
    }

    private void collectionDeque()
    {
        Integer numero = 2;
        System.out.println("DEQUE");
        System.out.println("LinkedList");
        Deque<Integer> deque = new LinkedList<>();
        deque.add(numero);
        deque.add(3);
        deque.peek();
        deque.peekFirst();
        deque.peekLast();
        deque.pollFirst();
        deque.pollLast();
        deque.pop();
        deque.clear();
    }

    private void collectionMap()
    {
        Integer numero = 2;
        System.out.println("MAP");
        System.out.println("HashMap");
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, numero);
        map.put(1L, 2);
        map.entrySet();
        map.get(0L);
        map.size();
        map.clear();

        System.out.println("LinkedHashMap");
        Map<Long, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0L, numero);
        linkedHashMap.put(1L, 3);
        linkedHashMap.toString();
        linkedHashMap.size();
        linkedHashMap.clear();

        System.out.println("TreeMap");
        Map<Long, Integer> treeMap = new TreeMap<>();
        treeMap.put(0L, numero);
        treeMap.put(1L, 3);
        treeMap.get(0L);
        treeMap.toString();
        treeMap.clear();        
    }
    
}
