package com.study.framework.day01;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/hello")
public class HelloWorld extends UI{
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        content.addComponent(new Label("Hello World"));
//        content.addComponent(new Button("click", clickEvent -> clickEvent.getButton().setCaption("you click")));
        content.addComponent(new Button("click button", clickEvent -> Notification.show("clicked")));

       /* content.addComponent(new Button("Push"),addClickListener(
                clickEvent ->
        ));
*/
//                addClickListener(clickEvent -> Notification.show("push")));
//        setContent(new Label("Hello! I'm the root UI!"));
        /*// Create the content root layout for the UI
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        // Display the greeting
        content.addComponent(new Label("Hello World!"));

        // Have a clickable button
        content.addComponent(new Button("Push Me!",
                click -> Notification.show("Pushed!")));*/
    }

}
