package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User michal = new Millenials("Michal Rys");
        User adam = new ZGeneration("Adam W");
        User ewelina = new YGeneration("Ewelina Z");

        //When
        String michalSocialMedia = michal.sharePost();
        System.out.println(michalSocialMedia);
        String adamSocialMedia = adam.sharePost();
        System.out.println(adamSocialMedia);
        String ewelinaSocialMedia = ewelina.sharePost();
        System.out.println(ewelinaSocialMedia);

        //Then
        assertEquals("Welcome in Snapchat", michalSocialMedia);
        assertEquals("Welcome in Facebook", adamSocialMedia);
        assertEquals("Welcome in Twitter", ewelinaSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User michal = new Millenials("Michal Rys");

        //When
        String michalSocialMedia = michal.sharePost();
        System.out.println(michalSocialMedia);
        michal.shareSocialMedia(new FacebookPublisher());
        michalSocialMedia = michal.sharePost();
        System.out.println(michalSocialMedia);

        //Then
        assertEquals("Welcome in Facebook", michalSocialMedia);
    }
}
