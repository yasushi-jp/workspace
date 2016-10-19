import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aaa {

	public static void main(String[] args) {
//		String regex = "\\[(.+?)\\]";
//		String target = "[abeshi]and[hidebu]";

		String regex = "(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)\\ (.*) (.*) \\[(.+?)\\] \"(.*)\" (.*) (.*) \"(.*)\" \"(.*)\"";
        String target = "192.168.110.238 - - [10/Jul/2013:18:40:43 +0900] \"GET /top.html HTTP/1.1\" 404 8922 \"http://gi-no.jp\" \"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.116 Safari/537.36\"";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(target);
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
			    System.out.println("Group[" + i + "]=" + matcher.group(i));
			}
		}
	}

}
