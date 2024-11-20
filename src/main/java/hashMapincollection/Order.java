package hashMapincollection;

import java.util.Objects;

public class Order {
        private String orderID;
        private String customerName;

        public Order(String orderID, String customerName) {
            this.orderID = orderID;
            this.customerName = customerName;
        }

        @Override
        public int hashCode() {
            //return Objects.hash(orderID);
            return Objects.hash(orderID);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Order order = (Order) obj;
            return orderID.equals(order.orderID);
        }
    }


