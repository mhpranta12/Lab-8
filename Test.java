
public class Test {

	public static void main(String[] args) {
		Book x =new Book();
		x.printname();
		x.issuebook(10);
		
		Coursebook y=new Coursebook();
		y.printname();
		y.issuebook(15212);
		y.returnbook(2000);
		System.out.println("                                           ");
		y.returnbookid(200, 3251212);
	}

}
