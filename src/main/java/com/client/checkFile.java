package com.client;

import java.io.File;

public class checkFile{
	static public boolean isPresent(String path) {
		File file = new File(path);
		
		return file.exists();
	}
}
