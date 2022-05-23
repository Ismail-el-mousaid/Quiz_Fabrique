import java.util.List;
import java.util.Scanner;


// main Fabrique
public class main {
	
	public static void main(String[] args) {
		
		FabriqueQuiz x = FabriqueQuizSimple.getInstance();
		Quiz QuizSimple = x.creerQuiz();
		
		List<QuestionChoix> questions = QuizSimple.appliquerStrategy();
        int counter = 0;

        for (int i = 0; i < questions.size(); i++) {
            QuestionChoix questionAnswer = questions.get(i);
            System.out.println((i + 1) + ". " + questionAnswer.getQuestion());
            System.out.println( ". " + questionAnswer.geta());
            System.out.println( ". " + questionAnswer.getb());
            System.out.println( ". " + questionAnswer.getc());

            Scanner scanner = new Scanner(System.in);
            String actualAnswer = scanner.nextLine();
            
            String patternName = actualAnswer.split(" ")[0];
            
            Scanner scanner1 = new Scanner(System.in);
            String actualAnswer1 = scanner1.nextLine();
            
            String patternName1 = actualAnswer1.split(" ")[0];
            if (patternName.toLowerCase().equals(questionAnswer.geta().toLowerCase()) & patternName1.toLowerCase().equals(questionAnswer.getb().toLowerCase())) {
                System.out.println("- Correct -\n");
                counter++;
           } else {
                System.out.println("- Wrong: " + questionAnswer.geta() + " -\n");
            }
        }
        System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
	}

}
