package com.mycompany.support.handler;

import com.mycompany.support.model.Request;

public class DefaultSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("No hay un nivel de soporte para la solicitud de prioridad: "
                + request.getPriority());
        handleNext(request);
    }
}
