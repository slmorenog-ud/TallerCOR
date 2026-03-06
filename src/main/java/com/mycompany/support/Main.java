/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.support;

import com.mycompany.support.handler.*;
import com.mycompany.support.model.*;

public class Main {

    public static void main(String[] args) {
        
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();

        //Construir correctamente la cadena

        Request r1 = new Request(Priority.BASIC);
        Request r2 = new Request(Priority.INTERMEDIATE);
        Request r3 = new Request(Priority.CRITICAL);

        // Hacer el procesar de las solicitudes
    }
}
