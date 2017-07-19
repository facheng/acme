package com.manage.news.jpa.kernel.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
@SequenceGenerator(name = "seq_menu", sequenceName="seq_menu", allocationSize = 1)
public class Menu {

    @Id
    @GeneratedValue(generator = "seq_menu", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "parent_id", insertable = false, updatable = false)
    private Integer parentId;

    @Column(name = "sequence", length = 3)
    private Integer sequence = 0;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "image", length = 100)
    private String image;

    @Column(name = "url", length = 100)
    private String url;

    @Column(name = "description")
    private String description;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Menu parent;

    @OneToMany(cascade = { CascadeType.REFRESH, CascadeType.REMOVE }, fetch = FetchType.LAZY, mappedBy = "parent")
    @OrderBy("sequence asc")
    private List<Menu> childrens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public List<Menu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
    }
}
