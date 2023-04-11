package edu.iu.c322.trackingservice.repository;

import edu.iu.c322.trackingservice.model.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class TrackingInfoRepository extends JpaRepository<Tracking, Long>{
    List<Tracking> findByOrderId(String orderId);
}
