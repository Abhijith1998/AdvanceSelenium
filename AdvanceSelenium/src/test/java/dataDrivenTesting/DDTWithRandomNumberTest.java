package dataDrivenTesting;

import org.testng.annotations.Test;

public class DDTWithRandomNumberTest {
	@Test
	public void test() {
		//unique characters length
		int n=20;
		//range of unique characters
		String alphaNumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789abcdefghijklmnopqrstuvwxyz";
		
		StringBuilder sb=new StringBuilder(n);
		
		for(int i=0;i<n;i++) {
			int index = (int) (alphaNumeric.length()*Math.random());
			sb.append(alphaNumeric.charAt(index));
		}
		System.out.println(sb);
	}
}
