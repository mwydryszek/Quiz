package quiz;



public class Main {

    public static void main(String[] args) throws InterruptedException{

        String[] tresc_pytania = {
                "Jaka firma stworzyla Jave?",
                "W którym roku Java zostala stworzona?",
                "Jaka nazwe poczatkowo nosila Java?",
                "Kto jest twórca Javy?"
        };
        String[][] opcje = 	{
                {"A) Sun Microsystems","B) Visuality","C) Microsoft","D) Hitachi"},
                {"A) 1980","B) 1996","C) 1979","D) 2001"},
                {"A) NewC","B) Pure","C) Oak","D) Elemental"},
                {"A) Ken Thompson","B) Bill Gates","C) James Gosling","D) Donald Knuth"}
        };
        String[] odpowiedzi = {
                "A",
                "B",
                "C",
                "C"
        };


        Pytania [] pytania = new Pytania[tresc_pytania.length];

        for(int i=0; i<tresc_pytania.length; i++) {
            pytania[i]= new Pytania(tresc_pytania[i],opcje[i],odpowiedzi[i]);
        }

        Quiz quiz = new Quiz();

        quiz.startQuiz(pytania);

    }





}
