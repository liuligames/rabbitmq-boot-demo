package com.liu.store.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Order
 *
 * @author liu
 * @date 2018/8/9 15:56
 */
@Data
public class Order implements Serializable {

    private Long id;

    private Double price;

    private String remark;
}
