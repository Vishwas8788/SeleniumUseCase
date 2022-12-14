package seleniumUseCase.DataDrivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readPropertiesFile {
	public static String readData(String propertyName) throws Exception {
		String Output = "";
		try {
			InputStream input;
			input = new FileInputStream("DataFolders/Data.properties");
			Properties prop = new Properties();
			try {
				prop.load(input);
				Output = prop.getProperty(propertyName);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Output;
	}
}
