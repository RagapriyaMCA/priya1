package property;


public class FileReaderManager {
	private FileReaderManager() {
		// TODO Auto-generated constructor stub
	}
	public static FileReaderManager getinstance() {
		FileReaderManager helper=new FileReaderManager();
		return helper;
	}
	public ConfigReader getinstanceCR() throws Throwable {
		ConfigReader reader=new ConfigReader();
		return reader;

	}
}
