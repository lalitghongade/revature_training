package regex;
import java.util.*;

public class domainExtract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Url : ");
		String str = sc.nextLine();
		domainExtracter(str);
	}
	
	public static void domainExtracter(String str) {
		String str2[] = str.split("/");
		System.out.println("Domain Name : " +str2[2]);
	}

}
