package com.blog.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "the_loai")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_the_loai")
    private Long id;

    @Column(name = "ten_the_loai")
    private String nameCategory;

    @OneToMany(mappedBy = "category" ,cascade = ALL)
    private List<Blog> blogs;




    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Blog> getListBlog() {
        return blogs;
    }

    public void setListBlog(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
