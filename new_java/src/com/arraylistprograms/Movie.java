package com.arraylistprograms;

public class Movie implements Comparable<Movie> {
	String name;
	double rating;
	int yor;//year of release

	Movie()
	{

	}
	Movie(String name,double rating,int yor)
	{
     this.name=name;
     this.rating=rating;
     this.yor=yor;
	}
	public int compareTo(Movie m)
	{
		if(this.rating>m.rating)
			return 1;
		else if(this.rating<m.rating)
			return -1;
		else 
			return 0;
	}

	public String toString() {
		return "\nMovie [name=" + name + ", rating=" + rating + ", yor=" + yor + "]";
	}

}
