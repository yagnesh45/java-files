import java.util.Random;
interface SharedConstants{
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class Question implements SharedConstants{
	Random r=new Random();
	int ask(){
		int problem=(int) (100 * r.nextDouble());
		if(problem < 30) 
			return NO;
		else if(problem < 60) 
			return YES;
		else if(problem < 75) 
			return LATER;
		else if(problem < 98) 
			return SOON;
		else
			return NEVER;
	}
}

class AskMe implements SharedConstants{
	static void answer(int result){
		switch(result){
			case NO: System.out.println("No"); break;
			case YES: System.out.println("Yes"); break;
			case MAYBE: System.out.println("Maybe"); break;
			case LATER: System.out.println("Later"); break;
			case SOON: System.out.println("Soon"); break;
			case NEVER: System.out.println("Never"); break;
		}
	}
	public static void main(String []ar){
		Question q=new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}