package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.ScoreDao;
import com.zhangqi.mothercountry.pojo.Score;
import com.zhangqi.mothercountry.service.ScoreService;
import com.zhangqi.mothercountry.utils.SerializeUtil;
import com.zhangqi.mothercountry.utils.TopUtil;
import com.zhangqi.mothercountry.vo.RedisTop;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private TopUtil topUtil;

    @Override
    public ResponseVo showAll() {
        List<Score> top = topUtil.top();
        return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage(),top);
    }
}
