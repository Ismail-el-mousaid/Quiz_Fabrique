import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class QuizSimple extends Quiz{
	
	
	private static final String[] Answer = new String[] {
            "Composite",
            "Bridge",
            "Proxy",
            "Facade",
            "Adapter",
            "Observer",
            "Strategy",
            "State"
    };
	
	
	private static final QuestionChoix[] QUESTIONS = new QuestionChoix[] {
            new QuestionChoix("Meilleur joueur?", Answer[1], Answer[2], Answer[3]),
            new QuestionChoix("Meilleure equipe?", Answer[4], Answer[5], Answer[6]),
            new QuestionChoix("Meilleure artiste?", Answer[0], Answer[7], Answer[3]),         
    };
	
	public List<QuestionChoix> appliquerStrategy() {
		
			List<QuestionChoix> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}
			
	
	

}
