package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.CarService;
import web.config.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

        @GetMapping("/cars")
    public String showCar(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
            model.addAttribute("index", carService.showCars(count));
            return "cars";
        }
}
