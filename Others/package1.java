/*import Package1.*;									// ---This or --
import Package2.*;*/									//			    |					
														//				|
class package1											//				|							
{														//				|			
	public static void main(String arg[])				//				|
	{													//				|		
		Package1.pack1 p1 = new Package1.pack1();		// <-- This  ---
		Package2.pack2 p2 = new Package2.pack2();
		p1.disp();
		p2.disp();
	}
}