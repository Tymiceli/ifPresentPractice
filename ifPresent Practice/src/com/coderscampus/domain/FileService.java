package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public List<SuspectLocation> getSuspectLocation(String fileName) throws IOException {

		List<SuspectLocation> list = new ArrayList<SuspectLocation>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

			int i = 0;
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] lineData = line.split(",");
				SuspectLocation suspectLocation = new SuspectLocation(lineData[0], lineData[1]);
				list.add(suspectLocation);
				System.out.println(suspectLocation);
				i++;
			}
			
			return list;

		}

	}
}
