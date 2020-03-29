package edu.niit.restful.restful.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 曹闻
 * @date : 2020/3/26 08:37
 * @description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseEntity {
    private int code;
    private  String message;
}
