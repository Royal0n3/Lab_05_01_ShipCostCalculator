public class ShipCostCalculator {

    public static void main(String[] args) {
        double PurchaseItem = 99;
        double ShippingCost;
        double TotalPrice;
        if (PurchaseItem<100)
            ShippingCost = PurchaseItem * .02;
            else ShippingCost = 0;
            TotalPrice = PurchaseItem + ShippingCost;
            System.out.println("Your Total Price is "+TotalPrice);

        }
    }

