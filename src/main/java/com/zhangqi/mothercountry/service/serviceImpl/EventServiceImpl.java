package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.EventDao;
import com.zhangqi.mothercountry.pojo.Event;
import com.zhangqi.mothercountry.service.EventService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDao eventDao;


    @Override
    public ResponseVo insert(Event event) {
        int insert = eventDao.insert(event);
        return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage());
    }
}
