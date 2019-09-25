package com.arraylistprograms;

import java.util.Comparator;

public class SortByYOR implements Comparator<Movie> {

	

	public int compare(Movie m1,Movie m2)
	{
		if (m1.yor>m2.yor)
			return 1;
		else if(m1.yor<m2.yor)
			return -1;
		else 
			return 0;
			
	}
}
