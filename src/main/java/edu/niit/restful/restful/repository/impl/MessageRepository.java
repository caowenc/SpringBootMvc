package edu.niit.restful.restful.repository.impl;

/**
 * @author : 曹闻
 * @date : 2020/3/29 19:23
 * @description :
 */

import edu.niit.restful.restful.pojo.Message;

import java.util.List;



public interface MessageRepository {
    List<Message> findAll();

    Message findOne(Long id);

    Message save(Message message);

    void delete(Long id);

    Message update(Message message);

    Message updateText(Message message);
}