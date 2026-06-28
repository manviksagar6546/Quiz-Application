import java.util.Scanner;

public class QuestionService {

    Question[] questions = new  Question[3];

    String[] selections = new String[3];

    public QuestionService(){
        questions[0] = new  Question(1,"What is the size of int","4 bytes","2 bits", "8 bytes","2 bytes","4");
        questions[1] = new  Question(1,"What is the size of double","4 bytes","2 bits", "8 bytes","2 bytes","8");;
        questions[2] = new  Question(1,"What is the size of float","4 bytes","2 bits", "8 bytes","2 bytes","4");;
    }

    public void playQuiz()
    {
        int i=0;
        for (Question q : questions) {

            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option A " + q.getOptionA());
            System.out.println("Option B " + q.getOptionB());
            System.out.println("Option C " + q.getOptionC());
            System.out.println("Option D " + q.getOptionD());

            System.out.println("Choice one : ");
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
            System.out.println(" ");
        }
        for(String s : selections){
            System.out.println(s);
        }
    }

    public void Yourscore(){
        int score = 0;
        for(int i=0 ; i<questions.length ; i++){
            Question que = questions[i];
            String actual_answer = que.getAnswer();
            String user_answer = selections[i];

            if(actual_answer.equals(user_answer)){
                score++;
            }
        }
        System.out.println("Your Score is : " + score);
        System.out.println("------------------------");
    }

    public void rightAnswer(){
        System.out.println("Correct answers are right blow");
        System.out.println("Question 1 : What is the size of int - " + questions[0].getAnswer());
        System.out.println("Question 2 : What is the size of double - " + questions[1].getAnswer());
        System.out.println("Question 3 : What is the size of float - " + questions[2].getAnswer());
    }

}
