public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(100);
        p1.opis();
        System.out.println("Masa: " + p1.getMasa());
        System.out.println("Moment Glowny: " + p1.momBez());
        System.out.println("Moment z tw.Steinera(przesuniecie o 4 jednostki): " + p1.momBezSt(4) + "\n");
        p2.opis();
        System.out.println("Masa: " + p2.getMasa());
        System.out.println("Moment Glowny: " + p2.momBez());
        System.out.println("Moment z tw.Steinera(przesuniecie o 4 jednostki): " + p2.momBezSt(4) + "\n");
        p1.setMasa(20);
        p1.opis();
        System.out.println("Masa: " + p1.getMasa());
        System.out.println("Moment Glowny: " + p1.momBez());
        System.out.println("Moment z tw.Steinera(przesuniecie o 4 jednostki): " + p1.momBezSt(4) + "\n");
        Punkt tab[] = new Punkt[4];
        System.out.printf("PETLE: \n\n");
        for(int i =0; i < 4;i++)
        {
            tab[i] = new Punkt((i+1)*10);
            System.out.println("Masa: " + tab[i].getMasa());
            System.out.println("Moment Glowny: " + tab[i].momBez());
            System.out.println("Moment z tw.Steinera(przesuniecie o 6 jednostek): " + tab[i].momBezSt(6) + "\n");
        }
    }
}
