package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz{

    Parametry par = new Parametry();


    public void startQuiz(Pytania[] pytania) throws InterruptedException
    {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Czy losować pytania? (T/N)\n");
            String los = scanner.nextLine();
            if(los.equalsIgnoreCase("T")) {
                par.setCzyLosowac(true);
                System.out.println("Losowanie pytan wlaczone!\n");
            }
            System.out.println("Czy zmienić kolor? (T/N)\n");
            String kolor = scanner.nextLine();
            if(kolor.equalsIgnoreCase("T")) {
                par.setCzyKolor(true);
                System.out.println("Zmieniono kolor tla!\n");
            }
            System.out.println("Czy wlaczyc timer? (T/N)\n");
            String timer = scanner.nextLine();
            if(timer.equalsIgnoreCase("T")) {
                par.setCzyTimer(true);
                System.out.println("Wlaczono timer!\n");
            }
            if(par.getCzyTimer()==true) {
                String odpowiedz = null;
                if(par.getCzyLosowac()==true) {
                    List<Integer> lista = new ArrayList<Integer>();
                    for(int n=0; n<pytania.length; n++)
                        lista.add(n);
                    for(int i=0; i<pytania.length; i++)
                    {
                        int k=randomElement(lista);

                        System.out.println("\n"+pytania[k].getPytanie());
                        for(int j=0; j<4;j++)
                            System.out.println(pytania[k].getOpcje(j));
                        System.out.println("Czas:");
                        for(int z=10; z>=0; z--)
                        {
                            System.out.print(z+"..");
                            Thread.sleep(1000);
                        }
                        odpowiedz= scanner.nextLine();
                        if(odpowiedz.equalsIgnoreCase(pytania[k].getOdpowiedzi()))
                            par.addPunkty();
                        lista.removeIf( name -> name.equals(k));
                    }

                }else {

                    for(int i=0; i<pytania.length; i++)
                    {
                        System.out.println("\n"+pytania[i].getPytanie());
                        for(int j=0; j<4;j++)
                            System.out.println(pytania[i].getOpcje(j));
                        for(int z=10; z>=0; z--)
                        {
                            System.out.print(z+"..");
                            Thread.sleep(1000);
                        }
                        String odpowiedz2= scanner.nextLine();
                        if(odpowiedz2.equalsIgnoreCase(pytania[i].getOdpowiedzi()))
                            par.addPunkty();
                    }

                }
                System.out.println("\nTwoje punkty: "+par.getPunkty()+"/"+pytania.length);
            }
            else {
                if(par.getCzyLosowac()==true) {
                    List<Integer> lista = new ArrayList<Integer>();
                    for(int n=0; n<pytania.length; n++)
                        lista.add(n);
                    for(int i=0; i<pytania.length; i++)
                    {
                        int k=randomElement(lista);

                        System.out.println("\n"+pytania[k].getPytanie());
                        for(int j=0; j<4;j++)
                            System.out.println(pytania[k].getOpcje(j));
                        String odpowiedz= scanner.nextLine();
                        if(odpowiedz.equalsIgnoreCase(pytania[k].getOdpowiedzi()))
                            par.addPunkty();
                        lista.removeIf( name -> name.equals(k));
                    }

                }else {

                    for(int i=0; i<pytania.length; i++)
                    {
                        System.out.println("\n"+pytania[i].getPytanie());
                        for(int j=0; j<4;j++)
                            System.out.println(pytania[i].getOpcje(j));
                        String odpowiedz= scanner.nextLine();
                        if(odpowiedz.equalsIgnoreCase(pytania[i].getOdpowiedzi()))
                            par.addPunkty();
                    }

                }
                System.out.println("\nTwoje punkty: "+par.getPunkty()+"/"+pytania.length);
            }
        }
    }



    public static int randomElement(List<Integer> lista) {
        Random rand = new Random();
        int randomElement = lista.get(rand.nextInt(lista.size()));
        return randomElement;
    }



    public Quiz() {}
}
