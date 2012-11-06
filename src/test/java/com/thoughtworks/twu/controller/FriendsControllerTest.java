package com.thoughtworks.twu.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FriendsControllerTest {

    private FriendsController friends = new FriendsController();

    @Test
    public void shouldNavigateToFriendsListPage() throws Exception {
        View expectedView = new ModelAndView("/my-friends-list").getView();
        View actualView = friends.listPage().getView();

        assertThat(actualView, is(expectedView));
    }

}