public class QuestionService {

    Question[] questions = new  Question[3];

    public QuestionService(){
        questions[0] = new  Question(1,"What is the size of int","4 bytes","2 bits", "8 bytes","2 bytes","4 bytes");
        questions[1] = new  Question(1,"What is the size of double","4 bytes","2 bits", "8 bytes","2 bytes","8 bytes");;
        questions[2] = new  Question(1,"What is the size of float","4 bytes","2 bits", "8 bytes","2 bytes","4 bytes");;
    }

    public void displayAllQuestions()
    {
        for (Question q : questions) {
//            System.out.println(q.getQuestion());
            System.out.println(q);
        }
    }

}
