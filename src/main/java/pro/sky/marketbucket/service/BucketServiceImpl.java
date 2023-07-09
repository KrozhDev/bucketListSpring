package pro.sky.marketbucket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.marketbucket.service.BucketService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@SessionScope
public class BucketServiceImpl implements BucketService {
    private List<Integer> bucketList;

    public BucketServiceImpl() {
        bucketList = new ArrayList<>();

    }

    public void add(Integer id) {
        bucketList.add(id);
    }

    public List<Integer> getBucketList() {
        return bucketList.stream().collect(Collectors.toList());
    }
}
