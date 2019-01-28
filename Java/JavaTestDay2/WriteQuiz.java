import java.util.HashMap;

interface Quiz
{
	
	// addQuestion adds the question given in the parameter and adds it to the questions array
	void addQuestion(Question q);

	// The quiz begins with the registration of the participant
	// Participant name, age in years, phone number and friend's phone number are the parameters
	// an instance of the participant should be created and returned
	Participant registerParticipant(String name, int age, String phone);

	// getCurrentLevel returns the current level the participant is playing
	// It should return a value between 1 - 15 inclusive
	int getCurrentLevel();

	// getNextQuestion returns the next question for the participant to answer
	// The question object has the question text along with options A B C and D
	Question getNextQuestion();

	// lockAnswer accepts the question object and the participants answer
	// Checks if the answer is correct and returns true.
	// If the answer is incorrect it returns false.
	// It also updates the participant's
	boolean lockAnswer(Question q, String answer);

	// getPrizeMoney returns the current prize money the participant is awarded
	// For example, if he/she answered level 6 then Rs. 20,000 is the prize money.
	int getPrizeMoney();

}
class Question{
	String question;
	int level;
	String correctAnswer;
	public Question(String question, int level, String correctAnswer) {
		this.question = question;
		this.level = level;
		this.correctAnswer = correctAnswer;
	}
	public String getQuestion() {
		return question;
	}
	public int getLevel() {
		return level;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	
}
class Participant{
	String name;
	int age;
	String phone;
	byte currLevel;
	float prizeMoney;
	public Participant(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
}
public class WriteQuiz implements Quiz{
	Question questions[];
	Participant participants;
	int count;
	int level;
	float score;
	static HashMap<Integer, Integer> scores; //to hold levels and prize money
	WriteQuiz(){
		scores=new HashMap<>();
		questions=new Question[15];
		count=-1;
	}
	public static void main(String[] args) {
		Quiz quiz = new WriteQuiz();

		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 1, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 2, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 3, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 4, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 5, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 6, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 7, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 8, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 9, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 10, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 11, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 12, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 13, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 14, "B"));
		quiz.addQuestion(new Question("Entomology is the science that studies*A.Behavior of human beings*B.Insects*c.The origin and history of technical and scientific terms*D.The formation of rocks", 15, "B"));
		
		
		//System.out.println("Enter name of participent :");


	}
	@Override
	public void addQuestion(Question q) {
		questions[++count]=q;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Participant registerParticipant(String name, int age, String phone) {
		// TODO Auto-generated method stub
		// Participant name, age in years, phone number and friend's phone number are the parameters
				// an instance of the participant should be created and returned
		return null;
	}
	@Override
	public int getCurrentLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Question getNextQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean lockAnswer(Question q, String answer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getPrizeMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

}
