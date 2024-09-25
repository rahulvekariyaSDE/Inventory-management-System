package com.example.Bill.Generation.Controller;


import com.example.Bill.Generation.Model.OrderDetail;
import com.example.Bill.Generation.Model.ResponseDTO;
import com.example.Bill.Generation.Repository.OrderDetailRepository;
import com.example.Bill.Generation.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @PostMapping("placeOrder")
    public ResponseDTO<OrderDetail>placeorder(@RequestBody OrderDetail orderDetail){
        return orderDetailService.placeOrder(orderDetail);
    }
}
