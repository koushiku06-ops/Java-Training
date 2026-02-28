import java.util.*;
public class stringbuilder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input="Samar";
		StringBuilder sb=new StringBuilder(input);
		System.out.println(sb.append("hello"));
		System.out.println(sb.insert(2,"ha"));
		System.out.println(sb.replace(1,4,"yyy"));
		System.out.println(sb.delete(0,7));
		System.out.println(sb.delete(1,2));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.charAt(1));
		sb.setCharAt(1,'W');
		System.out.print(sb);
	}
}