import java.io.*;


public class MainEmployee {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		Employee[] e= new Employee[5];
		e[0]= new Employee("Mria","asda",231,2000);
		e[1]= new Employee("Anna","asd",647,2000);
		e[2]= new Employee("Pertos","das",076,2000);
		e[3]= new Employee("adc","Kosta",651,2000);
		e[4]= new Employee("Paulos","Nikou",123,2000);
		
		Menu1.menu1();
		int choose=Integer.parseInt(br.readLine());
		if (choose==1){
			System.out.println("Give lastname:");
			String ln = br.readLine();
			Ta3inomisi.SiriakiAnazitisi(e, ln);
		}
		else if (choose==2){
			Menu2.menu2();
			int choose2=Integer.parseInt(br.readLine());
			System.out.println("Code:");
			int code=Integer.parseInt(br.readLine());
			Ta3inomisi.DiadikiAnazitisi(e, code, choose2);

		}
	
	}

}
