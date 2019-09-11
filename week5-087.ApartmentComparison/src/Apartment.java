
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger (Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment) {
        int priceOfApartment = this.squareMeters * this.pricePerSquareMeter;
        int priceOfOtherApartment = 
        otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        int priceDifference = 0;
        
        if (priceOfApartment > priceOfOtherApartment) {
            priceDifference = priceOfApartment - priceOfOtherApartment;
        } else {
            priceDifference = priceOfOtherApartment - priceOfApartment;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int priceOfApartment = this.squareMeters * this.pricePerSquareMeter;
        int priceOfOtherApartment = 
        otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (priceOfApartment > priceOfOtherApartment) {
            return true;
        } else {
            return false;
        }
    }
    
}
