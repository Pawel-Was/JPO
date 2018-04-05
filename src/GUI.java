import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class GUI   {
    //CONSTRUCTORS
    public GUI()
    {
        this.input = new BufferedReader(new InputStreamReader(System.in));
    }
    //VARIABLES
    private int selection;
    private BufferedReader input;

    //METHODS
    public void mainMenu() {
        System.out.println("Witaj w programie do liczenia bryl");
        System.out.println("Wybierz typ bryly: ");
        System.out.println(" 1 - Walec \n 2 - Kula \n 3 - Pret \n 0 - Wyjscie");
        selection = inputChar();
        switch(selection)
        {
            case 1:
                System.out.println("Podaj mase: ");
                int tmp1 = inputValue();
                System.out.println("Podaj promien: ");
                int tmp2 = inputValue();
                System.out.println("Podaj wysokosc: ");
                int tmp3 = inputValue();
                System.out.println("Podaj przesuniecie nowej osi: ");
                int tmp4 = inputValue();
                Walec walec = new Walec(tmp2,tmp3,tmp1);
                walec.opis();
                System.out.println("moment przesuniety o " + tmp4 +" jednostek: " + walec.momBezSt(tmp4));
                System.out.println();
                break;
            case 2:
                System.out.println("Podaj mase: ");
                tmp1 = inputValue();
                System.out.println("Podaj promien: ");
                tmp2 = inputValue();
                System.out.println("Podaj przesuniecie nowej osi: ");
                tmp3 = inputValue();
                Kula kula = new Kula(tmp1,tmp2);
                kula.opis();
                System.out.println("moment przesuniety o " + tmp3 +" jednostek: " + kula.momBezSt(tmp3));
                System.out.println();
                break;
            case 3:
                System.out.println("Podaj mase: ");
                tmp1 = inputValue();
                System.out.println("Podaj dlugosc ");
                tmp2 = inputValue();
                System.out.println("Podaj przesuniecie nowej osi: ");
                tmp3 = inputValue();
                Pret pret = new Pret(tmp1,tmp2);
                pret.opis();
                System.out.println("moment przesuniety o " + tmp3 +" jednostek: " + pret.momBezSt(tmp3));
                System.out.println();
                break;
            case 0 :
                System.exit(0);
                break;

        }
    }

    private int inputChar()
    {
        int tmp;
        while(true) {
            try {
                tmp = input.read();
                if ((tmp-48 >= 0) && (tmp-48 <= 3)) {
                    return tmp - 48;

                } else {
                    System.out.println("podaj poprawna wartosc: ");
                    continue;

                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("\nEXITING");
                continue;

            }
        }
    }
    private int inputValue()
    {
        int tmpI;
        String tmpS;

        while(true)
        {
            try
            {
                tmpS = input.readLine();
                tmpI = Integer.parseInt(tmpS);
                return tmpI;

            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
                System.out.println("EXITING");
                continue;

            }
            catch (NumberFormatException e)
            {
                System.out.println("Zly format danych");
                System.out.println(e.getLocalizedMessage());
                System.out.println("podaj poprawna wartosc: ");
                continue;

            }

        }

    }

    //ACCESSORS

}
