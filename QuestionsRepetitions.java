import java.util.*;

public class QuestionsRepetitions {


    public static void main(String[] args) {


        List<String> questionArray = new ArrayList<>();
        List<String> answerArray = new ArrayList<>();
        System.out.println("Exam has started...\n there are only four variants A,B,C,D\n in case of that you press other variants you will be kicked of exam");
        Scanner sc = new Scanner(System.in);
        String answerQ1 = "A";
        String answerQ2 = "B";
        String answerQ3 = "C";
        String answerQ4 = "D";
        Collections.addAll(answerArray, answerQ1, answerQ2, answerQ3, answerQ4);

        var q1 = ("What is the capital of France ?\nA)London\nB)Madrid\nC)Paris\nD)Roma");
        var q2 = ("Where is Ararat located? ?\nA)Armenia\nB)George\nC)Azerbaijan\nD)France");
        var q3 = ("Hottest Desert in the world ?\nA)Saxara\nB)Qobi\nC)Hipson\nD)Simpson");
        var q4 = ("Jesus Christ has born where \nA)Paris\nB)Baku\nC)Istanbul\nD)Bethlehem");
        var q5 = ("Choose odd number ?\nA)10\nB)8\nC)9\nD)18");
        var q6 = ("Which number is bigger ?\nA)0,5\nB)0,8\nC)0,2\nD)0,9");
        var q7 = ("calculate sin (30)  ?\nA)1/2\nB)1/3\nC)1/7\nD)1/4");
        var q8 = ("Find d(difference) of the algebraic sequence  ?\nA)1,3,4,7\nB)12,3,5,6\nC)2,5,8,11\nD)56,74,22,50");
        var q9 = ("Which one is the tallest fall?\nA)Niagara\nB)Annhel\nC)Victoria\nD)Albert");
        var q10 = ("When Ottoman empire collapsed ?\nA)1920\nB)1922\nC)1923\nD)1924");
//        var q11 = ("Who is the first president of USA ?\nA)George Washington\nB)Lincoln\nC)Obama\nD)Margaret");
//        var q12 = ("Who is the last Prophet ?\nA)Jesus\nB)Isaac\nC)Moses\nD)Muhammad");
//        var q13 = ("Who owned Soviet Union  ?\nA)Stalin\nB)Gorbachev\nC)Lenin\nD) Tomka");
//        var q14 = ("When Hitler came to power?\nA)1985\nB)1933\nC)1935\nD)1942");
//        var q15 = ("Who is Schrodinger ?\nA)Artist\nB)Programmer\nC)Engineer D)Physicist");
//        var q16 = ("2nd law of Isaac Newton ?\nA)F=I*B*L*sin(a)\nB)F=m*a\nC)S=v*t\nD)F=Q*V*B");
//        var q17 = ("Pascal law ?\nA)P=R*G*H\nB)I=U/R\nC)P=F/S\nD)I=Q/t");
//        var q18 = ("Who is the first woman ?\nA)Lilith\nB)Eve\nC)Sara\nD)Tomris");
//        var q19 = ("Which animal has only 1 Neck vertebrae ?\nA)Giraffe\nB)Frog\nC)Cat\nD)Horse");
//        var q20 = ("From where Serotonin comes?\nA)Brain\nB)Bowel\nC)Eye\nD)Liver");

        Collections.addAll(questionArray, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);
        Random random = new Random();


        int index1;
        int index2;
        int index3;
        int index4;
        int index5;
        int count = 0;
        double score = 0;
        for (int i = 0; i < questionArray.size(); i++) {


            count++;
            if (count <= 1) {
                index1 = random.nextInt(0, 2);
                index2 = random.nextInt(2, 5);
                index3 = random.nextInt(5, 7);
                index4 = random.nextInt(7, 9);
                index5 = random.nextInt(9, 10);

                System.out.println(questionArray.get(index1));
                String myVariant1 = sc.next();
                if (!answerArray.contains(myVariant1)) {

                    throw new RuntimeException("this has not variant");
                } else if (index1 == 0 && myVariant1.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);

                } else if (index1 == 0 && myVariant1 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                } else if (index1 == 1 && myVariant1.equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index1 == 1 && myVariant1 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                }

                System.out.println(questionArray.get(index2));
                String myVariant2 = sc.next();
                if (!answerArray.contains(myVariant2)) {
                    throw new RuntimeException("this has not variant");
                } else if (index2 == 2 && myVariant2.equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index2 == 2 && myVariant2 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                } else if (index2 == 3 && myVariant2.equals(answerQ4)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index2 == 3 && myVariant2 != answerQ4) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                } else if (index2 == 4 && myVariant2.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index2 == 4 && myVariant2 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                }

                System.out.println(questionArray.get(index3));
                String myVariant3 = sc.next();
                if (!answerArray.contains(myVariant3)) {
                    throw new RuntimeException("this has not variant");
                } else if (index3 == 5 && myVariant3.equals(answerQ4)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index3 == 5 && myVariant3 != answerQ4) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                } else if (index3 == 6 && myVariant3.equals(answerQ1)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);

                } else if (index3 == 6 && myVariant3 != answerQ1) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                }

                System.out.println(questionArray.get(index4));
                String myVariant4 = sc.next();
                if (!answerArray.contains(myVariant4)) {
                    throw new RuntimeException("this has not variant");
                } else if (index4 == 7 && myVariant4.equals(answerQ3)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);
                } else if (index4 == 7 && myVariant4 != answerQ3) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                } else if (index4 == 8 && myVariant4.equals(answerQ2)) {
                    score++;
                    System.out.println("correct variant" + "\n" + score);

                } else if (index4 == 8 && myVariant4 != answerQ2

                ) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!" + "\n" + score);

                }


                System.out.println(questionArray.get(index5));
                String myVariant5 = sc.next();
                if (!answerArray.contains(myVariant5)) {
                    throw new RuntimeException("this has not variant");
                } else if (index5 == 9 && myVariant5.equals(answerQ2)) {
                    score++;
                    System.out.println("correct variant");
                } else if (index5 == 9 && myVariant4 != answerQ2) {
                    score = score - 0.25;
                    System.out.println("wrong variant!!");

                }


            }
        }
        System.out.println("exam results=" + score);
    }
}







