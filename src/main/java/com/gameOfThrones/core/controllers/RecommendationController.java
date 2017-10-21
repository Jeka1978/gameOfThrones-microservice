package com.gameOfThrones.core.controllers;

import com.gameOfThrones.contsants.Serials;
import com.gameOfThrones.model.RecommendationForSerial;
import com.gameOfThrones.sdk.services.UserSdkService;
import my.spring.infra.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.gameOfThrones.contsants.Serials.LOST;

/**
 * Created by Evegeny on 21/12/2016.
 */
@RestController
@RequestMapping("/gameOfThrones/")
public class RecommendationController {
    @Autowired
    private UserSdkService userService;

    @GetMapping("recommendations")
    public RecommendationForSerial getPublicOpinion(){
        return userService.countUsersWhichRecommends(Serials.GAME_OF_THRONES);
    }



}
