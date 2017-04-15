package com.htisolutions.jsonparser.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.htisolutions.jsonparser.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping()
public class JsonParserController {


    @RequestMapping()
    public String index() {
        return "views/parser";
    }


    @PostMapping("/")
    public String handleFileUpload(
            @RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes
    ) {

        String response = "Whoops: Something went wrong..";

        try {
            // get bytes from json file
            byte[] jsonData = file.getBytes();

            // create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // convert JSON string to POJO
            Student student = objectMapper.readValue(jsonData, Student.class);

            response = String.format("You successfully parsed: Student (%s %s)", student.getForename(), student.getSurname());

            redirectAttributes.addFlashAttribute("student", student);
            redirectAttributes.addFlashAttribute("response", response);
            return "redirect:/";

        } catch (Exception ex) {
            // Exception
        }

        redirectAttributes.addFlashAttribute("response", response);
        return "redirect:/";
    }
}
