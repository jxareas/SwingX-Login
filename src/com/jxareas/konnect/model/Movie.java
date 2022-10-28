package com.jxareas.konnect.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Jon Areas, @jxareas
 */
@Data
@AllArgsConstructor
public class Movie {
  @EqualsAndHashCode.Exclude
    private int id;
    private String title;
    private String description;
}
