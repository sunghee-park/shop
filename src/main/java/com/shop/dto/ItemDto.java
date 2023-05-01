package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {

    private Long id;
    private String ItemNm;
    private Integer price;
    private String itemDetail;
    private String sellStarCd;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
