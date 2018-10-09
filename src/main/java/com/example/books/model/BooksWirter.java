package com.example.books.model; 

public class BooksWirter {
    private Integer id;

    private String writerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName == null ? null : writerName.trim();
    }
}