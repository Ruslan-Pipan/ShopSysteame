package com.shop.systeme.controler;

import com.shop.systeme.dao.EmailNewSletterRepository;
import com.shop.systeme.model.EmailConsumersHoWantResetEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Email;

@Controller
public class EmailController {

    @Autowired
    private EmailNewSletterRepository emailNewSletterRepository;

    @RequestMapping("/email")
    public String handlerEmailSender(@Email String toEmail, HttpServletRequest request){
        EmailConsumersHoWantResetEmail emailConsumersHoWantResetEmail = new EmailConsumersHoWantResetEmail();
        emailConsumersHoWantResetEmail.setEmail(toEmail);

        emailNewSletterRepository.save(emailConsumersHoWantResetEmail);

        String refresh = request.getHeader("Referer");
        return "redirect:" + refresh;
    }


}
