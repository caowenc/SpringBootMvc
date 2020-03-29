package edu.niit.restful.restful.exception;

import edu.niit.restful.restful.common.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author : 曹闻
 * @date : 2020/3/26 08:39
 * @description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CustomException   extends RuntimeException{
     /**错误码*/
     protected  Integer code;
     /**错误信息*/
     protected  String message;

    public CustomException(ExceptionType type){
         this.code=type.getCode();
         this.message=type.getMsg();
     }

}
