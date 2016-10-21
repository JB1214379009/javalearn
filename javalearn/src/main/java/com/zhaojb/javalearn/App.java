package com.zhaojb.javalearn;

import java.nio.file.Paths;
import java.util.Scanner;

import com.zhaojb.learn.inherit.Size;

import javafx.geometry.Side;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter");
	        String input = in.next().toUpperCase();
	        Size size = Enum.valueOf(Size.class, input);
	        System.out.println("size=" + size);
	        System.out.println("abbreviation=" + size.getAbbreviation());
    }
}
