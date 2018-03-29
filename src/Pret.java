public class Pret extends Punkt {
    //VARIABLES
    private int length;
    //CONSTRUCTORS
    public Pret()
    {
        super();
        this.setLength(1);
    }
    public Pret(int m,int l)
    {
        super(m);
        this.setLength(l);
    }
    //METHODS
    @Override
    public double momBez() {
        return (this.getMasa()*this.getLength()*this.getLength())/12;
    }
    @Override
    public void opis() {
        System.out.println("Pret");
        System.out.println("masa: " + this.getMasa());
        System.out.println("dlugosc: " + this.getLength());
        System.out.println("moment bezwladnosci: " + this.momBez());
    }
    //ACCESSORS
    public int getLength()
    {
        return this.length;
    }
    public void setLength(int l)
    {
        if(l>0)
        {
            this.length=l;
            return;

        }else
        {
            System.out.println("Podana bledna dlugosc, ustawiono domyslna wartosc 1 ");
            this.length=1;

        }
    }

}
