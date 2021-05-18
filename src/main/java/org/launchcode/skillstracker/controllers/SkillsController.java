package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String printsSkills() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String printForm() {
        return "<form method='post'>" +
                "<label>Name: <div><input type='text' name='name'></label></div>" +
                "<label>My favorite language:" +
                "<div><select name='firstLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select></div>" +
                "<label>My second favorite language:" +
                "<div><select name='secondLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select></div>" +
                "<label>My third favorite language:" +
                "<div><select name='thirdLang'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option></select></div>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
    }

    @PostMapping("form")
    public String printInfo(@RequestParam String name, @RequestParam String firstLang, @RequestParam String secondLang, @RequestParam String thirdLang) {
        return  "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>";
    }
}
