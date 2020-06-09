package com.zhangqi.mothercountry.utils;

import com.zhangqi.mothercountry.dao.ScoreDao;
import com.zhangqi.mothercountry.pojo.Score;
import com.zhangqi.mothercountry.vo.RedisTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.LinkedList;
import java.util.List;

@Component
public class TopUtil {

    @Autowired
    private ScoreDao scoreDao;

    public  List<Score> top(){
        List<Score> scores = scoreDao.showAll();
        Jedis jedis = new Jedis("localhost");

        /*
         * 排名前十写入redis,对象序列化
         * */
        jedis.set(RedisTop.FIRST.getBytes(), SerializeUtil.serizlize(scores.get(0)));
        jedis.set(RedisTop.SECOND.getBytes(), SerializeUtil.serizlize(scores.get(1)));
        jedis.set(RedisTop.THIRD.getBytes(), SerializeUtil.serizlize(scores.get(2)));
        jedis.set(RedisTop.FOURTH.getBytes(), SerializeUtil.serizlize(scores.get(3)));
        jedis.set(RedisTop.FIFTH.getBytes(), SerializeUtil.serizlize(scores.get(4)));
        jedis.set(RedisTop.SIXTH.getBytes(), SerializeUtil.serizlize(scores.get(5)));
        jedis.set(RedisTop.SEVENTH.getBytes(), SerializeUtil.serizlize(scores.get(6)));
        jedis.set(RedisTop.EIGHTH.getBytes(), SerializeUtil.serizlize(scores.get(7)));
        jedis.set(RedisTop.NINTH.getBytes(), SerializeUtil.serizlize(scores.get(8)));
        jedis.set(RedisTop.TENTH.getBytes(), SerializeUtil.serizlize(scores.get(9)));

        /*
         * 从redis中读取前十数据，对象反序列化
         * */
        byte[] bytes1 = jedis.get(RedisTop.FIRST.getBytes());
        Score top1 = (Score) SerializeUtil.deserialize(bytes1);
        byte[] bytes2 = jedis.get(RedisTop.SECOND.getBytes());
        Score top2 = (Score) SerializeUtil.deserialize(bytes2);
        byte[] bytes3 = jedis.get(RedisTop.THIRD.getBytes());
        Score top3 = (Score) SerializeUtil.deserialize(bytes3);
        byte[] bytes4 = jedis.get(RedisTop.FOURTH.getBytes());
        Score top4 = (Score) SerializeUtil.deserialize(bytes4);
        byte[] bytes5 = jedis.get(RedisTop.FIFTH.getBytes());
        Score top5 = (Score) SerializeUtil.deserialize(bytes5);
        byte[] bytes6 = jedis.get(RedisTop.SIXTH.getBytes());
        Score top6 = (Score) SerializeUtil.deserialize(bytes6);
        byte[] bytes7 = jedis.get(RedisTop.SEVENTH.getBytes());
        Score top7 = (Score) SerializeUtil.deserialize(bytes7);
        byte[] bytes8 = jedis.get(RedisTop.EIGHTH.getBytes());
        Score top8 = (Score) SerializeUtil.deserialize(bytes8);
        byte[] bytes9 = jedis.get(RedisTop.NINTH.getBytes());
        Score top9 = (Score) SerializeUtil.deserialize(bytes9);
        byte[] bytes10 = jedis.get(RedisTop.TENTH.getBytes());
        Score top10 = (Score) SerializeUtil.deserialize(bytes10);

        jedis.close();

        LinkedList<Score> list = new LinkedList<>();
        list.add(top1);
        list.add(top2);
        list.add(top3);
        list.add(top4);
        list.add(top5);
        list.add(top6);
        list.add(top7);
        list.add(top8);
        list.add(top9);
        list.add(top10);
        //System.out.println(list.get(1).getScore() );
        return list;
    }

}
