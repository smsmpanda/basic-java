package com.rhtect.demo;

import com.rhtect.modifier.Parent;

public class Test {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.GetParentAge();

        SubChildren sub = new SubChildren();
        sub.GetParentAge();

        String a = "abc";
        String b = "ab";
        String c = b+"c";
        System.out.println(a == c);
        System.out.println(a.equals(c));

        Movie [] movies = new Movie[]{
                new Movie(1,"A",34,90.1,"Zhang Sun 1","Liu YiFei a","好看的电影"),
                new Movie(2,"B",33,91.1,"Zhang Sun 2","Liu YiFei b","好看的电影"),
                new Movie(4,"C",31,93.1,"Zhang Sun 3","Liu YiFei v","好看的电影"),
                new Movie(5,"D",33,95.1,"Zhang Sun 4","Liu YiFei c","好看的电影"),
                new Movie(6,"E",31,96.1,"Zhang Sun 5","Liu YiFei d","好看的电影")
        };

        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.ShowAllMovies();
    }
}
