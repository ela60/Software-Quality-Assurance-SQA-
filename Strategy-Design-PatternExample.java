public class StrategyPatternExample {

    
    public interface DiscountStrategy {
        double calculateDiscount(double price);
    }

   
    public static class RegularCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double price) {
            return price * 0.05; 
        }
    }

   
    public static class VIPCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double price) {
            return price * 0.10; 
        }
    }

    
    public static class SeasonalCustomerDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double price) {
            return price * 0.15; 
        }
    }

   
    public static class DiscountContext {
        private DiscountStrategy discountStrategy;

       
        public void setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

       
        public double applyDiscount(double price) {
            if (discountStrategy == null) {
                throw new IllegalStateException("Discount strategy not set.");
            }
            return price - discountStrategy.calculateDiscount(price);
        }
    }

    
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();

        
        context.setDiscountStrategy(new RegularCustomerDiscount());
        System.out.println("Price after Regular Customer discount: " + context.applyDiscount(100.0));

       
        context.setDiscountStrategy(new VIPCustomerDiscount());
        System.out.println("Price after VIP Customer discount: " + context.applyDiscount(100.0));

       
        context.setDiscountStrategy(new SeasonalCustomerDiscount());
        System.out.println("Price after Seasonal Customer discount: " + context.applyDiscount(100.0));
    }
}
