package ua.kiev.model.configurations;

import java.io.File;
import java.io.IOException;

public class ModelConfiguration {
	
	public String p() {
		try {
			File currentDir = new File(".");
			return currentDir.getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
