package org.blog.posts.date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateManager {

    public LocalDate getTomorrow() {
       LocalDate today = LocalDate.now();

       return today.plusDays(1);
    }
}
