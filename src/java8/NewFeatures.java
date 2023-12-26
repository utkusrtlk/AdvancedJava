package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class NewFeatures {

	public static void main(String[] args) {
		//Lambda Expressions
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    //numbers.forEach( (n) -> { System.out.println(n); } );
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
		
		List<User> users = new ArrayList<>();		
		users.add(new User(1,"Aleyna"));
		users.add(new User(2,"Ahmet"));
		users.add(new User(3,"Zehra"));
		users.add(new User(4,"Murat"));
		users.add(new User(5,"Y�ld�z"));
		users.add(new User(6,"Levent"));
		users.add(new User(7,"Elvan"));
		
		users.stream().forEach(user->
		{
			System.out.println("Java8");
			System.out.println(user.toString());
		});
		
		users.stream().forEach(user -> user.talk()); //lambda function
		users.stream().forEach(User::talk);//method 

		long count =users.stream().filter(user -> user.id>5).count();
		System.out.println("Count :"+count);
		
		List<User> filteredList = users.stream().filter(user -> user.id>5)
				.collect(Collectors.toList());   //collectors
		System.out.println("Filtered idd > 5");
		filteredList.stream().forEach(User::talk);
		
		List<User> mappedList = users.stream()
				.map(user -> new User(user.id+100,user.name))
			    .collect(Collectors.toList());
		mappedList.stream().forEach(user -> System.out.println(user.toString()));
	
		
		Map<Integer, String> userMap = users.stream().collect(Collectors
				.toMap(user -> user.id, user -> user.name));
		
		userMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}

class User{
	
	int id;
	String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void talk() {		
		System.out.println("Hi, I am " + this.name);
	}
}
