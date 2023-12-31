package com.example.manager.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project", schema="public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    private Long uid;
    private String team;
    private String status;
    private String title;
    private String description;
}
