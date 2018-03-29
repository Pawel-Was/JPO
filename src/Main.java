public class Main {

    public static void main(String[] args) {
        Walec w1 = new Walec(10, 3 , 15);
        Kula k1 = new Kula(12, 30);
        Pret p1 = new Pret(7, 10);
        w1.opis();
        k1.opis();
        p1.opis();
        Punkt tab[] = new Punkt[9];
        System.out.println("\nPETLE:\n");
        for(int i = 0; i <9 ; i = i+3)
        {
            tab[i] = new Walec((i+1)*2 ,(i+1)+5 , (i+1)*10);
            tab[i+1] = new Kula((i+1)+10 , (i+1)*2);
            tab[i+2] = new Pret((i+1)*3,(i+1)+2);
        }
        for(int i = 0; i <9 ; i++)
        {
            tab[i].opis();
            System.out.println("Moment bezwladnosci przesuniety o 4 jednostki: " + tab[i].momBezSt(4) + "\n");
        }
    }
}
