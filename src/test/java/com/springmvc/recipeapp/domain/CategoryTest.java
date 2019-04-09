package com.springmvc.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mycol on 09 Apr, 2019
 */
public class CategoryTest {

    Category category;
    Long idValue = 4L;
    @Before
    public void setUp(){
        category = new Category();


    }

    @Test
    public void getId() throws Exception {
        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

}