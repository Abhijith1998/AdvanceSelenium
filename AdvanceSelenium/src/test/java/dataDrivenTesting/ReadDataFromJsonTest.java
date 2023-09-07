package dataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromJsonTest {
	@Test
	public void test() throws IOException, ParseException {
		FileReader fr=new FileReader("./testData/commondata.json");
		JSONParser parser=new JSONParser();
		JSONObject jObj = (JSONObject) parser.parse(fr);
		
		System.out.println(jObj.get("browser"));
		System.out.println(jObj.get("url"));
		System.out.println(jObj.get("username"));
		System.out.println(jObj.get("password"));
	}
}
