package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "999") int count, Model model) {
        if (count < 5 && count>0) {
            model.addAttribute("carL", carService.carsCount(count));
        } else {
            model.addAttribute("carL", carService.carsCount(999));
        }
        return "car";
    }
}
