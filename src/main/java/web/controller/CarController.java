package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String allCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("carsList",
                count == null || count >= 5
                        ? carService.carsList()
                        : carService.showMultipleCars(count));
        return "cars";
    }
}