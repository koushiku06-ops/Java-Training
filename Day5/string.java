
    import java.util.Scanner;
class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enetr the String:");
        String str=sc.nextLine();
        System.out.print(":length:"+str.length());
        System.out.print("UpperCase:"+str.toUpperCase());
        System.out.print("LowerCase:"+str.toLowerCase());
        if(str.length()>0)
        System.out.print("Character at given index:"+str.charAt(1));
        if(str.length()>3)
        System.out.print("Substring:"+str.substring(0,3));
    }
}

