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
		
		String s;
		System.out.println("enter the name:");
		s=sc.next();
		
		NodeList nl=doc.getElementsByTagName("std");
		for(int i=0;i<nl.getLength();i++){
			Node n1=nl.item(i);
			
			NodeList nc=n1.getChildNodes();
			for(int j=0;j<nc.getLength();j++){
				Node n2=nc.item(j);
				if(n2.getNodeType()==Node.ELEMENT_NODE){
					if(n2.getNodeName()=="name"){
						if(s.equals(n2.getTextContent())){
							System.out.println(n2.getNodeName()+"\t"+n2.getTextContent());
							Node n3=n2.getNextSibling();
							if(n3.getNodeType()==Node.ELEMENT_NODE)
							System.out.println(n3.getNodeName()+"\t"+n3.getTextContent());
							Node n4=n3.getNextSibling();
							if(n4.getNodeType()==Node.ELEMENT_NODE)
							System.out.println(n4.getNodeName()+"\t"+n4.getTextContent());
						}
					}
				}
			}
		}
	}
}