package ie.atu.week3_recap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Product {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Product {

        private Long id;

        private String name;

        private double price;
    }

}
