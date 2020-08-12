package map_spring;

import java.util.Map;
import java.util.Set;

public class QuestionClass {
	Map<String, String> map;
	String question;
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	void displayData(){
		Set<Entry<String, String>> set = map.entrySet<String, String>();
		
		Iterator<Entry<String, String>> iterator = set.iterator();
		
		while(iterator.hasNext()){
			Entry<String, String> entry = iterator.next();
			
			System.out.println("Key: "+entry.getKey()+ "\t Value:"+ entry.getValue());
		}
	}
}
