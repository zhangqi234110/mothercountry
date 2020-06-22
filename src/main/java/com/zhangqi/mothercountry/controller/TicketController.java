package com.zhangqi.mothercountry.controller;

import com.zhangqi.mothercountry.pojo.Ticket;
import com.zhangqi.mothercountry.service.TicketService;
import com.zhangqi.mothercountry.utils.InformationGenerator;
import com.zhangqi.mothercountry.utils.SerializeUtil;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    ReentrantLock lock =new ReentrantLock();

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/by")
    public ResponseVo byone(@RequestParam("id") int id){
        Jedis jedis = new Jedis("localhost");
        byte[] bytes = jedis.get("ticket".getBytes());
        Ticket deserialize = (Ticket) SerializeUtil.deserialize(bytes);
        //ResponseVo byone = ticketService.byone(id);
        if (deserialize.getCount()>=1){
            deserialize.setCount(deserialize.getCount()-1);
            jedis.set("ticket".getBytes(),SerializeUtil.serizlize(deserialize));
            jedis.close();
            return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage());

        }else {
            jedis.close();
            String tip="票已售完";
            return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage(),tip);

        }
    }

    @RequestMapping("/by2")
    public ResponseVo by2(@RequestParam("id") int id){
        lock.lock();
        ResponseVo byone = ticketService.byone(id);
        lock.unlock();
        return byone;
    }


}
