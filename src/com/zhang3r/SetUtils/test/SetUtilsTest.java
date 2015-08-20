package com.zhang3r.SetUtils.test;

import java.util.ArrayList;
import java.util.List;

import com.zhang3r.SetUtils.SetUtils;

public class SetUtilsTest {
	public static void main(String[] args){
		testUnion();
		testIntersect();
		testComplement();
		testProduct();
	}
	
	public static void testUnion(){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(0);
		list2.add(4);
		List<Integer> result = SetUtils.union(list1, list2);
		
		System.out.println(result);
		
	}
	public static void testIntersect(){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(0);
		list2.add(4);
		List<Integer> result = SetUtils.intersect(list1, list2);
		
		System.out.println(result);
		
	}
	public static void testComplement(){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(0);
		list2.add(4);
		List<Integer> result = SetUtils.complements(list1, list2);
		
		System.out.println(result);
		
	}
	public static void testProduct(){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(0);
		list2.add(4);
		List<List<Integer>> result = SetUtils.product(list1, list2);
		
		System.out.println(result);
		
	}
}
