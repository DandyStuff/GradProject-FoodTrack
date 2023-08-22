package com.vnuk.foodtrack;

import android.content.Context;
import android.database.sqlite.SQLiteException;

public class DBSetupInsert {

    /* Variables */
    private final Context context;

    /* Public Class ------------------------------------------------------ */
    public DBSetupInsert(Context ctx) {
        this.context = ctx;
    }


    /* Setup Insert To Categories ----------------------------------------- */
    // To insert to category table
    public void setupInsertToCategories(String values) {
        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("categories", "_id, category_name, category_parent_id, category_icon, category_note", values);
            db.close();
        } catch (SQLiteException e) {
            // Toast.makeText(context, "Error; Could not insert categories.", Toast.LENGTH_SHORT).show();
        }
    }

    public void insertAllCategories() {
        setupInsertToCategories("NULL, 'Beverages',         '0', '', NULL");
        setupInsertToCategories("NULL, 'Alcoholic Drinks',  '1', '', NULL");
        setupInsertToCategories("NULL, 'Coffee',            '1', '', NULL");
        setupInsertToCategories("NULL, 'Juice',             '1', '', NULL");
        setupInsertToCategories("NULL, 'Soft Drinks',       '1', '', NULL");
        setupInsertToCategories("NULL, 'Tea',               '1', '', NULL");
        setupInsertToCategories("NULL, 'Water',             '1', '', NULL");


        setupInsertToCategories("NULL, 'Dairy',     '0', '', NULL");
        setupInsertToCategories("NULL, 'Butter',    '8', '', NULL");
        setupInsertToCategories("NULL, 'Cheese',    '8', '', NULL");
        setupInsertToCategories("NULL, 'Cream',     '8', '', NULL");
        setupInsertToCategories("NULL, 'Milk',      '8', '', NULL");
        setupInsertToCategories("NULL, 'Yogurt',    '8', '', NULL");


        setupInsertToCategories("NULL, 'Dietary Foods',     '0', '', NULL");
        setupInsertToCategories("NULL, 'Gluten-Free',       '14', '', NULL");
        setupInsertToCategories("NULL, 'High-Fiber',        '14', '', NULL");
        setupInsertToCategories("NULL, 'Lactose-Free',      '14', '', NULL");
        setupInsertToCategories("NULL, 'Low-Sodium',        '14', '', NULL");


        setupInsertToCategories("NULL, 'Fats and Oils', '0', '', NULL");
        setupInsertToCategories("NULL, 'Coconut Oil',   '19', '', NULL");
        setupInsertToCategories("NULL, 'Olive Oil',     '19', '', NULL");


        setupInsertToCategories("NULL, 'Fruits and Vegetables', '0', '', NULL");
        setupInsertToCategories("NULL, 'Berries',               '22', '', NULL");
        setupInsertToCategories("NULL, 'Berries',               '22', '', NULL");
        setupInsertToCategories("NULL, 'Leafy Greens',          '22', '', NULL");
        setupInsertToCategories("NULL, 'Root Vegetables',       '22', '', NULL");
        setupInsertToCategories("NULL, 'Tropical Fruits',       '22', '', NULL");


        setupInsertToCategories("NULL, 'Grains',    '0', '', NULL");
        setupInsertToCategories("NULL, 'Barley',    '28', '', NULL");
        setupInsertToCategories("NULL, 'Oats',      '28', '', NULL");
        setupInsertToCategories("NULL, 'Rice',      '28', '', NULL");
        setupInsertToCategories("NULL, 'Wheat',     '28', '', NULL");


        setupInsertToCategories("NULL, 'Processed Foods',   '0', '', NULL");
        setupInsertToCategories("NULL, 'Canned Foods',      '33', '', NULL");
        setupInsertToCategories("NULL, 'Frozen Meals',      '33', '', NULL");
        setupInsertToCategories("NULL, 'Instant Noodles',   '33', '', NULL");
        setupInsertToCategories("NULL, 'Ready-to-Eat Meals','33', '', NULL");


        setupInsertToCategories("NULL, 'Protein Foods',     '0', '', NULL");
        setupInsertToCategories("NULL, 'Seafood',           '38', '', NULL");
        setupInsertToCategories("NULL, 'Beans',             '38', '', NULL");
        setupInsertToCategories("NULL, 'Meat ',             '38', '', NULL");
        setupInsertToCategories("NULL, 'Nuts and Seeds ',   '38', '', NULL");


        setupInsertToCategories("NULL, 'Sweets and Snacks', '0', '', NULL");
        setupInsertToCategories("NULL, 'Candy',             '43', '', NULL");
        setupInsertToCategories("NULL, 'Chips',             '43', '', NULL");
        setupInsertToCategories("NULL, 'Pastries',          '43', '', NULL");

    }


    /* Setup Insert To Food ----------------------------------------------- */
    // To insert food to food table
    public void setupInsertToFood(String values) {

        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("food",
                    "_id, food_name, food_manufactor_name, food_serving_size_gram, food_serving_size_gram_mesurment, food_serving_size_pcs, food_serving_size_pcs_mesurment, food_energy, food_proteins, food_carbohydrates, food_fat, food_energy_calculated, food_proteins_calculated, food_carbohydrates_calculated, food_fat_calculated, food_user_id, food_barcode, food_category_id, food_thumb, food_image_a, food_image_b, food_image_c, food_notes",
                    values);
            db.close();
        } catch (SQLiteException e) {
            // Toast.makeText(context, "Error; Could not insert food.", Toast.LENGTH_SHORT).show();
        }

    }

    // Insert all food into food database
    public void insertAllFood() {
        setupInsertToFood("NULL, 'Coconut Oil', 'Coconuts', '28', 'gram', '1', 'serving', '890', '32', '0', '99', '249', '9', '0', '28', NULL, NULL, '20', 'NULL', 'NULL', 'NULL', 'NULL', NULL");

    }


}
