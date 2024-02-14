package org.fyhr.sebsmealplanner.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Ingredient")
public class Ingredient {

    @Id
    @Column(name = "ingredient_name")
    private String ingredientName;


    @Column(name="energy_kcal_per_100_gram ")
    private int kcalPer100g;

    @Column(name="fats_g")
    private double fats_g;

    @Column(name="protein_g")
    private double protein_g;

    @Column(name="carbohydrates_g")
    private double carbohydrates_g;

    @Column(name="fiber_g")
    private double fiber_g;

    @Column(name="sugars_g")
    private double sugars_g;

    @Column(name="sugars_added_g")
    private double sugars_added_g;

    @Column(name="wholegrains_g")
    private double wholegrains_g;

    @Column(name="cholesterol_mg")
    private double cholesterol_mg;

    @Column(name="vitamin_a_µg")
    private double vitamin_a_µg;

    @Column(name="retinol_µg")
    private double retinol_µg;

    @Column(name="betakaroten_µg")
    private double betakaroten_µg;

    @Column(name="vitamin_d_µg")
    private double vitamin_d_µg;

    @Column(name="vitamin_e_mg")
    private double vitamin_e_mg;

    @Column(name="vitamin_k_µg")
    private double vitamin_k_µg;

    @Column(name="thiamine_mg")
    private double thiamine_mg;

    @Column(name="riboflavin_mg")
    private double riboflavin_mg;

    @Column(name="niacin_mg")
    private double niacin_mg;

    @Column(name="vitamin_b6_mg")
    private double vitamin_b6_mg;

    @Column(name="folat_µg")
    private double folat_µg;

    @Column(name="vitamin_b12_µg")
    private double vitamin_b12_µg;

    @Column(name="vitamin_c_mg")
    private double vitamin_c_mg;

    @Column(name="phosphorus_mg")
    private double phosphorus_mg;

    @Column(name="iodine_µg")
    private double iodine_µg;

    @Column(name="iron_mg")
    private double iron_mg;

    @Column(name="calcium_mg")
    private double calcium_mg;

    @Column(name="potassium_mg")
    private double potassium_mg;

    @Column(name="magnesium_mg")
    private double magnesium_mg;

    @Column(name="sodium_mg")
    private double sodium_mg;

    @Column(name="salt_g")
    private double salt_g;

    @Column(name="selenium_µg")
    private double selenium_µg;

    @Column(name="zinc_mg")
    private double zinc_mg;

    public Ingredient(){

    }

    public Ingredient(String ingredientName, int kcalPer100g, double fats_g, double protein_g, double carbohydrates_g, double fiber_g, double sugars_g,
                      double sugars_added_g, double wholegrains_g, double cholesterol_mg, double vitamin_a_µg, double retinol_µg, double betakaroten_µg,
                      double vitamin_d_µg, double vitamin_e_mg, double vitamin_k_µg, double thiamine_mg, double riboflavin_mg, double niacin_mg, double vitamin_b6_mg,
                      double folat_µg, double vitamin_b12_µg, double vitamin_c_mg, double phosphorus_mg, double iodine_µg, double iron_mg, double calcium_mg,
                      double potassium_mg, double magnesium_mg, double sodium_mg, double salt_g, double selenium_µg, double zinc_mg) {
        this.ingredientName = ingredientName;
        this.kcalPer100g = kcalPer100g;
        this.fats_g = fats_g;
        this.protein_g = protein_g;
        this.carbohydrates_g = carbohydrates_g;
        this.fiber_g = fiber_g;
        this.sugars_g = sugars_g;
        this.sugars_added_g = sugars_added_g;
        this.wholegrains_g = wholegrains_g;
        this.cholesterol_mg = cholesterol_mg;
        this.vitamin_a_µg = vitamin_a_µg;
        this.retinol_µg = retinol_µg;
        this.betakaroten_µg = betakaroten_µg;
        this.vitamin_d_µg = vitamin_d_µg;
        this.vitamin_e_mg = vitamin_e_mg;
        this.vitamin_k_µg = vitamin_k_µg;
        this.thiamine_mg = thiamine_mg;
        this.riboflavin_mg = riboflavin_mg;
        this.niacin_mg = niacin_mg;
        this.vitamin_b6_mg = vitamin_b6_mg;
        this.folat_µg = folat_µg;
        this.vitamin_b12_µg = vitamin_b12_µg;
        this.vitamin_c_mg = vitamin_c_mg;
        this.phosphorus_mg = phosphorus_mg;
        this.iodine_µg = iodine_µg;
        this.iron_mg = iron_mg;
        this.calcium_mg = calcium_mg;
        this.potassium_mg = potassium_mg;
        this.magnesium_mg = magnesium_mg;
        this.sodium_mg = sodium_mg;
        this.salt_g = salt_g;
        this.selenium_µg = selenium_µg;
        this.zinc_mg = zinc_mg;
    }


    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getKcalPer100g() {
        return kcalPer100g;
    }

