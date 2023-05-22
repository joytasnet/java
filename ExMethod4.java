import java.util.*;
public class ExMethod4{
	public static void main(String[] args){
		System.out.print("税抜価格>>");
		int price = new Scanner(System.in).nextInt();
		System.out.print("税率>>");
		int tax = new Scanner(System.in).nextInt();
		int taxPrice=calcPrice(price,tax);
		System.out.printf("税込み価格は%d円です%n",taxPrice);

	}
	public static int calcPrice(int price,int taxRatio){
		price = (int)(price * (1+taxRatio/100.0));
		return price;
	}
}
