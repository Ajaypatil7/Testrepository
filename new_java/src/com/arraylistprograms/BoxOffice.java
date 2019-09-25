package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BoxOffice {

	
	public static void main(String[] args) {
		Movie m1= new Movie("DDLJ ",4.5,1995);
		Movie m2 = new Movie("Aarya ",4.6,2014);
		Movie m3 =new Movie("Raanjhanaa ", 4.8,2017);
		Movie m4= new Movie("Bareili ki Barfi ",4.3,2015);
		
		ArrayList<Movie> movie= new ArrayList<>();
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);
		System.out.println("Before sorting the Movies");
		System.out.println(movie);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("\nPress "
				+ "\n :1 to sort the Movies by Name "
				+ "\n :2 to sort the Movies by Ratings "
				+ "\n :3 to sort the Movies by Year Of Release ");
		
		int choice=sc.nextInt();
		System.out.println("");
		
		
		switch(choice)
		{
		
		case 1: 	//Sorting by Name
			System.out.println("----------------Sorting the Movis by Names---------------- ");
			    Collections.sort(movie,new SortByName());
			    System.out.println("After sorting based on Year Of Name ");
			    System.out.println(movie);
			    break;
			
		case 2: //sorting by ratings
			System.out.println("-------------------Sorting the Movies by Ratings------------");
			    Collections.sort(movie);
		        System.out.println("After sorting the movies based on Ratings");
		        System.out.println(movie);
		        break;
		
		case 3: //sorting by YOR
			System.out.println("-----------------Sorting the Movies by year of Release-----------");
			    Collections.sort(movie,new SortByYOR());
			    System.out.println("After sorting the by based on Year Of Realease ");
			    
			    System.out.println(movie);
			    break;
			    
			    default: System.out.println("Enter valid Input");
			    	break;
			   /* for(Movie m:movie)
				{
					System.out.println("name "+m.name);
					System.out.println("year of release "+m.yor);
					System.out.println("rating "+m.rating);
					System.out.println("________________");
				}*/	
			
		}
		
        /*for(Movie m:movie)
		{
			System.out.println("name "+m.name);
			System.out.println("year of release "+m.yor);
			System.out.println("rating "+m.rating);
			System.out.println("________________");
		}
		System.out.println("!!!!!!!!!!!!!!!!!");*/

		
		/*for(Movie m:movie)
		{
			System.out.println("name "+m.name);
			System.out.println("year of release "+m.yor);
			System.out.println("rating "+m.rating);
			System.out.println("*******************");
		}
		*/
		
	}
}
