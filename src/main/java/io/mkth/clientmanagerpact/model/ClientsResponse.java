package io.mkth.clientmanagerpact.model;

import java.util.List;

public class ClientsResponse {

    private List<Clients> content;

    private int page;

    private int size;

    private int total;

    private int totalPages;

    public ClientsResponse() {}

    public ClientsResponse(List<Clients> content, int page, int size, int total, int totalPages) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.total = total;
        this.totalPages = totalPages;
    }

    public List<Clients> getContent() {
        return content;
    }

    public void setContent(List<Clients> content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
