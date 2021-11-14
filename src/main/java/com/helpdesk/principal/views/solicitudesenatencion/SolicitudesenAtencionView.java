package com.helpdesk.principal.views.solicitudesenatencion;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.helpdesk.principal.views.MainLayout;
import javax.annotation.security.PermitAll;

@PageTitle("Solicitudes en Atencion")
@Route(value = "solicitudes_en_atencion", layout = MainLayout.class)
@PermitAll
public class SolicitudesenAtencionView extends VerticalLayout {

    public SolicitudesenAtencionView() {
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
