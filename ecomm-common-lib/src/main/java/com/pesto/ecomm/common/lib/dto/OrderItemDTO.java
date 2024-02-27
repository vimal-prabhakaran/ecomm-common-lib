package com.pesto.ecomm.common.lib.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.pesto.ecomm.common.lib.enums.ShippingStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderItemDTO {

    private Integer orderItemId;
    private Integer offerId;
    private String sellerName;
    private Integer sellerId;
    private String productName;
    private Integer quantity;
    private Double price;
    private ShippingStatus shippingStatus;

}
