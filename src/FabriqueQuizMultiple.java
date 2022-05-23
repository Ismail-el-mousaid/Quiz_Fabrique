
public class FabriqueQuizMultiple extends FabriqueQuiz{
	
	public static FabriqueQuizMultiple instance=new FabriqueQuizMultiple();

	@Override
	protected Quiz creerQuiz() {
		// TODO Auto-generated method stub
		return new QuizMultiple();
	}
	
	public static FabriqueQuizMultiple getInstance() {
		return instance;
	}

}
