package pro.sky.skyproworkwitnspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproworkwitnspring.service.impl.ServiceBasketImpl;

@RestController
@RequestMapping("/store/order")
public class ControllerBasket {
    private final ServiceBasketImpl service;//прописываем тк его не увидит контроллер

    public ControllerBasket(ServiceBasketImpl service) {//разобраться с эим моментом зачем мы тут прописываем
        this.service = service;
    }

    @GetMapping("/add")
    public String addGood(@RequestParam(required = true) int idClient, @RequestParam(required = true) int idGood) {//1 или несколько id должно быть
        return "<b>Add new goods </b>" + service.addNewGood(idClient, idGood);
    }

    @GetMapping("/get")
    public String getAllGoods() {//все добавленные ID в виде списка JSON
        return "<i>All goods</i>" + service.getAllGoods();
    }
}
