package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    private CarServiceImpl сarServiceImpl;

    @GetMapping(value = "/cars")
    public String print(ModelMap model) {
        model.addAttribute("car", сarServiceImpl.index());
        return "cars";
    }

    @GetMapping(value = "/cars", params = "count")
    public String print(@RequestParam("count") int id, Model model) {
        model.addAttribute("car", сarServiceImpl.getCars(id));
        return "cars";
    }
}
