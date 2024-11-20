package streamsinjava;

public class CreditCard {
    private String name;
    private long cardNo;
    private int Cvv;

    public CreditCard(String name,long cardNo,int cvv){
        this.name=name;
        this.cardNo=cardNo;
        this.Cvv=cvv;

    }

    public String getName() {
        return name;
    }

    public long getCardNo() {
        return cardNo;
    }

    public int getCvv() {
        return Cvv;
    }
}
