package pro.sky.marketbucket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.marketbucket.service.BucketServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/order")
public class BucketController {

    private final BucketServiceImpl bucketService;

    public BucketController(BucketServiceImpl bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Integer id) {
        bucketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return bucketService.getBucketList();
    }


}
