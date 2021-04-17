/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Example2;

/**
 *
 * @author Sushma Nalla
 */
public class NestleProduct {
    double price;
    int discount;

    public NestleProduct(double price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public double PriceAfterdisc(){
        price = price-(price*discount/100);
        return price;
    }

    @Override
    public String toString() {
        return "price= " + price + ", discount= " + discount +", "+
                "Price After discount= " + PriceAfterdisc();
    }
    
 
}
