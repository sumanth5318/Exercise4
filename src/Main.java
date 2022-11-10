import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How much did u received $ :");
        Scanner scanner = new Scanner(System.in);
        int Amount = Integer.parseInt(scanner.next());
        int Amount_for_books = (Amount/4)*3;
        System.out.println("Books and supplies: "+Amount_for_books+"$");
        int balance_amount = Amount - Amount_for_books;
        int coffe_price = 2;
        int flashcomputerjournal_price = 4;
        int subwayticket_price = 3;
        int remaining_distribution = balance_amount/3;
        int no_of_coffes = remaining_distribution/coffe_price;
        int no_of_falshcomputerjournal = remaining_distribution/flashcomputerjournal_price;
        int no_of_subwaytickets = remaining_distribution/subwayticket_price;
        int remaining_Amount = remaining_distribution%coffe_price ;
        remaining_Amount += remaining_distribution%flashcomputerjournal_price;
        remaining_Amount += remaining_distribution%subwayticket_price;
        System.out.println(no_of_coffes+" coffees");
        System.out.println(no_of_falshcomputerjournal+" flashcomputers");
        System.out.println(no_of_subwaytickets+" subwaytickets");
        System.out.println("you will have "+remaining_Amount+" for white roses");
    }
}