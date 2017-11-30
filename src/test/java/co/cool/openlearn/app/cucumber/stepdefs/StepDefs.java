package co.cool.openlearn.app.cucumber.stepdefs;

import co.cool.openlearn.app.OpenlearnApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OpenlearnApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
