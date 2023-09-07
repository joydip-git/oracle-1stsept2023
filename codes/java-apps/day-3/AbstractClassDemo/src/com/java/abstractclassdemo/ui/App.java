package com.java.abstractclassdemo.ui;

import java.util.Scanner;

import com.java.abstractclassdemo.entities.DataAccess;
import com.java.abstractclassdemo.entities.DbReader;
import com.java.abstractclassdemo.entities.FileReader;
import com.java.abstractclassdemo.entities.TextFileReader;
import com.java.abstractclassdemo.entities.XmlFileReader;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. fetch data from file");
		System.out.println("2. fetch data from db");
		System.out.print("\nchoose[1/2]: ");
		DataAccess dataAccessObject = null;

		switch (scanner.nextInt()) {
		case 1:

			System.out.println("\n1. fetch data from text file");
			System.out.println("2. fetch data from xml file");
			System.out.print("\nchoose[1/2]: ");

			// FileReader fileReader = null;
			switch (scanner.nextInt()) {
			case 1:
				// fileReader = new TextFileReader("");
				dataAccessObject = new TextFileReader("");
				break;

			case 2:
				// fileReader = new XmlFileReader("");
				dataAccessObject = new XmlFileReader("");
				break;

			default:
				break;
			}
			/*
			 * if (fileReader != null) fileReader.readData();
			 */

			break;

		case 2:
			dataAccessObject = new DbReader("");
			// dataAccessObject.readData();
			break;

		default:
			break;
		}

		if (dataAccessObject != null)
			System.out.println(dataAccessObject.readData());

		scanner.close();
	}

}
