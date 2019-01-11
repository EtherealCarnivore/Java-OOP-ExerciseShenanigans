package Exercises.Exercise05Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;



    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 100;
            int extra = tonerLevel - 100;
            System.out.println("You cannot fill up the toner more than 100%! " +
                    "You exceeded the amount by " + extra + " and you spilled toner everywhere, be careful!");
            System.out.println("Now the toner level is set to " + this.tonerLevel);

        }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void AddToner(int amount){
        int level = this.tonerLevel;
        if (level > 0 && level < 100){
            if (amount + this.tonerLevel > 100){
                System.out.println("You cannot fill more than 100% toner. " +
                        "Your current toner level is " + this.tonerLevel);
                System.out.println("Adjust your values and try again! Yor printer evolve, printer smash, printer kill human");

                return;
            }else{
                this.tonerLevel += amount;
                System.out.println("You added " + amount + " and now your toner level is " + this.tonerLevel);
            }
        }

    }

    public void Print(int amount){
        int pagesToPrint = amount;
        if (this.duplex){
        pagesToPrint = amount / 2;
            System.out.println("Printing double-sided");
        }
        this.pagesPrinted += pagesToPrint;
        System.out.println("Because I am a printer and have nothing better to do, I just printed " + this.pagesPrinted + " pages");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }


}
