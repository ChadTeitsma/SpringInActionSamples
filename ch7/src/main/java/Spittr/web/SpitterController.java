package Spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import Spittr.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Spittr.data.SpitterRepository;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value="/register", method=GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value="/register", method=POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) throws IOException {
            if (errors.hasErrors()) {
                return "registerForm";
            }

            MultipartFile profilePicture = spitter.getProfilePicture();
            profilePicture.transferTo(new File("src/main/webapp/resources/" + profilePicture.getOriginalFilename()));
            spitter.setProfilePictureURL("/resources/" + profilePicture.getOriginalFilename());

            spitterRepository.save(spitter);


            return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value="/{username}", method=GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}