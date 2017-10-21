package com.gameOfThrones.core.controllers;

import com.gameOfThrones.contsants.Serials;
import com.gameOfThrones.core.AppConfig;
import com.gameOfThrones.model.RecommendationForSerial;
import com.gameOfThrones.sdk.services.UserSdkService;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static com.gameOfThrones.contsants.Serials.GAME_OF_THRONES;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Matchers.anyString;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * Created by Evegeny on 21/12/2016.
 */
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = RANDOM_PORT, properties = {"userServiceHome=http://localhost:8082"})

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = AppConfig.class)
public class RecommendationControllerTest{
    @Autowired
    private TestRestTemplate restTemplate;

//    @Autowired
//    private UserSdkService userSdkService;

    @Test
    public void getPublicOpinion() throws Exception {
        RecommendationForSerial recommendationForSerial = restTemplate.getForObject("/gameOfThrones/recommendations", RecommendationForSerial.class);
        Assert.assertNotNull(recommendationForSerial);
      /*  Mockito.when(userSdkService.countUsersWhichRecommends(anyString())).
                thenReturn(RecommendationForSerial.builder().possitiveUsers(10).totalUsers(10).build());*/
/*

        mockMvc.perform(
                get("/gameOfThrones/recommendations"))
                .andExpect(jsonPath("$.possitiveUsers", equalTo(10)))
                .andExpect(jsonPath("$.totalUsers", equalTo(10)));
*/

    }

}