
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int plusEuros = this.euros + added.euros;
        int plusCents = this.cents + added.cents;
        
        if (plusCents > 99) {
            plusEuros++;
            plusCents -= 100;
        }
        Money compare = new Money(plusEuros, plusCents);
        return compare;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decremented) {
        int minusEuros = this.euros - decremented.euros;        
        int minusCents = this.cents - decremented.cents;
        
        if (minusCents < 0) {
            minusEuros--;
            minusCents = minusCents + 100;
        }
        
        if (minusEuros < 0) {
            minusEuros = 0;
            minusCents = 0;
        }
        Money compare = new Money(minusEuros, minusCents);        
        
        return compare;
    }
}
