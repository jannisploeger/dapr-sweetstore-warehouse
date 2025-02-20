package dev.ploeger.sweets.warehouse.controler;

import dev.ploeger.sweets.warehouse.model.Sweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WareHouseControler {

    @GetMapping("/inventory")
    public List<Sweet> getInventory(){
        return List.of(
                new Sweet("Chocolate", 1.50, 100),
                new Sweet("Lollypop", 0.50, 1000),
                new Sweet("Gummi", 0.20, 10000)
        );
    }
}
