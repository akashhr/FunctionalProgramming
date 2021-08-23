package com.bridgelabz.functionalprogramming;
import java.util.*;
import java.io.*;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter printWriterObject = new PrintWriter(System.out, true);
		int numberOfRows, numberOfColumns;

		System.out.println("Enter the number of Rows: ");
		numberOfRows = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		numberOfColumns = sc.nextInt();

		int[][] twoDArray = new int[numberOfRows][numberOfColumns];

		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
				System.out.println("Enter the array elements: ");
				twoDArray[rowIndex][columnIndex] = sc.nextInt();

			}
		}
		sc.close();

		System.out.println("The array elements are: ");
		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
				printWriterObject.print(twoDArray[rowIndex][columnIndex] + "\t");
			}
			printWriterObject.println();
		}
		

	}

}
