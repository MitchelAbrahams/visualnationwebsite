package com.visualnation.entities;


import javax.persistence.*;

@Entity
@Table(name="news_item")
public class NewsItem {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="date")
    private String date;

    @Column(name="title")
    private String title;

    @Column(name="item")
    private String item;


    public NewsItem(){

    }

    public NewsItem(String date, String title, String item) {
        this.date = date;
        this.title = title;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
