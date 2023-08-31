package com.example.board.controller;

import com.example.board.entity.Language;
import com.example.board.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping("/language/insert")
    public  String MysqlInsert(Language language) {

        return "insert";
    }
    @PostMapping("/language/insertAndList")
    public  String insertAndList(Language language) {

        languageService.insert(language);

        return "redirect:/language/list";
    }

    @GetMapping("/language/list")
    public String languageList(Model model) {

        model.addAttribute("list", languageService.languageList());

        return "languagelist";
    }

    @GetMapping("/language/detail")
    public String languageDetail(Model model, Integer language_id){

        model.addAttribute("record", languageService.languageDetail(language_id));
        return "languagedetail";
    }

    @GetMapping("/language/delete")
    public String languageDelete(Integer language_id) {

        languageService.languageDelete(language_id);
        return "redirect:/language/list";
    }

    @GetMapping("/language/update_text/{language_id}")
    public String languageUpdate(@PathVariable("language_id") Integer language_id, Model model) {

        model.addAttribute("language", languageService.languageDetail(language_id));

        return "languageupdate";
    }

    @PostMapping("/language/update/{language_id}")
    public String languageUpdate(@PathVariable("language_id") Integer language_id, Language language) {

        Language languageUp = languageService.languageDetail(language_id);
        languageUp.setName(language.getName());
        languageUp.setLast_update(language.getLast_update());

        languageService.insert(languageUp);

        return "redirect:/language/list";
    }
}
