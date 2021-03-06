package com.exercise;

import com.exercise.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ExerciseApplication.class)
class ExerciseApplicationTest {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        assertThat(helloController).isNotNull();
    }

}
