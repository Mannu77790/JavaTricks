package org.mm.code.hashmap;

import java.util.Collection;
import java.util.HashMap;

import org.core.model.Employee;

public class TrickyQuestions {
	public static void main(String[] args) {
		
		System.out.println("************Store Java Object as a Key in a hashmap");
		//Put
		HashMap<Employee, String> hashMap = new HashMap<>(1);
		hashMap.put(new Employee("INDIA", "7.8"), "IND");
		hashMap.put(new Employee("USA", "8.8"), "USA");
		hashMap.put(new Employee("USA", "8.8"), "USA"); //Duplicate -> hashing tech
		
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		
		System.out.println("************Getting Java Object as a Key in a hashmap but return null because of hashing");
		//Get Key as java object // Alwways null because of hashing
		System.out.println(hashMap.get(new Employee("INDIA", "7.8")));
		
		
		System.out.println("************Store Java Object as a value in a hashmap");
		HashMap<String, Employee> hashMap2 = new HashMap<>();
		hashMap2.put( "IND", new Employee("INDIA", "7.8"));
		hashMap2.put( "USA", new Employee("USA", "8.8"));
		hashMap2.put( "USA", new Employee("USA", "8.8")); //Overwrite
		
		System.out.println(hashMap2);
		System.out.println(hashMap2.size());
		
		
		System.out.println("************Copying hashmap one to another directly");
		//WithoutPullAll
		HashMap<String, Employee> hashMap3 = hashMap2;
		System.out.println(hashMap3);
		System.out.println(hashMap3.size());
		
		System.out.println("************Copying hashmap one to another directly using pullAll");
		//With PullAll -> Copy Hashmap one to another
		HashMap<String, Employee> hashMap4 = new HashMap<>();
		hashMap4.put( "UK", new Employee("UK", "9.0"));
		hashMap4.putAll(hashMap3);
		System.out.println(hashMap4);
		System.out.println(hashMap4.size());
		
		//Copy haspmap one to another while intialize 
		HashMap<String, Employee> hashMap5 = new HashMap<>(hashMap4);
		System.out.println(hashMap5);
		System.out.println(hashMap5.size());
		
		//ifAbsent
		HashMap<String, Employee> hashMap6 = new HashMap<>(hashMap5);
		hashMap6.putIfAbsent( "UK", new Employee("UK", "10.0"));
		hashMap6.putIfAbsent( "IRE", new Employee("IRE", "10.5"));
		System.out.println(hashMap6);
		System.out.println(hashMap6.size());
		
		
		//If Exist
		HashMap<String, Employee> hashMap7 = new HashMap<>(hashMap6);
		System.out.println(hashMap7.containsKey("IND"));
		System.out.println(hashMap7.containsKey("TES"));
		
		//clear the hashmap
		HashMap<String, Employee> hashMap8 = new HashMap<>(hashMap7);
		hashMap8.clear();
		System.out.println(hashMap8.size());
		
		System.out.println("****************************************Get All value from Hashmap");
		
		//Get All Values from Hashmap
		HashMap<String, Employee> hashMap9 = new HashMap<>(hashMap7);
		Collection<Employee> values = hashMap9.values();
		values.forEach(value -> {
			System.out.println(value.getName());
		});
		
		System.out.println("****************************************Get All key-value from Hashmap");
		HashMap<String, Employee> hashMap10 = new HashMap<>(hashMap7);
		//Set<Entry<String, Employee>> entrySet = hashMap10.entrySet();
		
		System.out.println(hashMap10);
	}
}
