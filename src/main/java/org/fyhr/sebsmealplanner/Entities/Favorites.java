package org.fyhr.sebsmealplanner.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Favorites")
public class Favorites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="favorite_id")
    private int favoriteId;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="recipe_id")
    private Recipe recipe;

    public Favorites(){}

    public Favorites(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "favoriteId=" + favoriteId +
                ", recipe=" + recipe +
                '}';
    }
}
