package com.qual.store.dto.lazyDto;

import com.qual.store.dto.OrderItemDto;
import com.qual.store.dto.base.BaseDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderWithOrderItemDto extends BaseDto implements Serializable {
    private double deliveryPrice;
    private LocalDate startDate;
    private LocalDate deliveryDate;
    private String status;
    private Long userId;
    private String userName;
    private String userEmail;
    private List<OrderItemDto> orderItems;
}
