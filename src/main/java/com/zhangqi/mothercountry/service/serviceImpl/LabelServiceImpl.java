package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.LabelDao;
import com.zhangqi.mothercountry.pojo.Label;
import com.zhangqi.mothercountry.service.LabelService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Override
    public ResponseVo showAll() {

        List<Label> labels = labelDao.showAll();
        return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage(),labels);
    }

    @Override
    public ResponseVo delete(int id) {
        int delete = labelDao.delete(id);
        return ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage());
    }
}
