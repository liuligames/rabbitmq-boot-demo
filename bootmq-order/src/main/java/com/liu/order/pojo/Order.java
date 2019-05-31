package com.liu.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Order
 *
 * @author liu
 * @date 2018/8/9 15:56
 */
@Data
public class Order implements Serializable {

    Set set = new HashSet();
    Set set1 = new TreeSet();

    private Long id;

    private Double price;

    private String remark;
}
