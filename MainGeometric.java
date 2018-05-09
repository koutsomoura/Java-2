package Klironomikotita4;

import java.io.*;

public class MainGeometric {

	public static String createColor() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Color:");
		String color=br.readLine();
		return color;
	}
	public static boolean createFilled() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Filled:");
		boolean fill=Boolean.parseBoolean(br.readLine());
		return fill;
	}
	public static Rectangle creatRect() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Width:");
		int w=Integer.parseInt(br.readLine());
		System.out.print("Height:");
		int h=Integer.parseInt(br.readLine());
		Rectangle r=new Rectangle(createColor(),createFilled(),w,h);
		return r;
	}
	public static void printers(GeometricObject g) {
		System.out.println(g.toString()+" "+g.getArea()+" "+g.getPerimiter()+" "+g.getFilled());
	}
	public static void main(String []args) throws IOException {
		int n=5;
		GeometricObject[] g= new GeometricObject[n];
		int k=(int)(n*0.4);
		
		for (int i=0;i<k;i++) {
			g[i]=creatRect();
			printers(g[i]);
			
		}
	}
}
