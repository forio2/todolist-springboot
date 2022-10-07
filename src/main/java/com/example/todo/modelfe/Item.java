package com.example.todo.modelfe;


enum Status {
    ACTIVE, COMPLETED, DELETED
        }
public class Item {

    private Long id;
    private String description;
    private Status status;
    private Integer order;
    private User userItem;

    public Item(Long id, String description, Status status, Integer order, User userItem) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.order = order;
        this.userItem = userItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public User getUserItem() {
        return userItem;
    }

    public void setUserItem(User userItem) {
        this.userItem = userItem;
    }
}
