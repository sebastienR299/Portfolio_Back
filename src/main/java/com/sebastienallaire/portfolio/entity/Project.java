package com.sebastienallaire.portfolio.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "project")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_new")
    private boolean isNew;

    @Column(name = "is_published")
    private boolean isPublished;

    @Column(name = "tag")
    private String tag;

    @Column(name = "slug")
    private String slug;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "project_link")
    private String projectLink;

    @ManyToMany
    @JoinTable(name = "project_categories",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id"))
    private Set<Category> categories = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "project", orphanRemoval = true)
    private Set<Picture> pictures = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id.equals(project.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isNew=" + isNew +
                ", isPublished=" + isPublished +
                ", tag='" + tag + '\'' +
                ", slug='" + slug + '\'' +
                ", githubLink='" + githubLink + '\'' +
                ", projectLink='" + projectLink + '\'' +
                '}';
    }

}
