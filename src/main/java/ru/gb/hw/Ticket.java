package ru.gb.hw;

//  * 2. Создать класс Ticket (не бин!!!) с полями:
//   * 2.1. String number - номер тикета
//   * 2.2. LocalDateTime createdAt - дата создания
//   * 2.3. ... (любые другие поля)
//        *

import java.time.LocalDateTime;

public class Ticket {
    private String number;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
