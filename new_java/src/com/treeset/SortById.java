package com.treeset;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2)
	{
       return e1.id-e2.id;		
	}

}