    public void setKcalPer100g(int kcalPer100g) {
        this.kcalPer100g = kcalPer100g;
    }

    public double getFats_g() {
        return fats_g;
    }

    public void setFats_g(double fats_g) {
        this.fats_g = fats_g;
    }

    public double getProtein_g() {
        return protein_g;
    }

    public void setProtein_g(double protein_g) {
        this.protein_g = protein_g;
    }

    public double getCarbohydrates_g() {
        return carbohydrates_g;
    }

    public void setCarbohydrates_g(double carbohydrates_g) {
        this.carbohydrates_g = carbohydrates_g;
    }

    public double getFiber_g() {
        return fiber_g;
    }

    public void setFiber_g(double fiber_g) {
        this.fiber_g = fiber_g;
    }

    public double getSugars_g() {
        return sugars_g;
    }

    public void setSugars_g(double sugars_g) {
        this.sugars_g = sugars_g;
    }

    public double getSugars_added_g() {
        return sugars_added_g;
    }

    public void setSugars_added_g(double sugars_added_g) {
        this.sugars_added_g = sugars_added_g;
    }

    public double getWholegrains_g() {
        return wholegrains_g;
    }

    public void setWholegrains_g(double wholegrains_g) {
        this.wholegrains_g = wholegrains_g;
    }

    public double getCholesterol_mg() {
        return cholesterol_mg;
    }

    public void setCholesterol_mg(double cholesterol_mg) {
        this.cholesterol_mg = cholesterol_mg;
    }

    public double getVitamin_a_µg() {
        return vitamin_a_µg;
    }

    public void setVitamin_a_µg(double vitamin_a_µg) {
        this.vitamin_a_µg = vitamin_a_µg;
    }

    public double getRetinol_µg() {
        return retinol_µg;
    }

    public void setRetinol_µg(double retinol_µg) {
        this.retinol_µg = retinol_µg;
    }

    public double getBetakaroten_µg() {
        return betakaroten_µg;
    }

    public void setBetakaroten_µg(double betakaroten_µg) {
        this.betakaroten_µg = betakaroten_µg;
    }

    public double getVitamin_d_µg() {
        return vitamin_d_µg;
    }

    public void setVitamin_d_µg(double vitamin_d_µg) {
        this.vitamin_d_µg = vitamin_d_µg;
    }

    public double getVitamin_e_mg() {
        return vitamin_e_mg;
    }

    public void setVitamin_e_mg(double vitamin_e_mg) {
        this.vitamin_e_mg = vitamin_e_mg;
    }

    public double getVitamin_k_µg() {
        return vitamin_k_µg;
    }

    public void setVitamin_k_µg(double vitamin_k_µg) {
        this.vitamin_k_µg = vitamin_k_µg;
    }

    public double getThiamine_mg() {
        return thiamine_mg;
    }

    public void setThiamine_mg(double thiamine_mg) {
        this.thiamine_mg = thiamine_mg;
    }

    public double getRiboflavin_mg() {
        return riboflavin_mg;
    }

    public void setRiboflavin_mg(double riboflavin_mg) {
        this.riboflavin_mg = riboflavin_mg;
    }

    public double getNiacin_mg() {
        return niacin_mg;
    }

    public void setNiacin_mg(double niacin_mg) {
        this.niacin_mg = niacin_mg;
    }

    public double getVitamin_b6_mg() {
        return vitamin_b6_mg;
    }

