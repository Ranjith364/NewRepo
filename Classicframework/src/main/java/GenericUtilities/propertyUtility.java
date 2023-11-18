package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyUtility implements IAutoconstants {
	public String  readingdatafromproperty(String key) throws IOException {
		FileInputStream fls=new FileInputStream(PROPERTY_FILE_PATHS);
		Properties ppt=new Properties();
		ppt.load(fls);
		return ppt.getProperty(key);
	}
}
