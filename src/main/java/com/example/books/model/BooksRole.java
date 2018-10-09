package com.example.books.model;

public class BooksRole {
    private Integer id;

    private String roleName;

    private Integer borrowNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getBorrowNo() {
        return borrowNo;
    }

    public void setBorrowNo(Integer borrowNo) {
        this.borrowNo = borrowNo;
    }
}