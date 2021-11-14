package com.helpdesk.principal.views.solicituddeservicio;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.helpdesk.principal.views.MainLayout;
import javax.annotation.security.PermitAll;

@PageTitle("Solicitud de Servicio")
@Route(value = "solicitud_servicio", layout = MainLayout.class)
@PermitAll
public class SolicituddeServicioView extends VerticalLayout {

    public SolicituddeServicioView() {
        setSpacing(false);

        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("This place intentionally left empty"));
        add(new Paragraph("It’s a place where you can grow your own UI 🤗"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}