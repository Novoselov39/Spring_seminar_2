package ru.gb.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Homework {

  /**
   * Напрограммировать электронную очередь.
   * 1. Класс TicketNumberGenerator - бин (синглтон), у которого есть метод createNewNumber()
   * 1.1 Метод createNewNumber возвращает строки вида "Ticket #X", где X - UUID (UUID.randomUUID().toString())
   *
   * Пример:
   * TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
   * System.out.println(generator.createNewNumber()); // "Ticket #b0b3a25d-2135-4b18-9dec-08d494b96b06"
   * System.out.println(generator.createNewNumber()); // "Ticket #379c5673-50c3-4daf-a53f-a396a3d34535"
   * System.out.println(generator.createNewNumber()); // "Ticket #b4cc4e55-69b2-4c49-867f-09735fea292a"
   *
   * 2. Создать класс Ticket (не бин!!!) с полями:
   * 2.1. String number - номер тикета
   * 2.2. LocalDateTime createdAt -  создания
   * 2.3. ... (любые другие поля)дата
   *
   * 3. Класс "Табло" - бин (синглтон), у которого есть поле ticketNumberGenerator
   *    и метод метод newTicket(), который создает объетк класса Ticket с значениями полей:
   * 3.1 number - результат вызова TicketNumberGenerator#createNewNumber
   * 3.2 createdAt - LocalDateTime.now()
   * 3.3 ...
   */

  public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(Homework.class, args);

//      System.out.println(context.getBean(TicketNumberGenerator.class).createNewNumber());
      context.getBean(Board.class).newTicket();
      context.getBean(Board.class).newTicket();
      context.getBean(Board.class).newTicket();

  }

}
