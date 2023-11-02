package com.example.vine_menu_0_0_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vine_menu_0_0_1.adapter.CategoryAdapter;
import com.example.vine_menu_0_0_1.adapter.ProductAdapter;
import com.example.vine_menu_0_0_1.model.Category;
import com.example.vine_menu_0_0_1.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, productsRecycler;
    CategoryAdapter categoryAdapter;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(0, "Вид напитка"));
        categoryList.add(new Category(1, "Страна"));
        categoryList.add(new Category(2, "Регион"));
        categoryList.add(new Category(3, "Подрегион"));
        categoryList.add(new Category(4, "Сорт"));

        setCategoryRecycler(categoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(0, "vine_icon_2", "Вино Aznauri", "9,0-13%", "134 грн", "#661f36"));
        productsList.add(new Products(1, "vine_icon_2", "Et Cetera Merlot", "14%", "714 грн", "#661f36"));

        setProductsRecycler(productsList);
    }

    private void setProductsRecycler(List<Products> productsList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productsRecycler = findViewById(R.id.productsRecycler);
        productsRecycler.setLayoutManager(layoutManager);

        productAdapter = new ProductAdapter(this, productsList);
        productsRecycler.setAdapter(productAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}