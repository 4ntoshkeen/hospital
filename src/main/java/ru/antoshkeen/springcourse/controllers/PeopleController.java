package ru.antoshkeen.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.antoshkeen.springcourse.models.Person;
import ru.antoshkeen.springcourse.models.Tool;
import ru.antoshkeen.springcourse.services.PeopleService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    //private final PersonDAO personDAO;
    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
        //this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", peopleService.findAll());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {

        model.addAttribute("person", peopleService.findOne(id));
        model.addAttribute("tools", peopleService.getToolsByPersonId(id));

        return "people/show";
    }

    @GetMapping("/{id}/tools")
    public String showTools(@PathVariable("id") int id, Model model) {


        model.addAttribute("person", peopleService.findOne(id));
        List<Tool> tools = peopleService.findAllTools(id);
        model.addAttribute("tools", tools);
        model.addAttribute("id", id);

        return "people/show_tool";
    }


    @GetMapping("/{id}/tools/new")
    public String newTool(@ModelAttribute("tool") Tool tool) {
        return "people/new_tool";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "people/new";
        peopleService.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", peopleService.findOne(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") @Valid Person person, @PathVariable("id") int id, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "people/edit";
        }

        peopleService.update(id, person);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        peopleService.delete(id);
        return "redirect:/people";
    }
}
