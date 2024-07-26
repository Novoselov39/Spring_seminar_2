package ru.gb.hw;

//        * 3. Класс "Табло" - бин (синглтон), у которого есть поле ticketNumberGenerator
//        *    и метод метод newTicket(), который создает объетк класса Ticket с значениями полей:
//        * 3.1 number - результат вызова TicketNumberGenerator#createNewNumber
//        * 3.2 createdAt - LocalDateTime.now()
//        * 3.3 ...

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Board {

    @Autowired
    private TicketNumberGenerator ticketNumberGenerator;

    public void newTicket(){
        Ticket ticket = new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
        System.out.println(ticket);
    }




}
