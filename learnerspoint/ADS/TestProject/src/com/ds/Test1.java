package com.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public  class Test1 {
public static void main(String[] args) {
	List<String> strings= new ArrayList<String>();
	strings.add("Hebbal");
	strings.add("Ramamurthynagar");
	strings.add("Hoskote");
	strings.add("Banashankari");
	
	List<String> filteredstreams = strings.stream().filter(e -> (e.startsWith("H"))).collect(Collectors.toList());
	
	System.out.println(filteredstreams);
}
}
