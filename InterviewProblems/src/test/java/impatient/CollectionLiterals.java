//package test.java.impatient;
//
//import org.junit.Test;
//
//import java.util.*;
//
//public class CollectionLiterals {
//
//    @Test
//    public void testModifyCollectionLiteral(){
//        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
//        //list.remove(7);
//        Collections.sort(list);
//    }
//
//    @Test
//    public void testModifyArraysAsList(){
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        //list.remove(7);
//        Collections.sort(list);
//    }
//
/// /    @Test
/// /    public void testMapOf(){
/// /        Map<String, Integer> map = Map.of("Jan", 1, "Feb", 2, "Mar", 3, "Apr", 4, "May", 5, "Jun", 6, "Jul", 7, "Aug", 8, "Sep", 9, "Oct", 0, "Nov", 11, "Dec", 12);
/// /        System.out.println(map);
/// /    }
//
//    @Test
//    public void testOptional(){
//        Optional<Integer> build = Runtime.version().build();
//        System.out.println(build.orElse(0));
//        System.out.println(build.get() == null ? 0 : build.get());
//    }
//}
