//import C:/Users/shahpoor.jabarkhiel/Desktop/responses/code/jsoup-1.7.2.jar;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class helloWorld {
	public static void main(String [] args) {
		System.out.println("Hello World");
		
		try {
			Document doc = Jsoup.connect("http://google.com").get();
			System.out.println(doc);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}