package edu.niit.restful.restful.service.impl;

/**
 * @author : 曹闻
 * @date : 2020/3/29 19:39
 * @description :
 */
import edu.niit.restful.restful.pojo.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();

    Message findOne(Long id);

    Message save(Message message);

    void delete(Long id);

    Message update(Message message);

    Message updateText(Message message);
}