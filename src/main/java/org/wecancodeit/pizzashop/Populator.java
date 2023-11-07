package org.wecancodeit.pizzashop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.pizzashop.dto.PizzaMenuDto;
import org.wecancodeit.pizzashop.services.PizzaMenuService;

@Component
public class Populator implements CommandLineRunner{
    private PizzaMenuService pizzaMenuService;

    public Populator(PizzaMenuService pizzaMenuService) {
        this.pizzaMenuService = pizzaMenuService;
    }

    @Override
    public void run(String... args) throws Exception {
       PizzaMenuDto dto = new PizzaMenuDto();
       dto.setCategory("Meat");
       dto.setDescription("Description");
       dto.setId(1);
       dto.setName("Pizza good");
       dto.setPrice(8.99);
       pizzaMenuService.createMenu(dto);
       dto = new PizzaMenuDto();
       dto.setCategory("Veg");
       dto.setDescription("Buy me");
       dto.setId(2);
       dto.setName("Veg Pizza good");
       dto.setPrice(8.99);
       pizzaMenuService.createMenu(dto);
       dto = new PizzaMenuDto();
       dto.setCategory("Veg/meat");
       dto.setDescription("Don't Buy me");
       dto.setId(3);
       dto.setName("Veg/meat Pizza good");
       dto.setPrice(8.99);
       pizzaMenuService.createMenu(dto);
    }
    
}
