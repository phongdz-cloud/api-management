package com.example.common.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class PageResponse<T> {
    private List<T> content;
    private int size;
    private long totalElements;
    private int totalPages;
    private int number;

    // constructor, getter, setter
    public PageResponse(Page<T> page) {
        this.content = page.getContent();
        this.size = page.getSize();
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.number = page.getNumber();
    }
}
