/*
 * package com.rakesh.microservicesintercommunication.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.rakesh.microservicesintercommunication.model.Users; import
 * com.rakesh.microservicesintercommunication.service.FeignClientConsumer;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/feign/users") public class FeignUsageController {
 * 
 * @Autowired private FeignClientConsumer consumer;
 * 
 * @GetMapping("/getDataByFeign") public Users getUser() { return
 * consumer.getUserByFeign();
 * 
 * } }
 */