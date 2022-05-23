
public class FabriqueQuizSimple extends FabriqueQuiz {
	
	public static FabriqueQuizSimple instance=new FabriqueQuizSimple();

	@Override
	protected Quiz creerQuiz() {
		// TODO Auto-generated method stub
		return new QuizSimple();
	}
	
	public static FabriqueQuizSimple getInstance() {
		return instance;
	}

}
