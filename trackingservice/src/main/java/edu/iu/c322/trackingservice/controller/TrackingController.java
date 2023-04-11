package edu.iu.c322.trackingservice.controller;

import edu.iu.c322.trackingservice.model.Tracking;
import edu.iu.c322.trackingservice.repository.TrackingInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping

public class TrackingController {
    private TrackingInfoRepository repository;
    public TrackingController(TrackingInfoRepository repository){
        this.repository=repository;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{orderId}")
    public void update(@RequestBody Tracking tracking, @PathVariable int orderId){
        tracking.setOrderId(orderId);
        tracking.setDate(new Date());
        repository.save(tracking);
    }

}
