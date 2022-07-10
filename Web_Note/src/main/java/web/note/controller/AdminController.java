package web.note.controller;

import lombok.RequiredArgsConstructor;
import web.note.model.User;
import web.note.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final UserService userService;

    @GetMapping("/admin")
    public String getUsers(Model model, Principal principal) {
        model.addAttribute("allUsers", userService.getUsers());
        User user = userService.getUser(principal.getName());
        model.addAttribute("user", user);
        model.addAttribute("getList", "false");
        return "admin";
    }

    @PostMapping
    private String deleteUser(@RequestParam(defaultValue = "") Long id,
                              @RequestParam(defaultValue = "") String action,
                              Model model) {
        if ("delete".equals(action)) {
            userService.deleteUser(id);
        }
        return "redirect:/";
    }
}