    public void setVitamin_b6_mg(double vitamin_b6_mg) {
        this.vitamin_b6_mg = vitamin_b6_mg;
    }

    public double getFolat_µg() {
        return folat_µg;
    }

    public void setFolat_µg(double folat_µg) {
        this.folat_µg = folat_µg;
    }

    public double getVitamin_b12_µg() {
        return vitamin_b12_µg;
    }

    public void setVitamin_b12_µg(double vitamin_b12_µg) {
        this.vitamin_b12_µg = vitamin_b12_µg;
    }

    public double getVitamin_c_mg() {
        return vitamin_c_mg;
    }

    public void setVitamin_c_mg(double vitamin_c_mg) {
        this.vitamin_c_mg = vitamin_c_mg;
    }

    public double getPhosphorus_mg() {
        return phosphorus_mg;
    }

    public void setPhosphorus_mg(double phosphorus_mg) {
        this.phosphorus_mg = phosphorus_mg;
    }

    public double getIodine_µg() {
        return iodine_µg;
    }

    public void setIodine_µg(double iodine_µg) {
        this.iodine_µg = iodine_µg;
    }

    public double getIron_mg() {
        return iron_mg;
    }

    public void setIron_mg(double iron_mg) {
        this.iron_mg = iron_mg;
    }

    public double getCalcium_mg() {
        return calcium_mg;
    }

    public void setCalcium_mg(double calcium_mg) {
        this.calcium_mg = calcium_mg;
    }

    public double getPotassium_mg() {
        return potassium_mg;
    }

    public void setPotassium_mg(double potassium_mg) {
        this.potassium_mg = potassium_mg;
    }

    public double getMagnesium_mg() {
        return magnesium_mg;
    }

    public void setMagnesium_mg(double magnesium_mg) {
        this.magnesium_mg = magnesium_mg;
    }

    public double getSodium_mg() {
        return sodium_mg;
    }

    public void setSodium_mg(double sodium_mg) {
        this.sodium_mg = sodium_mg;
    }

    public double getSalt_g() {
        return salt_g;
    }

    public void setSalt_g(double salt_g) {
        this.salt_g = salt_g;
    }

    public double getSelenium_µg() {
        return selenium_µg;
    }

    public void setSelenium_µg(double selenium_µg) {
        this.selenium_µg = selenium_µg;
    }

    public double getZinc_mg() {
        return zinc_mg;
    }

    public void setZinc_mg(double zinc_mg) {
        this.zinc_mg = zinc_mg;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", kcalPer100g=" + kcalPer100g +
                ", fats_g=" + fats_g +
                ", protein_g=" + protein_g +
                ", carbohydrates_g=" + carbohydrates_g +
                ", fiber_g=" + fiber_g +
                ", sugars_g=" + sugars_g +
                ", sugars_added_g=" + sugars_added_g +
                ", wholegrains_g=" + wholegrains_g +
                ", cholesterol_mg=" + cholesterol_mg +
                ", vitamin_a_µg=" + vitamin_a_µg +
                ", retinol_µg=" + retinol_µg +
                ", betakaroten_µg=" + betakaroten_µg +
                ", vitamin_d_µg=" + vitamin_d_µg +
                ", vitamin_e_mg=" + vitamin_e_mg +
                ", vitamin_k_µg=" + vitamin_k_µg +
                ", thiamine_mg=" + thiamine_mg +
                ", riboflavin_mg=" + riboflavin_mg +
                ", niacin_mg=" + niacin_mg +
                ", vitamin_b6_mg=" + vitamin_b6_mg +
                ", folat_µg=" + folat_µg +
                ", vitamin_b12_µg=" + vitamin_b12_µg +
                ", vitamin_c_mg=" + vitamin_c_mg +
                ", phosphorus_mg=" + phosphorus_mg +
                ", iodine_µg=" + iodine_µg +
                ", iron_mg=" + iron_mg +
                ", calcium_mg=" + calcium_mg +
                ", potassium_mg=" + potassium_mg +
                ", magnesium_mg=" + magnesium_mg +
                ", sodium_mg=" + sodium_mg +
                ", salt_g=" + salt_g +
                ", selenium_µg=" + selenium_µg +
                ", zinc_mg=" + zinc_mg +
                '}';
    }
}
