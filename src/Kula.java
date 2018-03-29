public class Kula extends Punkt {
    //VARIABLES
    private int radius;
    //CONSTRUCTORS
    public Kula()
    {
        super();
        this.setRadius(1);

    }
    public Kula(int r, int m)
    {
        super(m);
        this.setRadius(r);

    }
    //METHODS


    @Override
    public double momBez() {
        return  0.4*this.getMasa()*this.getRadius()*this.getRadius();
    }

    @Override
    public void opis() {
        System.out.println("Kula");
        System.out.println("masa: " + this.getMasa());
        System.out.println("promien: " + this.getRadius());
        System.out.println("moment bezwladnosci: " + this.momBez());
    }

    //ACCESSORS
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int r)
    {
        if(r>0)
        {
            this.radius = r;
            return;

        }else
        {
            System.out.println("Podana bledny promien, ustawiono domyslna wartosc 1 ");
            this.radius = 1;

        }
    }

}
