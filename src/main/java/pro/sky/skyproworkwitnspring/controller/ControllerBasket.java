package pro.sky.skyproworkwitnspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproworkwitnspring.service.ServiceBasket;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerBasket {
    private final ServiceBasket service;

    public ControllerBasket(ServiceBasket service) {//разобраться с эим моментом зачем мы тут прописываем
        this.service = service;
    }

    @GetMapping("/add")
    public String addGood(@RequestParam(required = true) List<Integer> idGood) {
        return "<b>Add new goods </b>" + service.addNewGood(idGood);
    }

    @GetMapping("/get")
    public String getAllGoods() {//все добавленные ID в виде списка JSON
        return "<i>All goods</i>" + service.getAllGoods();
    }
}
