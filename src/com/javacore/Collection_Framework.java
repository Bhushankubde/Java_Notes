package com.javacore;
import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {
        System.out.println("hello world");
        //Type safe Collection


        //Un type safe Collection
//        LinkedList list = new LinkedList();
//        list.add("Rohit");
//        list.add(101);
//        list.add(true);
//        list.add(12.23);
//        System.out.println(list);

//        name.remove("Rock");
//        System.out.println(name);
//        System.out.println(name.size());
//        System.out.println(name.contains("Rohit"));

//        Vector<String> vc = new Vector<>();
//        vc.addAll(name);
//        System.out.println(vc);

//          Set<Integer> st = new HashSet<>();
//          st.add(2);
//          st.add(4);
//          st.add(3);
//          st.add(8);
//          st.add(9);
//          st.add(9);
//        System.out.println(st);

        Set<Integer> st = new TreeSet<>();
          st.add(4);
          st.add(3);
          st.add(8);
          st.add(9);
          st.add(4);
//        System.out.println(st);
//        for (Integer stt:st) {
//            System.out.println(stt);
//        }

          List<String> list = new ArrayList<>();
          list.add("Bhushan");
          list.add("Rohit");
          list.add("Sandeep");
          list.add("Purvesh");
        System.out.println(list);
        for (String tr:list) {
            System.out.print(tr+"\t "+tr.length()+"\t");
            StringBuffer br = new StringBuffer(tr);
            System.out.println(br.reverse());
        }
        System.out.println("______________________________");
        //Iterator       only Forward Travesing
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String nt = itr.next();
            System.out.println(nt);
        }
        System.out.println("______________________________");
        //ListIterator        Forward Travesing & Backward Travesing

        ListIterator<String> bcitr = list.listIterator(list.size());
        while (bcitr.hasPrevious()){
            String previous = bcitr.previous();
            System.out.println(previous);
        }

        System.out.println("______________________________");
        //foreach method

        list.forEach(e->{
            System.out.println(e);
        });

    }
}
