package com.example.shop1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

  private final ItemRepository itemRepository;

  @GetMapping("/list")
  String list(Model model){
    List<Item> result = itemRepository.findAll();
    model.addAttribute("items", result);
    System.out.println(result);
    return "list.html";
  }
}
