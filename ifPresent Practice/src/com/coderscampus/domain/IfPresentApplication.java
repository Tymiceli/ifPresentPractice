package com.coderscampus.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class IfPresentApplication {
	public static final String WEEK_1 = "InterpolWatchReport-Week1.csv";
	public static final String WEEK_2 = "InterpolWatchReport-Week2.csv";
	// do for week 3

	public static void main(String[] args) throws FileNotFoundException, IOException {
		IfPresentApplication ifPresentApplication = new IfPresentApplication();
		ifPresentApplication.work();
		
	}
	private void work() throws FileNotFoundException, IOException {
		FileService fs = new FileService();
		List<SuspectLocation> week1 = fs.getSuspectLocation(WEEK_1);
//		System.out.println(week1);
		List<SuspectLocation> week2 = fs.getSuspectLocation(WEEK_2);
		
		week2.stream()
			 .
		
	}

}
