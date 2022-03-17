package com.kepler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author kepler
 * @Date 2022/3/17 17:15
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long price;
    private String name;
}
