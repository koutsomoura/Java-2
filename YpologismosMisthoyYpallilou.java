package excerise;

import java.io.*;

public class YpologismosMisthoyYpallilou {
		public static String  FillName() throws IOException {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Onoma:");
			String name=br.readLine();
			return name;
		}
		public static int  FillPType() throws IOException,PayTypeException {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			while(true){
				try {
					System.out.print("Typos\n0-Misthotos\n1-Oromisthios\n");
					int type=Integer.parseInt(br.readLine());
					if (type<0||type>1) {
						throw new PayTypeException("Lathos eisagogi");
					}
					return type;
				}catch(PayTypeException el) {
					System.out.println(el.getMessage());
					System.out.println("Press again:");
				}

			}
		}
		
		public static double  InputDouble(String message) throws IOException{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				try {
					System.out.println(message);
					double d_a=Double.parseDouble(br.readLine());
					return d_a;
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage()+" wrong input, please try again:");
				}
			}
		
		}
		public static Misthotos createMisthotos() throws IOException, PayTypeException, PayTypeExceptionOromisthios {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("--------------");
				System.out.println("Misthotos");
				System.out.println("Dikaioute bonus;");
				boolean bonus=Boolean.parseBoolean(br.readLine());
				try {				
					Misthotos m=new Misthotos(bonus,FillName(),FillPType(),InputDouble("Akatharistos:"),InputDouble("Kratiseis:"),InputDouble("Bonus:"));
					return m;
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage()+" wrong input, please try again:");
				}catch(PayTypeExceptionMisthotos e4) {
					System.out.println("Somthring going wrong: "+e4.getLocalizedMessage());

				}
			}
		}
		public static Oromisthios createOromisthios() throws IOException, PayTypeException, PayTypeExceptionOromisthios {
			
		
			System.out.println("--------------");
			System.out.println("Oromisthios");
			Oromisthios o=new Oromisthios(InputDouble("Hours:"),InputDouble("Price per time:"),FillName(),FillPType());
			return o;
		}
		
		public static void pritners(Employee w){
			System.out.print(w.toString());
		}

		public static void main(String []args) throws IOException, PayTypeException, PayTypeExceptionOromisthios  {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Size of array:");
			int n=Integer.parseInt(br.readLine());
			Employee[] e=new Employee[n];
			int k1=(int)(n*0.4);
			int k2=(int)(n*0.3);

			for(int i=0;i<k1;i++) {
				e[i]=createMisthotos();
				
			}
			for(int i=k1;i<(k1+k2);i++) {
				e[i]=createOromisthios();
				
			}

			
			for (int i=0;i<n;i++) {
				
				if(e[i] instanceof iMisthotos) {
					pritners(e[i]);
					((Misthotos)e[i]).Katharos_Misthtou();
					
				}else if(e[i] instanceof iOromisthios) {
					pritners(e[i]);
					((Oromisthios)e[i]).Katharos_Oromisthiou();
				}
			}
		}
	}

