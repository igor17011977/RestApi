package dz30.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("allorders")
public class RESTcontroller{
    static OrderRepositori orderRepositori=new OrderRepositori();
    @GetMapping
    public String getAll(){
        return orderRepositori.getAll();
    }
    @GetMapping("{id}")
    public String getID(@PathVariable String id){
        return orderRepositori.getOrder(Integer.parseInt(id)).toString();
    }
}
