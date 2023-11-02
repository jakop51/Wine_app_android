package com.example.vine_menu_0_0_1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vine_menu_0_0_1.R;
import com.example.vine_menu_0_0_1.model.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    List<Products> products;

    public ProductAdapter(Context context, List<Products> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View productItems = LayoutInflater.from(context).inflate(R.layout.products_item, parent, false);
        return new ProductAdapter.ProductViewHolder(productItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productBg.setBackgroundColor(Color.parseColor(products.get(position).getColor()));

        int imageId = context.getResources().getIdentifier(products.get(position).getImg(), "drawable", context.getPackageName());
        holder.productImage.setImageResource(imageId);

        holder.productsTitle.setText(products.get(position).getTitle());
        holder.percentOfAlcohol.setText(products.get(position).getPercentOfAlcohol());
        holder.priceForBottle.setText(products.get(position).getPriceOfBottle());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{
        LinearLayout productBg;
        ImageView productImage;
        TextView productsTitle, percentOfAlcohol, priceForBottle;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productBg = itemView.findViewById(R.id.productsBg);
            productsTitle = itemView.findViewById(R.id.productsTitle);
            percentOfAlcohol = itemView.findViewById(R.id.percentOfAlcohol);
            priceForBottle = itemView.findViewById(R.id.priceForBottle);
        }
    }

}
