import java.util.Date;

public class BakeGoods {
    private String name;
    private double price;
    private Date expireDate;
    private int quantity;


    public BakeGoods(){}

    public BakeGoods(String name, double price, Date expireDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
       return name ;
    }


}














