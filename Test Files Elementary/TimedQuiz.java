import java.util.Scanner;
class TimedQuiz {
    public static void main(String[] args) {
        // instructions for user
        System.out.println("\t\tWelcome to Timed Machine Learning Quiz");
        System.out.println("you must answer all the questions before the timer ends");

        // time variables
        Long startTime, endTime, minutes, seconds, remainedSeconds,timeRemained;

        // quiz variables
        int totalAnsweredQuestions = 0 ,
                totalcorrectAnswers = 0  ,
                totalwrongAnswers =0 ,
                questionNumber = 0;
        String[] questions = {
                "What is used for numerical predictions? \n" +
                        "A) CNN\n" +
                        "B) Linear Regression\n" +
                        "C) SVM?\n",
                "Which technique can be used to prevent overfitting in a model?\n" +
                        "A) Increasing the number of features\n" +
                        "B) Regularization\n" +
                        "C) Using more training data\n" +
                        "D) Both B and C ",
                "Which of the following is a supervised learning algorithm?\n" +
                        "A) K-Means Clustering\n" +
                        "B) Principal Component Analysis (PCA)\n" +
                        "C) Linear Regression\n",
                "What is the purpose of the activation function in a neural network?\n" +
                        "A) To initialize the weights\n" +
                        "B) To introduce non-linearity into the model\n" +
                        "C) To decrease the training time\n" +
                        "D) To normalize the input features"
        };

        String[] correctAnswers = {"B","D","C","B"};

        int totalRemainedQuestions = questions.length;

        // Scanner initialization to take answers from user
        String answer;
        Scanner input = new Scanner(System.in);

        // initializing timer
        startTime = System.currentTimeMillis();
        endTime = startTime + 180000;


        // quiz, the questionNumber variable is the loop counter
        while(totalRemainedQuestions != 0 && System.currentTimeMillis() < endTime){
            seconds = (endTime - System.currentTimeMillis())/1000;
            minutes = seconds /60;
            remainedSeconds = seconds % 60;
            System.out.println( minutes + "min" + remainedSeconds  + "sec left \n" );
            timeRemained = System.currentTimeMillis() - endTime;


            System.out.println("Question " + (questionNumber+1) + ". " +questions[questionNumber]);
            System.out.println("please enter only the letter without spaces and capital");

            answer= input.nextLine().trim();

            if(answer.equals(correctAnswers[questionNumber])) {
                totalcorrectAnswers++;
                totalAnsweredQuestions++;
                totalRemainedQuestions--;
                questionNumber++;

            }
            else{
                totalwrongAnswers++;
                totalAnsweredQuestions++;
                totalRemainedQuestions--;
                questionNumber++;
            }

            if(System.currentTimeMillis() >= endTime){
                System.out.println("time is up!");
                break;
            }


        }

        System.out.printf("The quiz is ended, The Total answered questions is %d, Total unanswered questions is %d, number of correct answers is %d , number of wrong answers is %d ", totalAnsweredQuestions , totalRemainedQuestions, totalcorrectAnswers,totalwrongAnswers);




        
    }
}