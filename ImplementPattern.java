package javasample6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ImplementPattern implements InterfacePattern {
	public void useCase1(String Firstpattern) {
		String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-zA-Z0-9.-]+\\.[a-zA-Z]$";
		Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(Firstpattern);
        boolean result = match.matches();
        System.out.println(result);
	}
	
	public void useCase2(String Secondpattern) {
		String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-zA-Z0-9.-]+\\.[a-zA-Z]$";
		Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(Secondpattern);
        boolean result = match.matches();
        System.out.println(result);
	}
	public void useCase3(String Thirdpattern) {
		String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-z]{2}+\\.[a-zA-Z]{2}$";
		Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(Thirdpattern);
        boolean result = match.matches();
        System.out.println(result);
	}
	public void useCase4(String Fourthpattern) {
		String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-z]{2}+\\.[a-zA-Z]{2}$";
		Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(Fourthpattern);
        boolean result = match.matches();
        System.out.println(result);
	}

}
