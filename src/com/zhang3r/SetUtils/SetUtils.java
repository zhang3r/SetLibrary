package com.zhang3r.SetUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetUtils {
	/**
	 * Creates a List that is the union of the two list inputs
	 * This uses a Map to create the list and therefore is only O(n)
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> List<T> union(List<T> list1, List<T> list2){
		List<T> result = new ArrayList<>();
		HashMap<T,String> map = new HashMap<>();
		for(T item: list1){
			map.put(item, "");
		}
		
		for(T item:list2){
			if(!map.containsKey(item)){
				map.put(item, "");
			}
		}
		for(T item:map.keySet()){
			result.add(item);
		}
		
		return result;
	}
	/**
	 * Creates a List that is the intersect of the two list inputs
	 * This uses a Map to create the list and therefore is only O(n)
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> List<T> intersect(List<T> list1, List<T> list2){
		List<T> result = new ArrayList<>();
		HashMap<T,String> map = new HashMap<>();
		for(T item: list1){
			map.put(item, "");
		}
		
		for(T item:list2){
			if(map.containsKey(item)){
				result.add(item);
			}
		}		
		
		return result;
	}
	/**
	 * creates a complement between list1 and list2
	 * if list1 ={ 1,2,3}
	 * list2 = {2,3}
	 * result = {1}
	 * 
	 * if list1 ={1,2,3}
	 * list2 = {1,2,3,4}
	 * result ={}
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> List<T> complements(List<T> list1, List<T> list2){
		List<T> result = new ArrayList<>();
		HashMap<T,String> map = new HashMap<>();
		for(T item: list2){
			map.put(item, "");
		}
		
		for(T item:list1){
			if(!map.containsKey(item)){
				result.add(item);
			}
		}		
		return result;
	}
	/**
	 * creates an List of Lists of the cartesian product of the two lists
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> List<List<T>> product(List<T> list1, List<T> list2){
		List<List<T>> result = new ArrayList<>();
		for(T item1:list1){
			for(T item2:list2){
				List<T> temp = new ArrayList<>();
				temp.add(item1);
				temp.add(item2);
				result.add(temp);
			}
		}
		return result;
	}

}
