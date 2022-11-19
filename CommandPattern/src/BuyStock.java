public class BuyStock implements Order{
    private final Stock stock;
    public BuyStock(Stock stock){
        this.stock = stock;
    }
    public void execute(){
        stock.buy();
    }
}
