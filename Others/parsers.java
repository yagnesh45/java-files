import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.*;

class document{
	public static void main(String ar[]) throws Exception{
		
		File f=new File("student.xml");
		
		Scanner sc=new Scanner(System.in);
		DocumentBuilderFactory fac=DocumentBuilderFactory.newInstance();
		DocumentBuilder bui=fac.newDocumentBuilder();
		Document doc=bui.parse(f);
		
		NodeList nl=doc.getElementsByTagName("std");
		for(int i=0;i<nl.getLength();i++){
			Node n1=nl.item(i);
			
			NodeList nc=n1.getChildNodes();
			for(int j=0;j<nc.getLength();j++){
				Node n2=nc.item(j);
				if(n2.getNodeType()==Node.ELEMENT_NODE){
					System.out.println(n2.getNodeName()+"\t"+n2.getTextContent());
				}
			}
		}
	}
}