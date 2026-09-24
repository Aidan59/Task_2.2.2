package web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Car list:");
        //car list logic
        model.addAttribute("messages", messages);
        return "index";
    }

}
